package id.co.sisteminformasilombabackend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PolmanAstraRepository {
    private Connection oConnection;
    private PreparedStatement oCommand;

    public PolmanAstraRepository(@Value("${spring.datasource.url}") String url,
                              @Value("${spring.datasource.username}") String username,
                              @Value("${spring.datasource.password}") String password) {
        try {
            oConnection = DriverManager.getConnection(url, username, password);
            oCommand = oConnection.prepareStatement("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String callProcedure(String spName, String[] parameter) {
        List<Map<String, Object>> results = new ArrayList<>();
        try {
            oConnection.setAutoCommit(false);
            oCommand.clearParameters();
            oCommand = oConnection.prepareStatement("EXEC " + spName + " " + prepareParameters(50));

            for (int i = 0; i < 50; i++) {
                if (i < parameter.length) {
                    oCommand.setString(i + 1, parameter[i]);
                } else {
                    oCommand.setString(i + 1, "");
                }
            }

            ResultSet resultSet = oCommand.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                Map<String, Object> row = new LinkedHashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = resultSet.getObject(i);
                    row.put(columnName, columnValue);
                }
                results.add(row);
            }

            resultSet.close();
            oConnection.commit();
            oConnection.setAutoCommit(true);
        } catch (SQLException e) {
            e.getMessage();
            try {
                oConnection.rollback();
            } catch (SQLException ex) {
                e.getMessage();
            }
        }
        return convertToJson(results);
    }

    private String prepareParameters(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("?, ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }

    public String convertToJson(List<Map<String, Object>> data) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
