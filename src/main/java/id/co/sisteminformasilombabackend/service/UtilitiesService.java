package id.co.sisteminformasilombabackend.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface UtilitiesService {
    String login(Map<String, Object> data);
    String getListMenu(Map<String, Object> data);
    String getListProvinsi(Map<String, Object> data);
    String getListKabupaten(Map<String, Object> data);
    String getListKecamatan(Map<String, Object> data);
    String getListKelurahan(Map<String, Object> data);
    String getListKaryawan(Map<String, Object> data);
    String getListPembimbing(Map<String, Object> data);
    String getListMahasiswa(Map<String, Object> data);
    String getListTopik(Map<String, Object> data);
    String getListTopikBimbingan(Map<String, Object> data);
    String getListLomba(Map<String, Object> data);
    String getListPendaftaran(Map<String, Object> data);
    String getListBimbingan(Map<String, Object> data);
    ResponseEntity<Resource> downloadFile(String fileName);
    ResponseEntity<?> uploadFile(MultipartFile file);
}
