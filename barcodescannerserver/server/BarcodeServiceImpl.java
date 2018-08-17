package nl.edwinrietmeijer.barcodescanner.server;

import nl.edwinrietmeijer.barcodescanner.domain.Barcode;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BarcodeServiceImpl implements BarcodeService {
    @Override
    public Barcode createBarcode(String code) {
        Barcode barcode = new Barcode();
        barcode.setCode(code);
        barcode.setScanDateTime(LocalDateTime.now());
        return barcode;
    }
}
