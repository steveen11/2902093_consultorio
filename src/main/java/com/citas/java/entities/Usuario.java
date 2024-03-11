package com.citas.java.entities;
import com.citas.java.enums.TipoIdentificacion;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Long numeroIdentificacion;

public Usuario(int id, String nombre, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public TipoIdentificacion getTipoIdentificacion() {
    return tipoIdentificacion;
}

public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
    this.tipoIdentificacion = tipoIdentificacion;
}

public Long getNumeroIdentificacion() {
    return numeroIdentificacion;
}

public void setNumeroIdentificacion(Long numeroIdentificacion) {
    this.numeroIdentificacion = numeroIdentificacion;
}

    
}

