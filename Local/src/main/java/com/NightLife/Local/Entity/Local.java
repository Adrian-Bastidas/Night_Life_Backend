package com.NightLife.Local.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Local")
public class Local {
    @Id
    private Integer locId;
}
