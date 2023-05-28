package com.NightLife.Locales.Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Entity
@Table(name="Empleados")
public class Empleados {
    private String empNombre;
    private String empFechaNacimiento;
    @Id
    private Integer empCedula;
    private String empFoto;
    private String empAlias;
    private String empHoraInicio;
    private String empHoraFin;
    private Integer Local;

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }


    public String getEmpFechaNacimiento() {
        return empFechaNacimiento;
    }

    public void setEmpFechaNacimiento(String empFechaNacimiento) {
        this.empFechaNacimiento = empFechaNacimiento;
    }

    public Integer getEmpCedula() {
        return empCedula;
    }

    public void setEmpCedula(Integer empCedula) {
        this.empCedula = empCedula;
    }

    public String getEmpFoto() {
        return empFoto;
    }

    public void setEmpFoto(String empFoto) {
        this.empFoto = empFoto;
    }

    public String getEmpAlias() {
        return empAlias;
    }

    public void setEmpAlias(String empAlias) {
        this.empAlias = empAlias;
    }

    public String getEmpHoraInicio() {
        return empHoraInicio;
    }

    public void setEmpHoraInicio(String empHoraInicio) {
        this.empHoraInicio = empHoraInicio;
    }

    public String getEmpHoraFin() {
        return empHoraFin;
    }

    public void setEmpHoraFin(String empHoraFin) {
        this.empHoraFin = empHoraFin;
    }

    public Integer getLocal() {
        return Local;
    }

    public void setLocal(Integer local) {
        Local = local;
    }
}
