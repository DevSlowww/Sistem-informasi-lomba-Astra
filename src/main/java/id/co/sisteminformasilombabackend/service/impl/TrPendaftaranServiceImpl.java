package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.TrPendaftaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TrPendaftaranServiceImpl implements TrPendaftaranService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;
    @Override
    public String getDataPendaftaran(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataPendaftaran", dataList.toArray(new String[0]));
        return result;
    }


    @Override
    public String getDataPendaftaranById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataPendaftaranById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createPendaftaran(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_createPendaftaran", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailPendaftaran(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_detailPendaftaran", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String editPendaftaran(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_editPendaftaran", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusPendaftaran(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_setStatusPendaftaran", dataList.toArray(new String[0]));
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

}
