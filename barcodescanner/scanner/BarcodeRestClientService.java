package nl.edwinrietmeijer.barcodescanner.scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("BarcodeService")
public class BarcodeRestClientService {
    private String baseUrl;
    private RestTemplate template;

    @Value("http://172.19.208.10:8080")
//    @Value("http://localhost:8080")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Autowired
    public void setTemplate(RestTemplate template) {
        this.template = template;
    }

    public void updateBarcode(String code) {
        HttpEntity<?> httpEntity = new HttpEntity<Object>(code);

        template.exchange(baseUrl + "/barcodes/scan", HttpMethod.POST, httpEntity, String.class);
//        template.put(baseUrl + "/barcodes/scan", code );
    }

}
