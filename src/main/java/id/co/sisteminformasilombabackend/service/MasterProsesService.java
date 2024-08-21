package id.co.sisteminformasilombabackend.service;

import java.util.Map;

public interface MasterProsesService {
    String getDataProses(Map<String, Object> data);
    String getDataProsesById(Map<String, Object> data);
    String createProses(Map<String, Object> data);
    String detailProses(Map<String, Object> data);
    String editProses(Map<String, Object> data);
    String setStatusProses(Map<String, Object> data);
    String getListProses(Map<String, Object> data);
}

