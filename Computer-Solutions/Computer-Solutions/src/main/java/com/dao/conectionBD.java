package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectionBD {
    
    // fazer a conexão com o banco de dados
    public Connection getConnection(){
        Connection con = null;
        
        try {
            // driver JDBC do MySQL
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Imprime o rastreamento da pilha se o driver não for encontrado
        }
        
        try {
            // Estabelece a conexão com o banco de dados usando a URL de conexão, nome de usuário e senha
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcs?useSSL=false","root","29250327");
        } catch(SQLException e) {
            e.printStackTrace(); // Imprime o rastreamento da pilha se houver erro na conexão
        }
        
        return con; // Retorna a conexão estabelecida ou null se ocorrer algum erro
    }
            
}
