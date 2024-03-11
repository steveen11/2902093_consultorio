package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.enums.Estado;
import com.citas.java.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable{

    private String motivoConsulta;
    private Medico medico;
    private Estado estado;

    public CitaMedico(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String motivoConsulta,
            Medico medico, Estado estado) {
        super(id, fecha, paciente, consultorio);
        this.motivoConsulta = motivoConsulta;
        this.medico = medico;
        this.estado = estado;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        this.estado = estado.AGENDADA;
    }

    @Override
    public void cancelarCita() {
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
    }




    
}
