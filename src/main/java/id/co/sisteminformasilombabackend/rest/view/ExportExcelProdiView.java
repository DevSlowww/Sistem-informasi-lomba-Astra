package id.co.sisteminformasilombabackend.rest.view;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExportExcelProdiView extends AbstractXlsView{


        private final JSONArray list ;
        private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        public ExportExcelProdiView(JSONArray jsonArray) {
            this.list = jsonArray;
        }

        @Override
        protected Workbook createWorkbook(Map<String, Object> model, HttpServletRequest request) {
            String pathFile = "src/main/java/id/co/sisteminformasilombabackend/template/template_export_prodi.xlsx";
            InputStream is;
            try {
                is = new FileInputStream(pathFile);
                Workbook wb = WorkbookFactory.create(is);
                createBody(wb, list);
                is.close();
                return wb;
            } catch (IOException | EncryptedDocumentException ex) {
                ex.printStackTrace();
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            return null;
        }  // Format Template

        private void createBody(Workbook wb, JSONArray list) throws JSONException {
            CellStyle style = wb.createCellStyle();
            style.setBorderTop(BorderStyle.THIN);
            style.setBorderBottom(BorderStyle.THIN);
            style.setBorderRight(BorderStyle.THIN);
            style.setBorderLeft(BorderStyle.THIN);
            BigDecimal counter = BigDecimal.ONE;
            Sheet sheet = wb.getSheetAt(0);
            int rowIndex = 2;



            for (int i = 0; i < list.length(); i++) {
                Row row = sheet.createRow(rowIndex++);
                int cellIndex = 0;
                JSONObject jsonObject = list.getJSONObject(i);
                setValueCell(row.createCell(cellIndex++), style, counter);
                setValueCell(row.createCell(cellIndex++), style, jsonObject.getString("Nama Mahasiswa"));
                setValueCell(row.createCell(cellIndex++), style, jsonObject.getString("Nama Lomba"));
                setValueCell(row.createCell(cellIndex++), style, jsonObject.getString("Nama Penyelenggara"));
                setValueCell(row.createCell(cellIndex++), style, jsonObject.getString("Hasil"));
                counter = counter.add(BigDecimal.ONE);
            }


        }

        private void setValueCell(Cell cell, CellStyle style, Object value) {
            cell.setCellStyle(style);
            if (value instanceof BigDecimal) {
                cell.setCellValue(((BigDecimal) value).doubleValue());
            } else if (value instanceof String) {
                cell.setCellValue(String.valueOf(value));
            } else if (value instanceof Date) {
                cell.setCellValue(sdf.format(value));
            }
        }

        @Override
        protected void buildExcelDocument(Map<String, Object> model, Workbook wrkbk, jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse res) throws Exception {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String fileName = String.format("Report Hasil Lomba Prodi MI ", sdf.format(new Date()));
            res.setHeader("file-name", fileName);
            res.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
        }
}
