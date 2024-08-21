package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.UtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UtilitiesServiceImpl implements UtilitiesService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String login(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        System.out.println(dataList);
        String result = polmanAstraRepository.callProcedure("sso_getAuthenticationLomba", dataList.toArray(new String[0]));
        if (result == null || result.isEmpty() || result.equals("[]")) {
            result = polmanAstraRepository.callProcedure("sso_getAuthenticationMahasiswaLomba", dataList.toArray(new String[0]));
            if (result == null || result.isEmpty() || result.equals("[]")) {
                return "{\"Status\":\"LOGIN FAILED\"}";
            }
        }
        return result;
    }

    @Override
    public String getListMenu(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        System.out.println(dataList);
        String result = polmanAstraRepository.callProcedure("all_getListMenu", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListProvinsi(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getListProvinsi", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListKabupaten(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getListKabupaten", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListKecamatan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getListKecamatan", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListKelurahan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getListKelurahan", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListKaryawan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getListKaryawan", dataList.toArray(new String[0]));
        return result;
    }
//    @Override
//    public String getListPembimbing(Map<String, Object> data) {
//        List<String> dataList = new ArrayList<>();
//        for (Map.Entry<String, Object> entry : data.entrySet()) {
//            dataList.add(entry.getValue().toString());
//        }
//        String result = polmanAstraRepository.callProcedure("sil_getListPembimbing", dataList.toArray(new String[0]));
//        return result;
//    }
    @Override
    public String getListPembimbing(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListPembimbing", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public String getListMahasiswa(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListMahasiswa", dataList.toArray(new String[0]));
        return result;
    }
//    @Override
//    public String getListTopik(Map<String, Object> data) {
//        List<String> dataList = new ArrayList<>();
//        for (Map.Entry<String, Object> entry : data.entrySet()) {
//            dataList.add(entry.getValue().toString());
//        }
//        String result = polmanAstraRepository.callProcedure("sil_getListTopik", dataList.toArray(new String[0]));
//        return result;
//    }
    @Override
    public String getListTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
//        System.out.println(dataList);  // Tambahkan log untuk debugging
        String result = polmanAstraRepository.callProcedure("sil_getListTopik", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public String getListLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListTopikBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListTopikBimbingan", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListPendaftaran(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListPendaftaran", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListBimbingan", dataList.toArray(new String[0]));
        return result;
    }
    private static final String fileBasePath = "D:/Data PRG7/Uploads/";
    @Override
    public ResponseEntity<Resource> downloadFile(String fileName) {
        try {
            Path filePath = Paths.get(fileBasePath, fileName);
            File file = filePath.toFile();

            System.out.println("File path: " + filePath.toString()); // Logging untuk debug
            System.out.println("File exists: " + file.exists()); // Logging untuk debug

            if (!file.exists()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getName());
            headers.add(HttpHeaders.CONTENT_TYPE, getContentType(file.getName()));

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(file.length())
                    .body(resource);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    private String getContentType(String fileName) {
        String contentType;
        if (fileName.endsWith(".jpg")) {
            contentType = "image/jpeg";
        } else if (fileName.endsWith(".png")) {
            contentType = "image/png";
        } else if (fileName.endsWith(".pdf")) {
            contentType = "application/pdf";
        } else if (fileName.endsWith(".mp4")) {
            contentType = "video/mp4";
        } else {
            contentType = "application/octet-stream";
        }
        return contentType;
    }
    @Override
    public ResponseEntity<?> uploadFile(MultipartFile file) {
        try {
            String originalFilename = file.getOriginalFilename();
            String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
            String newFileName = "FILE_" + System.currentTimeMillis() + fileExtension;

            Path filePath = Paths.get(fileBasePath + newFileName);
            Files.copy(file.getInputStream(), filePath);

            Map<String, String> response = new HashMap<>();
            response.put("newFileName", newFileName);
            response.put("message", "File uploaded successfully");

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Gagal Upload");
        }
    }
}
