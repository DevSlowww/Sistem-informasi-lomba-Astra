package id.co.sisteminformasilombabackend.service;

import java.util.Map;
public interface MahasiswaLombaService {
    String getDataMahasiswaLomba(Map<String, Object> data);
    String getDataMahasiswaLombaById(Map<String, Object> data);
    String detailMahasiswaLomba(Map<String, Object> data);
    String setStatusMahasiswaLomba(Map<String, Object> data);
    String getListMahasiswaLomba(Map<String, Object> data);
}
