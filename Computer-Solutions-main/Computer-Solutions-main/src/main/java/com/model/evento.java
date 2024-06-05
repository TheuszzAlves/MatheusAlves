package com.model;


import com.dao.eventoDAO;
import com.dao.exceptionDAO;
import java.util.Date;


public class evento {

    public evento(String nomeEven, String desc, Date horaInicio, Date horaFim, Date diaInicio, Date diaFim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
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
    
    private int idEvent;
    private String nomeEvento;
    private String descEvent;
    private Date horaInicio;
    private Date horaFinal;
    private Date dataInicio;
    private Date dataFinal;
    
    
    
}
