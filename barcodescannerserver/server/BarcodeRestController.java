package nl.edwinrietmeijer.barcodescanner.server;

import nl.edwinrietmeijer.barcodescanner.domain.Barcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/barcodes")
public class BarcodeRestController {
    @Autowired
    private BarcodeRepository barcodeRepository;

    @Autowired
    private BarcodeService barcodeService;

    @RequestMapping(value = "scan", method = RequestMethod.POST)
    public void scanBarcode(@RequestBody @Valid String code)  {
        barcodeRepository.updateBarcode(barcodeService.createBarcode(code));
        System.out.println("Saver barcode");
    }
}
