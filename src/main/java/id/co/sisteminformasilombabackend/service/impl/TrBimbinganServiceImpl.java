package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.service.TrBimbinganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TrBimbinganServiceImpl implements TrBimbinganService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;
    @Override
    public String getDataBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataBimbingan", dataList.toArray(new String[0]));
        return result;
    }


    @Override
    public String getDataBimbinganById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataBimbinganById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_createBimbingan", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public String getJumlahLombaNMahasiswaBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getJumlahLombaNMahasiswaBimbingan", dataList.toArray(new String[0]));
        return result;
    }

//    @Override
//    public String detailBimbingan(Map<String, Object> data) {
//        List<String> dataList = new ArrayList<>();
//        for (Map.Entry<String, Object> entry : data.entrySet()) {
//            dataList.add(entry.getValue().toString());
//        }
//        String result = polmanAstraRepository.callProcedure("sil_detailBimbingan", dataList.toArray(new String[0]));
//        return result;
//    }

    @Override
    public String detailBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_detailBimbingan", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String editBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_editBimbingan", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_setStatusBimbingan", dataList.toArray(new String[0]));
        return result;
    }

//    @Override
//    public String getListBimbingan(Map<String, Object> data) {
//        List<String> dataList = new ArrayList<>();
//        for (Map.Entry<String, Object> entry : data.entrySet()) {
//            dataList.add(entry.getValue().toString());
//        }
//        String result = polmanAstraRepository.callProcedure("sil_getListBimbingann", dataList.toArray(new String[0]));
//        return result;
//    }

    @Override
    public String getListBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        // Pastikan nama stored procedure benar
        String result = polmanAstraRepository.callProcedure("sil_getListBimbingan", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public String getDataHistoriBimbingan(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        // Pastikan nama stored procedure benar
        String result = polmanAstraRepository.callProcedure("sil_getDataHistoriBimbingan", dataList.toArray(new String[0]));
        return result;
    }


}
