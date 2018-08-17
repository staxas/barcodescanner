package nl.edwinrietmeijer.barcodescanner.server;

import nl.edwinrietmeijer.barcodescanner.domain.Barcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarcodeRepository extends JpaRepository<Barcode, Integer> {
    public default void updateBarcode(Barcode b) {
        save(b);
    }
}
