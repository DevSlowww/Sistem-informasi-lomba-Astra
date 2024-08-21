package id.co.sisteminformasilombabackend.service;

import java.util.Map;

public interface HimmaLombaService {
    String getDataHimmaLomba(Map<String, Object> data);
    String getDataHimmaLombaById(Map<String, Object> data);
    String createHimmaLomba(Map<String, Object> data);
    String detailHimmaLomba(Map<String, Object> data);
    String editHimmaLomba(Map<String, Object> data);
    String setStatusHimmaLomba(Map<String, Object> data);
    String getListHimmaLomba(Map<String, Object> data);
}
