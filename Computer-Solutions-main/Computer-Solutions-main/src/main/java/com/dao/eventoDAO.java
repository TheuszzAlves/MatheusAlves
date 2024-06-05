package com.dao;


import com.model.evento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class eventoDAO {
     public void cadastrarEvento (evento Evento) throws exceptionDAO{
    
    String sql = "insert into evento(nome, descEvent, dataInicio, dataFim, horaInicio, horaFim) value (?,?,?,?,?,?)";
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try{
        connection = new conectionBD().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1,Evento.getNomeEvento());
        pStatement.setString(2,Evento.getDescEvent());
        pStatement.setDate(3, (Date) Evento.getDataInicio());
        pStatement.setDate(4, (Date) Evento.getDataFinal());
        pStatement.setDate(5, (Date) Evento.getHoraInicio());
        pStatement.setDate(6, (Date) Evento.getHoraFinal());
        pStatement.execute();
    }catch(SQLException e){
        throw new exceptionDAO("Erro ao cadastrar evento: "+ e);
    }finally{
        try{
            if(pStatement != null)
            {pStatement.close();}
        }catch(SQLException e){
             throw new exceptionDAO ("Erro ao fechar o Statement: " +e);
        }try {
            if(connection != null){connection.close();}
        }catch(SQLException e){
            throw new exceptionDAO ("Erro ao fechar a conexão");
        } 
    }
  }
}
