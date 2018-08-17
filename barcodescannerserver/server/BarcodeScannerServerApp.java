package nl.edwinrietmeijer.barcodescanner.server;

import nl.edwinrietmeijer.barcodescanner.BarcodeScannerServerAppConfig;
import org.springframework.boot.SpringApplication;

public class BarcodeScannerServerApp {
    public static void main(String[] args) {
        SpringApplication.run(BarcodeScannerServerAppConfig.class);
    }
}
