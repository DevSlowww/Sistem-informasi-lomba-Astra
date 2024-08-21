package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.MasterTopikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MasterTopikServiceImpl implements MasterTopikService{
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getDataTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataTopik", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getDataTopikById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataTopikById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_createTopik", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_detailTopik", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String editTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_editTopik", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_setStatusTopik", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListTopik(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListTopik", dataList.toArray(new String[0]));
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
}
