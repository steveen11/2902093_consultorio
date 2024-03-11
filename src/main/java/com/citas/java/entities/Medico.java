package com.citas.java.entities;

import com.citas.java.enums.Especialidad;
import com.citas.java.enums.TipoIdentificacion;

public class Medico extends Usuario{
    private Long registroMedico;
    private Especialidad especialidad;
    


    public Medico(int id, String nombre, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, Long registroMedico, Especialidad especialidad) {
        super(id, nombre, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }



}
