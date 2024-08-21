package id.co.sisteminformasilombabackend.service;

import java.util.Map;
public interface DospemLombaService {
    String getDataDospemLomba(Map<String, Object> data);
    String getDataDospemLombaById(Map<String, Object> data);
    String detailDospemLomba(Map<String, Object> data);
    String setStatusDospemLomba(Map<String, Object> data);
    String getListDospemLomba(Map<String, Object> data);
}
