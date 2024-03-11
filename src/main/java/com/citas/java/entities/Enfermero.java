package com.citas.java.entities;

import com.citas.java.enums.TipoIdentificacion;

public class Enfermero extends Usuario{

    public Enfermero(int id, String nombre, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        super(id, nombre, apellidos, tipoIdentificacion, numeroIdentificacion);
    }

}
