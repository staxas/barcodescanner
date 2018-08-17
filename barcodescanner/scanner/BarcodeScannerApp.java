package nl.edwinrietmeijer.barcodescanner.scanner;

import nl.edwinrietmeijer.barcodescanner.BarcodeScannerAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

public class BarcodeScannerApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BarcodeScannerAppConfig.class);

        app.setWebEnvironment(false);
        ConfigurableApplicationContext ctx = app.run(args);

        BarcodeRestClientService service = ctx.getBean("BarcodeService", BarcodeRestClientService.class);

        Scanner keyboard = new Scanner(System.in);

        while(true) {
            String input = keyboard.next();
            service.updateBarcode(input);
            System.out.println("Sent barcode code: " + input);
        }
    }
}
