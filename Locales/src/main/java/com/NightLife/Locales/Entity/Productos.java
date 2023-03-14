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
}
