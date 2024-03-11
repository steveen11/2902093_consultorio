package com.citas.java;

import com.citas.java.entities.Medico;
import com.citas.java.enums.Especialidad;
import com.citas.java.enums.TipoIdentificacion;


public class Main {
    public static void main(String[] args) {
        //INSTANCIAR MEDICO
        Medico m = new Medico(1, "Miguel", "Ortiz",TipoIdentificacion.CC, 1019605503L, 10196035503L, Especialidad.PEDIATRIA);
    }
}