package com.NightLife.Locales.Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Entity
@Table(name="Empleados")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String empNombre;
    private Date empFechaNacimiento;
    private Integer empCedula;
    private String empFoto;
    private String empAlias;
    private Time empHoraInicio;
    private Time empHoraFin;
}
