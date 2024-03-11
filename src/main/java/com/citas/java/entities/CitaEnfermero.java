package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.interfaces.IAgendable;


public class CitaEnfermero extends Cita implements IAgendable{


    private String procedimientoARealizar;
    private Enfermero enfermero;
    
    public CitaEnfermero(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio,
            String procedimientoARealizar, Enfermero enfermero) {
        super(id, fecha, paciente, consultorio);
        this.procedimientoARealizar = procedimientoARealizar;
        this.enfermero = enfermero;
    }

    public String getProcedimientoARealizar() {
        return procedimientoARealizar;
    }

    public void setProcedimientoARealizar(String procedimientoARealizar) {
        this.procedimientoARealizar = procedimientoARealizar;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        //se le esta asignandoa al fecha de la cita(clase padre)
        //la fecha como parametro
        super.fecha = fecha;
    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita cancelada");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        super.fecha=fecha;
    }



    



    
}
