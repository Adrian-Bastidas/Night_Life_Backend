package com.NightLife.Locales.Entity;

import javax.persistence.*;

@Entity
@Table(name="Local")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locId;
    private String locNombre;
    private String locFoto;
    private String locHoraApertura;
    private String locHoraCierre;
    private String locDescripcion;
    private String locCoordenadas;
    private Double locPrecioFicha;
    private Double locPrecioEntrada;
    private Double locPrecioPrivado;

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public String getLocNombre() {
        return locNombre;
    }

    public void setLocNombre(String locNombre) {
        this.locNombre = locNombre;
    }

    public String getLocFoto() {
        return locFoto;
    }

    public void setLocFoto(String locFoto) {
        this.locFoto = locFoto;
    }

    public String getLocHoraApertura() {
        return locHoraApertura;
    }

    public void setLocHoraApertura(String locHoraApertura) {
        this.locHoraApertura = locHoraApertura;
    }

    public String getLocHoraCierre() {
        return locHoraCierre;
    }

    public void setLocHoraCierre(String locHoraCierre) {
        this.locHoraCierre = locHoraCierre;
    }

    public String getLocDescripcion() {
        return locDescripcion;
    }

    public void setLocDescripcion(String locDescripcion) {
        this.locDescripcion = locDescripcion;
    }

    public String getLocCoordenadas() {
        return locCoordenadas;
    }

    public void setLocCoordenadas(String locCoordenadas) {
        this.locCoordenadas = locCoordenadas;
    }

    public Double getLocPrecioFicha() {
        return locPrecioFicha;
    }

    public void setLocPrecioFicha(Double locPrecioFicha) {
        this.locPrecioFicha = locPrecioFicha;
    }

    public Double getLocPrecioEntrada() {
        return locPrecioEntrada;
    }

    public void setLocPrecioEntrada(Double locPrecioEntrada) {
        this.locPrecioEntrada = locPrecioEntrada;
    }

    public Double getLocPrecioPrivado() {
        return locPrecioPrivado;
    }

    public void setLocPrecioPrivado(Double locPrecioPrivado) {
        this.locPrecioPrivado = locPrecioPrivado;
    }
}
