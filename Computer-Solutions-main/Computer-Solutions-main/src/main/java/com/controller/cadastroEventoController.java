package com.controller;

import com.dao.exceptionDAO;
import com.model.evento;
import java.util.Date;


public class cadastroEventoController {
    
    public boolean cadastrarEvento(String nomeEven, String desc, Date horaInicio, Date horaFim, Date diaInicio, Date diaFim) throws exceptionDAO{
        if (nomeEven != null && nomeEven.length()>0 && desc != null && desc.length() >0 && horaInicio!=null && horaFim!= null
                && diaInicio!= null && diaFim!= null){
            evento Evento = new evento (nomeEven, desc, horaInicio, horaFim, diaInicio, diaFim);
            Evento.cadastrarEvento(Evento);
        
        return true;
        }
    
        return false;
    }


    
}
