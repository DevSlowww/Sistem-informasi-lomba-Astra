package id.co.sisteminformasilombabackend.service;

import java.util.Map;

public interface MasterKursProsesService {
    String getKursProses(Map<String, Object> data);
    String createKursProses(Map<String, Object> data);
    String detailKursProses(Map<String, Object> data);
    String getHargaLamaByProses(Map<String, Object> data);
    String getRiwayatKursProses(Map<String, Object> data);
}

