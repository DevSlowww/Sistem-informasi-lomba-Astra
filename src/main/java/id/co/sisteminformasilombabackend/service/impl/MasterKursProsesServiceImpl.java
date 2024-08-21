package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.MasterKursProsesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MasterKursProsesServiceImpl implements MasterKursProsesService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getKursProses(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getDataKursProses", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createKursProses(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_createKursProses", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailKursProses(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_detailKursProses", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getHargaLamaByProses(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getHargaLamaByProses", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getRiwayatKursProses(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("pro_getRiwayatKursProses", dataList.toArray(new String[0]));
        return result;
    }
}
