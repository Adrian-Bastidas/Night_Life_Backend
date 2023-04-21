package com.NightLife.Ordenes.Entity;

import javax.persistence.*;

@Entity
@Table(name="OrdenDetails")
public class OrdenDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detalleId;
    private String detalleNombre;
    private Integer detalleCantidad;
    private Double detallePrecio;

    public Integer getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public String getDetalleNombre() {
        return detalleNombre;
    }

    public void setDetalleNombre(String detalleNombre) {
        this.detalleNombre = detalleNombre;
    }

    public Integer getDetalleCantidad() {
        return detalleCantidad;
    }

    public void setDetalleCantidad(Integer detalleCantidad) {
        this.detalleCantidad = detalleCantidad;
    }

    public Double getDetallePrecio() {
        return detallePrecio;
    }

    public void setDetallePrecio(Double detallePrecio) {
        this.detallePrecio = detallePrecio;
    }
}
