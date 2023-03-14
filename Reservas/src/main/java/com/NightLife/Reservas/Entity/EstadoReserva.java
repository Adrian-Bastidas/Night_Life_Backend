package com.NightLife.Reservas.Entity;

import javax.persistence.*;

@Entity
@Table(name="EstadoReserva")
public class EstadoReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer esId;
    private String esEstado;
}
