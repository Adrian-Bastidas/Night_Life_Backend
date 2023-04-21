package com.NightLife.Locales.Entity;

import javax.persistence.*;

@Entity
@Table(name="Productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prodId;
    private String prodFoto;
    private Double prodPrecioCompra;
    private Double prodPrecioVenta;
    private String prodDescripcion;

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdFoto() {
        return prodFoto;
    }

    public void setProdFoto(String prodFoto) {
        this.prodFoto = prodFoto;
    }

    public Double getProdPrecioCompra() {
        return prodPrecioCompra;
    }

    public void setProdPrecioCompra(Double prodPrecioCompra) {
        this.prodPrecioCompra = prodPrecioCompra;
    }

    public Double getProdPrecioVenta() {
        return prodPrecioVenta;
    }

    public void setProdPrecioVenta(Double prodPrecioVenta) {
        this.prodPrecioVenta = prodPrecioVenta;
    }

    public String getProdDescripcion() {
        return prodDescripcion;
    }

    public void setProdDescripcion(String prodDescripcion) {
        this.prodDescripcion = prodDescripcion;
    }
}
