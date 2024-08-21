package id.co.sisteminformasilombabackend.service;

import java.util.Map;

public interface TrPendaftaranService {
    String getDataPendaftaran(Map<String, Object> data);
    String getDataPendaftaranById(Map<String, Object> data);
    String createPendaftaran(Map<String, Object> data);
    String detailPendaftaran(Map<String, Object> data);
    String editPendaftaran(Map<String, Object> data);
    String setStatusPendaftaran(Map<String, Object> data);
    String getListPendaftaran(Map<String, Object> data);
}
