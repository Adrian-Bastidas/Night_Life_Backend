package com.NightLife.Ordenes.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="Orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordId;
    private String  ordFecha;
    private Integer ordLocId;
    private String ordSubtotal;
    private String ordTotal;
    @OneToMany(mappedBy = "Orden",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<OrdenDetails> Detalle = new ArrayList<>();

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getOrdFecha() {
        return ordFecha;
    }

    public void setOrdFecha(String ordFecha) {
        this.ordFecha = ordFecha;
    }

    public Integer getOrdLocId() {
        return ordLocId;
    }

    public void setOrdLocId(Integer ordLocId) {
        this.ordLocId = ordLocId;
    }

    public String getOrdSubtotal() {
        return ordSubtotal;
    }

    public void setOrdSubtotal(String ordSubtotal) {
        this.ordSubtotal = ordSubtotal;
    }

    public String getOrdTotal() {
        return ordTotal;
    }

    public void setOrdTotal(String ordTotal) {
        this.ordTotal = ordTotal;
    }

    public List<OrdenDetails> getDetalle() {
        return Detalle;
    }

    public void setDetalle(List<OrdenDetails> detalle) {
        Detalle = detalle;
    }
}
