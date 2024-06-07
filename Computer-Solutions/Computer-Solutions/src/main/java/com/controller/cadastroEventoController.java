package com.controller;

import com.dao.exceptionDAO; // Importa a classe de exceção DAO
import com.model.evento; // Importa a classe de modelo de evento
import java.time.LocalTime; // Importa a classe LocalTime
import java.util.Date; // Importa a classe Date 

public class cadastroEventoController {
    
    // cadastrar um evento
    public boolean cadastrarEvento(String nomeEven, String desc, LocalTime horaInicio, LocalTime horaFim, Date diaInicio, Date diaFim) throws exceptionDAO {
        // Verifica se os parâmetros n são nulos e têm comprimento válido
        if (nomeEven != null && nomeEven.length()>0 && desc != null && desc.length() >0 && horaInicio!=null && horaFim!= null && diaInicio!= null && diaFim!= null) {
            
            // Converte os tipos de hora para o tipo do bd
            java.sql.Time horaInicioSQL = java.sql.Time.valueOf(horaInicio);
            java.sql.Time horaFimSQL = java.sql.Time.valueOf(horaFim);
            
            // Cria uma instância de evento com os parâmetros fornecidos
            evento Evento = new evento (nomeEven, desc, horaInicioSQL , horaFimSQL, diaInicio, diaFim);
            
            // Chama o metodo para cadastrar o evento no sistema
            Evento.cadastrarEvento(Evento);
        
            return true; // Retorna verdadeiro se o evento for cadastrado
        }
    
        return false; // Retorna falso se houver problemas
    }
}
