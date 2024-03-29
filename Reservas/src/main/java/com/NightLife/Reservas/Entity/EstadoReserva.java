package com.NightLife.Reservas.Entity;

import javax.persistence.*;

@Entity
@Table(name="EstadoReserva")
public class EstadoReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer esId;
    private String esEstado;

    public Integer getEsId() {
        return esId;
    }

    public void setEsId(Integer esId) {
        this.esId = esId;
    }

    public String getEsEstado() {
        return esEstado;
    }

    public void setEsEstado(String esEstado) {
        this.esEstado = esEstado;
    }
}
