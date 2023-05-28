package com.NightLife.Login.Entity;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name="Login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer perId;
    private String perCedula;
    private String perNombre;
    @Email(message = "El correo electrónico no es válido")
    private String perCorreo;
    private String perContrasena;
    private String perApellido;
    private String perFoto;
    private String perRol;
    private Integer perLocal;

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerCedula() {
        return perCedula;
    }

    public void setPerCedula(String perCedula) {
        this.perCedula = perCedula;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerCorreo() {
        return perCorreo;
    }

    public void setPerCorreo(String perCorreo) {
        this.perCorreo = perCorreo;
    }

    public String getPerApellido() {
        return perApellido;
    }

    public void setPerApellido(String perApellido) {
        this.perApellido = perApellido;
    }

    public String getPerFoto() {
        return perFoto;
    }

    public void setPerFoto(String perFoto) {
        this.perFoto = perFoto;
    }

    public String getPerRol() {
        return perRol;
    }

    public void setPerRol(String perRol) {
        this.perRol = perRol;
    }

    public Integer getPerLocal() {
        return perLocal;
    }

    public void setPerLocal(Integer perLocal) {
        this.perLocal = perLocal;
    }

    public String getPerContrasena() {
        return perContrasena;
    }

    public void setPerContrasena(String perContrasena) {
        this.perContrasena = perContrasena;
    }
}
