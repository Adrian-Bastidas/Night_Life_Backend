package com.NightLife.Clientes.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="client")
public class Cliente {
    @Id
    private Integer cliCedula;
    private String cliNombre;
    private String cliApellido;
    private String cliFechaNacimiento;
    private String cliAlias;
    private String cliTelefono;


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

    public String getCliFechaNacimiento() {
        return cliFechaNacimiento;
    }

    public void setCliFechaNacimiento(String cliFechaNacimiento) {
        this.cliFechaNacimiento = cliFechaNacimiento;
    }

    public String getCliAlias() {
        return cliAlias;
    }

    public void setCliAlias(String cliAlias) {
        this.cliAlias = cliAlias;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }
}
