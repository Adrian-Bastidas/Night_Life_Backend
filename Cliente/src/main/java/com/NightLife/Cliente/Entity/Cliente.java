package com.NightLife.Cliente.Entity;

import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Client")
public class Cliente {
    @Id
    private Integer cliCedula;
    private String cliNombre;
    private String cliApellido;
    private Date cliFechaNacimiento;
    private String cliAlias;
    private Integer cliTelefono;

    public Integer getCliCedula() {
        return cliCedula;
    }

    public void setCliCedula(Integer cliCedula) {
        this.cliCedula = cliCedula;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliApellido() {
        return cliApellido;
    }

    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }

    public Date getCliFechaNacimiento() {
        return cliFechaNacimiento;
    }

    public void setCliFechaNacimiento(Date cliFechaNacimiento) {
        this.cliFechaNacimiento = cliFechaNacimiento;
    }

    public String getCliAlias() {
        return cliAlias;
    }

    public void setCliAlias(String cliAlias) {
        this.cliAlias = cliAlias;
    }

    public Integer getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(Integer cliTelefono) {
        this.cliTelefono = cliTelefono;
    }
}
