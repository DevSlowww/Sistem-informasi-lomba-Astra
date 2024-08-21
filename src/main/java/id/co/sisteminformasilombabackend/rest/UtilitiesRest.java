package id.co.sisteminformasilombabackend.rest;

import id.co.sisteminformasilombabackend.config.EncodeData;
import id.co.sisteminformasilombabackend.service.UtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/Utilities")
public class UtilitiesRest {
    @Autowired
    private UtilitiesService utilitiesService;

    @Autowired
    private EncodeData encodeData;
    private static final String UPLOAD_DIR =  "D:/Data PRG7/Uploads/";
    @Value("${spring.servlet.multipart.max-file-size}")
    private String maxFileSize;

    @PostMapping("/Login")
    public ResponseEntity<String> login(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.login(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to login", e);
        }
    }

    @PostMapping("/GetListMenu")
    public ResponseEntity<String> getListMenu(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListMenu(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list menu", e);
        }
    }

    @PostMapping("/GetListProvinsi")
    public ResponseEntity<String> getListProvinsi(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListProvinsi(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list provinsi", e);
        }
    }

    @PostMapping("/GetListKabupaten")
    public ResponseEntity<String> getListKabupaten(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListKabupaten(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list kabupaten", e);
        }
    }

    @PostMapping("/GetListKecamatan")
    public ResponseEntity<String> getListKecamatan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListKecamatan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list kecamatan", e);
        }
    }

    @PostMapping("/GetListKelurahan")
    public ResponseEntity<String> getListKelurahan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListKelurahan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list kelurahan", e);
        }
    }

    @PostMapping("/GetListKaryawan")
    public ResponseEntity<String> getListKaryawan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListKaryawan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list karyawan", e);
        }
    }

    @PostMapping("/GetListPembimbing")
    public ResponseEntity<String> getListPembimbing(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListPembimbing(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Pembimbing", e);
        }
    }

    @PostMapping("/GetListMahasiswa")
    public ResponseEntity<String> getListMahasiswa(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListMahasiswa(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Mahasiswa", e);
        }
    }
    @PostMapping("/GetListTopik")
    public ResponseEntity<String> getListTopik(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListTopik(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Topik", e);
        }
    }

    @PostMapping("/GetListTopikBimbingan")
    public ResponseEntity<String> getListTopikBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListTopikBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Topik pada Bimbingan", e);
        }
    }

    @PostMapping("/GetListLomba")
    public ResponseEntity<String> getListLomba(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListLomba(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Lomba", e);
        }
    }

    @PostMapping("/GetListPendaftaran")
    public ResponseEntity<String> getListPendaftaran(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListPendaftaran(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Pendaftaran Lomba", e);
        }
    }
    @PostMapping("/GetListBimbingan")
    public ResponseEntity<String> getListBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = utilitiesService.getListBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list Bimbingan Lomba", e);
        }
    }

    @PostMapping("/Upload")
    public ResponseEntity<?> UploadFile (@RequestBody MultipartFile file){
        System.out.println(file);
        return utilitiesService.uploadFile(file);
    }
    @GetMapping("/DownloadFile")
    public ResponseEntity<Resource> downloadFile(@RequestParam String namaFile) {
        return utilitiesService.downloadFile(namaFile);
    }

    @GetMapping("/getImage/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getImage(@PathVariable String filename) {
        try {
            Path filePath = Paths.get(UPLOAD_DIR).resolve(filename).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("/uploadMultipleFiles")
    public ResponseEntity<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        // Check if any of the files are empty or exceed the size limit
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("One or more files are empty");
            }
            if (file.getSize() > 10 * 1024 * 1024) { // 10MB
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("One or more files exceed the maximum allowed size of 10MB");
            }
        }

        try {
            // Ensure the upload directory exists
            Path uploadPath = Paths.get(UPLOAD_DIR);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            StringBuilder fileNames = new StringBuilder();
            // Save each file individually
            for (MultipartFile file : files) {
                byte[] bytes = file.getBytes();
                Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
                Files.write(path, bytes);
                fileNames.append(file.getOriginalFilename()).append(" ");
            }

            return ResponseEntity.ok("Uploaded files: " + fileNames.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload files");
        }
    }
    
}
