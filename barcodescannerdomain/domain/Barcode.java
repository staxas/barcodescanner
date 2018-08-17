package nl.edwinrietmeijer.barcodescanner.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="barcodes")
public class Barcode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="code")
    private String code;
    @Column(name="scandatetime")
    private LocalDateTime scanDateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getScanDateTime() {
        return scanDateTime;
    }

    public void setScanDateTime(LocalDateTime scanDateTime) {
        this.scanDateTime = scanDateTime;
    }

    @Override
    public String toString() {
        return "Barcode{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", scanDateTime=" + scanDateTime +
                '}';
    }
}
