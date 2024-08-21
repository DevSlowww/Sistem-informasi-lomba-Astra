package id.co.sisteminformasilombabackend.service;

import java.util.Map;

public interface TrBimbinganService {
    String getDataBimbingan(Map<String, Object> data);
    String getDataBimbinganById(Map<String, Object> data);
    String createBimbingan(Map<String, Object> data);
    String detailBimbingan(Map<String, Object> data);
    String editBimbingan(Map<String, Object> data);
    String setStatusBimbingan(Map<String, Object> data);
    String getListBimbingan(Map<String, Object> data);
    String getJumlahLombaNMahasiswaBimbingan(Map<String, Object> data);
    String getDataHistoriBimbingan(Map<String, Object> data);

}
