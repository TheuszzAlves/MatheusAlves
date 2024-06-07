package com.dao;

import com.model.evento; // Importa a classe de modelo de evento
import java.sql.Connection; // Importa a classe Connection do pacote java.sql
import java.sql.Date; // Importa a classe Date do pacote java.sql
import java.sql.PreparedStatement; // Importa a classe PreparedStatement do pacote java.sql
import java.sql.SQLException; // Importa a classe SQLException do pacote java.sql
import java.sql.Time; // Importa a classe Time do pacote java.sql
import java.time.LocalTime; // Importa a classe LocalTime do pacote java.time

public class eventoDAO {
    
    public void cadastrarEvento(evento Evento) throws exceptionDAO {
        
        // inserir os dados do evento no banco
        String sql = "insert into evento(nome, descEvent, dataInicio, dataFim, horaInicio, horaFim) values (?,?,?,?,?,?)";
        PreparedStatement pStatement = null; // Declaração preparada para executar a consulta SQL
        Connection connection = null; // Conexão com o banco de dados
        
        try {
            // Estabelece a conexão com o banco de dados
            connection = new conectionBD().getConnection();
            
            // Prepara a declaração com o SQL
            pStatement = connection.prepareStatement(sql);
            
            // Define os parâmetros da consulta com os valores do evento
            pStatement.setString(1, Evento.getNomeEvento());
            pStatement.setString(2, Evento.getDescEvent());
            pStatement.setDate(3, new Date(Evento.getDataInicio().getTime()));
            pStatement.setDate(4, new Date(Evento.getDataFinal().getTime()));
            pStatement.setTime(5, Evento.getHoraInicio());
            pStatement.setTime(6, Evento.getHoraFinal());
            
            // Executa a consulta
            pStatement.execute();
        } catch (SQLException e) {
            // Lança uma exceção DAO em caso de erro ao cadastrar o evento
            throw new exceptionDAO("Erro ao cadastrar evento: " + e);
        } finally {
            // Finaliza e libera os recursos (PreparedStatement e Connection)
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                // Em caso de erro ao fechar o PreparedStatement, lança uma exceção DAO
                throw new exceptionDAO("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // Em caso de erro ao fechar a conexão, lança uma exceção DAO
                throw new exceptionDAO("Erro ao fechar a conexão");
            }
        }
    }
}
