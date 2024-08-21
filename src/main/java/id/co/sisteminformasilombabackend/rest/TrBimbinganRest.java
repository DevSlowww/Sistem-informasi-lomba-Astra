package id.co.sisteminformasilombabackend.rest;


import id.co.sisteminformasilombabackend.config.EncodeData;
import id.co.sisteminformasilombabackend.service.TrBimbinganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/Bimbingan")
public class TrBimbinganRest {
    @Autowired
    private TrBimbinganService trBimbinganService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/GetDataBimbingan")
    public ResponseEntity<String> getDataBimbingan(@RequestBody Map<String, Object> data) {
//        System.out.println("Received request data: " + data);
        try {
            System.out.println(data);
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.getDataBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/GetDataBimbinganById")
    public ResponseEntity<String> getDataBimbinganById(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.getDataBimbinganById(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/CreateBimbingan")
    public ResponseEntity<String> createBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.createBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create data", e);
        }
    }


    @PostMapping("/EditBimbingan")
    public ResponseEntity<String> editBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.editBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to edit data", e);
        }
    }

    @PostMapping("/SetStatusBimbingan")
    public ResponseEntity<String> setStatusBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.setStatusBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to set status", e);
        }
    }

//    @PostMapping("/GetListTrBimbingan")
//    public ResponseEntity<String> getListTrBimbingan(@RequestBody Map<String, Object> data) {
//        try {
//            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
//            String result = trBimbinganService.getListBimbingan(encodedData);
//            return ResponseEntity.ok().body(result);
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list", e);
//        }
//    }

    @PostMapping("/GetListBimbingan")
    public ResponseEntity<String> getListBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.getListBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list", e);
        }
    }

    @PostMapping("/DetailBimbingan")
    public ResponseEntity<String> detailBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.detailBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get detail", e);
        }
    }
    @PostMapping("/GetJumlahLombaNMahasiswaBimbingan")
    public ResponseEntity<String> getJumlahLombaNMahasiswaBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.getJumlahLombaNMahasiswaBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get detail", e);
        }
    }
    @PostMapping("/GetDataHistoriBimbingan")
    public ResponseEntity<String> getDataHistoriBimbingan(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = trBimbinganService.getDataHistoriBimbingan(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get detail", e);
        }
    }
}

