package com.NightLife.Reservas.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
@Entity
@Table(name="Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resId;
    private String resHoraInicio;
    private String resHoraFin;
    private Integer resEmpCedula;
    private String resActividad;
    private String resPrecio;
    private Integer resLocal;
    private String resFecha;
    private Integer resCliCedula;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getResHoraInicio() {
        return resHoraInicio;
    }

    public void setResHoraInicio(String resHoraInicio) {
        this.resHoraInicio = resHoraInicio;
    }

    public String getResHoraFin() {
        return resHoraFin;
    }

    public void setResHoraFin(String resHoraFin) {
        this.resHoraFin = resHoraFin;
    }

    public Integer getResEmpCedula() {
        return resEmpCedula;
    }

    public void setResEmpCedula(Integer resEmpCedula) {
        this.resEmpCedula = resEmpCedula;
    }

    public String getResActividad() {
        return resActividad;
    }

    public void setResActividad(String resActividad) {
        this.resActividad = resActividad;
    }

    public String getResPrecio() {
        return resPrecio;
    }

    public void setResPrecio(String resPrecio) {
        this.resPrecio = resPrecio;
    }

    public Integer getResLocal() {
        return resLocal;
    }

    public void setResLocal(Integer resLocal) {
        this.resLocal = resLocal;
    }

    public String getResFecha() {
        return resFecha;
    }

    public void setResFecha(String resFecha) {
        this.resFecha = resFecha;
    }

    public Integer getResCliCedula() {
        return resCliCedula;
    }

    public void setResCliCedula(Integer resCliCedula) {
        this.resCliCedula = resCliCedula;
    }
}
