package com.NightLife.Local.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Productos")
public class Productos {
    @Id
    private Integer prodId;
    private String prodFoto;
    private Double prodPrecioCompra;
    private Double prodPrecioVenta;
    private String prodDescripcion;
    private Integer locId;
}
