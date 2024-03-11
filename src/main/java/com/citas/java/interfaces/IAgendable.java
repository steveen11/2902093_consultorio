package com.citas.java.interfaces;

import java.time.LocalDateTime;

public interface IAgendable {
    //definir comportamiento que otras clases deben implentar
    //implementar: generar el codigo fuente o instrucciones de los metodos 
    public void agendarCita(LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fecha);
}
