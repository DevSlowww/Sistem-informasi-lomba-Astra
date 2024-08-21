package id.co.sisteminformasilombabackend.service;

import java.util.Map;
public interface MasterLombaService {
    String getDataLomba(Map<String, Object> data);
    String getDataLombaById(Map<String, Object> data);
    String createLomba(Map<String, Object> data);
    String detailLomba(Map<String, Object> data);
    String editLomba(Map<String, Object> data);
    String setStatusLomba(Map<String, Object> data);
    String getListLomba(Map<String, Object> data);
    String getMahasiswaLomba(Map<String, Object> data);
    String getHistoriLomba(Map<String, Object> data);
    String getNamaLombaByPDFTId(Map<String, Object> data);
    String getLombaAktifDs(Map<String, Object> data);
    String getLombaPendaftarDs(Map<String, Object> data);
    String getJumlahLombaNPendaftar(Map<String, Object> data);
    String getDataLombaDs(Map<String, Object> data);
}
