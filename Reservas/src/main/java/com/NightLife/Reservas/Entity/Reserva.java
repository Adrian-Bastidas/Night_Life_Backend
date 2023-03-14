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
    private Time resHoraInicio;
    private Time resHoraFin;
    private Integer resEmpCedula;
    private String resActividad;
    private Double resPrecio;
    private Integer resLocal;
    private Date resFecha;
    private Integer resCliCedula;

}
