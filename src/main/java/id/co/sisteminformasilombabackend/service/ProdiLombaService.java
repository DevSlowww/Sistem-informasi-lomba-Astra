package id.co.sisteminformasilombabackend.service;

import org.json.JSONException;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
public interface ProdiLombaService {
    String getDataProdiLomba(Map<String, Object> data);
    String getDataProdiLombaById(Map<String, Object> data);
    String detailProdiLomba(Map<String, Object> data);
    String setStatusProdiLomba(Map<String, Object> data);
    String getListProdiLomba(Map<String, Object> data);
    ModelAndView exportExcelProdi(Map<String, Object> data) throws JSONException;
}
