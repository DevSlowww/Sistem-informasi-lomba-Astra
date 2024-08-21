package id.co.sisteminformasilombabackend.config;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class EncodeData {

    public Map<String, Object> htmlEncodeObject(Map<String, Object> data) {
        // Membuat objek untuk menyimpan data yang sudah diencode dengan urutan yang sama
        Map<String, Object> encodedData = new LinkedHashMap<>();

        // Iterasi melalui setiap entri di dalam Map
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            // Mendapatkan nilai dari entri
            Object value = entry.getValue();

            // Jika nilai tidak null
            if (value != null) {
                // Mendapatkan nilai sebagai string
                String stringValue = value.toString();

                // Jika nilai adalah string kosong, tambahkan string kosong sebagai nilainya
                if (stringValue.isEmpty()) {
                    encodedData.put(entry.getKey(), "");
                } else {
                    // Jika nilai bukan string kosong, lakukan encoding HTML
                    String encodedValue = Jsoup.clean(stringValue, Whitelist.basic());
                    encodedData.put(entry.getKey(), encodedValue);
                }
            } else {
                // Jika nilai null, tambahkan null ke dalam Map baru
                encodedData.put(entry.getKey(), null);
            }
        }

        return encodedData;
    }
}
