package com.NightLife.Ordenes.Entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordId;
    private Date ordFecha;
    private Integer ordLocId;
    private Double ordSubtotal;
    private Double ordTotal;
}
