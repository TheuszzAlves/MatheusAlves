package com.model;

import com.dao.eventoDAO;
import com.dao.exceptionDAO;
import java.sql.Time;
import java.util.Date;

public class evento {

    
    private int idEvent;
    private String nomeEvento;
    private String descEvent;
    private Time horaInicio;
    private Time horaFinal;
    private Date dataInicio;
    private Date dataFinal;
    
    public evento(){}
    
    public evento(String nomeEven, String desc, Time horaInicio, Time horaFim, Date diaInicio, Date diaFim) {
        this.nomeEvento = nomeEven;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFim;
        this.dataInicio = diaInicio;
        this.dataFinal = diaFim;
        
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescEvent() {
        return descEvent;
    }

    public void setDescEvent(String descEvent) {
        this.descEvent = descEvent;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    public void cadastrarEvento (evento Evento) throws exceptionDAO{
        new eventoDAO().cadastrarEvento(Evento);
        
    
    }
    
  
    
    
    
}
