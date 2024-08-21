package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.MahasiswaLombaService;
import id.co.sisteminformasilombabackend.service.MasterLombaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class  MahasiswaLombaServiceImpl implements MahasiswaLombaService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;
    @Override
    public String getDataMahasiswaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataLombaMahasiswa", dataList.toArray(new String[0]));
        return result;
    }


    @Override
    public String getDataMahasiswaLombaById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataLombaById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailMahasiswaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_detailLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusMahasiswaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_setStatusLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListMahasiswaLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getListLomba", dataList.toArray(new String[0]));
        return result;
    }

}
