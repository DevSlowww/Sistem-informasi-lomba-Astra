package id.co.sisteminformasilombabackend.service.impl;

import id.co.sisteminformasilombabackend.repository.PolmanAstraRepository;
import id.co.sisteminformasilombabackend.rest.view.ExportExcelProdiView;
import id.co.sisteminformasilombabackend.service.MahasiswaLombaService;
import id.co.sisteminformasilombabackend.service.MasterLombaService;
import id.co.sisteminformasilombabackend.service.ProdiLombaService;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ProdiLombaServiceImpl implements ProdiLombaService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;
    @Override
    public String getDataProdiLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataLombaProdi", dataList.toArray(new String[0]));
        return result;
    }


    @Override
    public String getDataProdiLombaById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataLombaById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailProdiLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_detailLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusProdiLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_setStatusLomba", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListProdiLomba(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataPendaftaranReport", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public ModelAndView exportExcelProdi(Map<String, Object> data) throws JSONException {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("sil_getDataExportReport", dataList.toArray(new String[0]));
        JSONArray jsonArray = new JSONArray(result);
        return new ModelAndView(new ExportExcelProdiView(jsonArray));
    }


}
