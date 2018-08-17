package nl.edwinrietmeijer.barcodescanner.server;

import nl.edwinrietmeijer.barcodescanner.domain.Barcode;

public interface BarcodeService {
    public Barcode createBarcode(String code);
}
