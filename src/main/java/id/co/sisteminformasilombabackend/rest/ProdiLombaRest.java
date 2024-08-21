package id.co.sisteminformasilombabackend.rest;

import id.co.sisteminformasilombabackend.config.EncodeData;
import id.co.sisteminformasilombabackend.service.MasterLombaService;
import id.co.sisteminformasilombabackend.service.ProdiLombaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/ProdiLomba")
public class ProdiLombaRest {
    @Autowired
    private ProdiLombaService prodiLombaService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/GetDataProdiLomba")
    public ResponseEntity<String> getDataLomba(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = prodiLombaService.getDataProdiLomba(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/GetDataProdiLombaById")
    public ResponseEntity<String> getDataLombaById(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = prodiLombaService.getDataProdiLombaById(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/SetStatusProdiLomba")
    public ResponseEntity<String> setStatusLomba(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = prodiLombaService.setStatusProdiLomba(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to set status", e);
        }
    }

    @PostMapping("/GetListProdiLomba")
    public ResponseEntity<String> getListLomba(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = prodiLombaService.getListProdiLomba(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list", e);
        }
    }
    @PostMapping("/ExportExcelProdi")
    public ModelAndView exportExcelProdi(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            return  prodiLombaService.exportExcelProdi(encodedData);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get list", e);
        }
    }
}

