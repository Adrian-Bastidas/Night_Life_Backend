package com.NightLife.Local.Entity;

import jakarta.persistence.Id;

import java.util.Date;

public class Empleados {
    private String empNombre;
    private Date empFechaNacimiento;
    @Id
    private String empCedula;
    private String empFoto;
    private String empAlias;
    private String empHoraInicio;
    private String empHoraFin;
    private Integer locId;
}
