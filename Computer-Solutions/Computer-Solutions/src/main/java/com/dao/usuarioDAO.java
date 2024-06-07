package com.dao;

import java.sql.Connection; // Importa a classe Connection do pacote java.sql
import java.sql.PreparedStatement; // Importa a classe PreparedStatement do pacote java.sql
import java.sql.SQLException; // Importa a classe SQLException do pacote java.sql
import com.model.usuario; // Importa a classe de modelo de usuário
import java.sql.Date; // Importa a classe Date do pacote java.sql

public class usuarioDAO {
    
    public void cadastrarUsuario(usuario Usuario) throws exceptionDAO {
        
        // sql para inserir os dados do usr
        String sql = "insert into usuario(nomeUsu, emailUsu, senhaUsu, sexoUsu, dataNascUsuario, cpfUsu) values (?,?,?,?,?,?)";
        PreparedStatement pStatement = null; // executar a consulta SQL
        Connection connection = null; // Conexão com o bd
        
        try {
            // Estabelece a conexão com o bd
            connection = new conectionBD().getConnection();
            
            // Prepara a declaração com o sql
            pStatement = connection.prepareStatement(sql);
            
            // Define os parâmetros da consulta com os valores do usuário
            pStatement.setString(1, Usuario.getNomeUsu());
            pStatement.setString(2, Usuario.getEmailUsu());
            pStatement.setInt(3, Usuario.getSenhaUsu());
            pStatement.setString(4, Usuario.getSexoUsu());
            pStatement.setDate(5, new Date(Usuario.getDataNascUsu().getTime()));
            pStatement.setString(6, Usuario.getCpfUsu());
            
            // Executa a consulta
            pStatement.execute();
        } catch (SQLException e) {
            // Lança uma exceção DAO em caso de erro ao cadastrar o usuário
            throw new exceptionDAO("Erro ao cadastrar usuário: " + e);
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
