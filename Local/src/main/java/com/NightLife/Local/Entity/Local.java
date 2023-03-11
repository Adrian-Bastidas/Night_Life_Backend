package com.NightLife.Local.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Local")
public class Local {
    @Id
    private Integer locId;
    private String locNombre;
    private String locHoraApertura;
    private String locHoraCierre;
    private String locDescripcion;
    private String locCoordenadas;
    private Double locPrecioFicha;
    private Double locPrecioEntrada;
    private Double locPrecioPrivado;
}
