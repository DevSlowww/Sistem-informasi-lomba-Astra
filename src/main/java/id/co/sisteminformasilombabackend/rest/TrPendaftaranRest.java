package id.co.sisteminformasilombabackend.rest;


import id.co.sisteminformasilombabackend.config.EncodeData;
import id.co.sisteminformasilombabackend.service.TrPendaftaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/TrPendaftaran")
public class TrPendaftaranRest {
    @Autowired
    private TrPendaftaranService trPendaftaranService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/GetDataPendaftaran")
    public ResponseEntity<String> getDataPendaftaran(@RequestBody Map<String, Object> data) {
        //        System.out.println("Received request data: " + data);
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.getDataPendaftaran(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/GetDataPendaftaranById")
    public ResponseEntity<String> getDataPendaftaranById(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.getDataPendaftaranById(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/CreatePendaftaran")
    public ResponseEntity<String> createPendaftaran(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.createPendaftaran(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create data", e);
        }
    }


    @PostMapping("/EditTrPendaftaran")
    public ResponseEntity<String> editTrPendaftaran(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.editPendaftaran(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to edit data", e);
        }
    }

    @PostMapping("/SetStatusPendaftaran")
    public ResponseEntity<String> setStatusPendaftaran(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.setStatusPendaftaran(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to set status", e);
        }
    }

    @PostMapping("/GetListPendaftaran")
    public ResponseEntity<String> getListTrPendaftaran(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.getListPendaftaran(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list", e);
        }
    }

    @PostMapping("/DetailPendaftaran")
    public ResponseEntity<String> detailPendaftaran(@RequestBody Map<String, Object> data) {

        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trPendaftaranService.detailPendaftaran(encodedData);
            System.out.println("MASUK" + result);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get detail", e);
        }
    }
}

