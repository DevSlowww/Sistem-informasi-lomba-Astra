package id.co.sisteminformasilombabackend.service;

import java.util.Map;

public interface MasterTopikService {
    String getDataTopik(Map<String, Object> data);
    String getDataTopikById(Map<String, Object> data);
    String createTopik(Map<String, Object> data);
    String detailTopik(Map<String, Object> data);
    String editTopik(Map<String, Object> data);
    String setStatusTopik(Map<String, Object> data);
    String getListTopik(Map<String, Object> data);
    String getListTopikBimbingan(Map<String, Object> data);
}
