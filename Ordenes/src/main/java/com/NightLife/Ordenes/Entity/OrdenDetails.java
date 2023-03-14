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
}
