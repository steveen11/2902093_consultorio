package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.enums.TipoSangre;


//DEFINICION ATRIBUTOS
public class Paciente extends Usuario{

    private String email;
    private Long celular;
    private LocalDateTime fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public Paciente(int id, String nombre, String apellidos, com.citas.java.enums.TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String email, Long celular, LocalDateTime fechaNacimiento, double altura,
            double peso, com.citas.java.enums.TipoSangre tipoSangre, char factorRH) {
        super(id, nombre, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }


    

    

}
