package nl.edwinrietmeijer.barcodescanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BarcodeScannerAppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
