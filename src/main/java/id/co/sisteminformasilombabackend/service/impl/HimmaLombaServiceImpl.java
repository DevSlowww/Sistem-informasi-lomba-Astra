package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.HimmaLombaService;
import id.co.sisteminformasilombabackend.service.MasterLombaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class HimmaLombaServiceImpl implements HimmaLombaService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;
    @Override
    public String getDataHimmaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataHimmaLomba", dataList.toArray(new String[0]));
        return result;
    }


    @Override
    public String getDataHimmaLombaById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataHimmaLombaById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createHimmaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_createHimmaLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailHimmaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_detailHimmaLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String editHimmaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_editHimmaLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusHimmaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_setStatusHimmaLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListHimmaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListHimmaLomba", dataList.toArray(new String[0]));
        return result;
    }

}
