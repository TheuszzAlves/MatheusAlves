package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.model.usuario;
import java.sql.Date;


public class usuarioDAO  {
    public void cadastrarUsuario (usuario Usuario) throws exceptionDAO{
    
    String sql = "insert into usuario(nomeUsu, emailUsu, cpfUsu, senhaUsu, sexoUsu, dataNascUsuario) value (?,?,?,?,?,?)";
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try{
        connection = new conectionBD().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1,Usuario.getNomeUsu());
        pStatement.setString(2,Usuario.getEmailUsu());
        pStatement.setInt(3,Usuario.getSenhaUsu());
        pStatement.setString(4,Usuario.getSexoUsu());
        pStatement.setDate(5, (Date) Usuario.getDataNascUsu());
         pStatement.setInt(6,Usuario.getCpfUsu());
        pStatement.execute();
    }catch(SQLException e){
        throw new exceptionDAO("Erro ao cadastrar usuario: "+ e);
    }finally{
        try{
            if(pStatement != null)
            {pStatement.close();}
        }catch(SQLException e){
             throw new exceptionDAO ("Erro ao fechar o Statement: "+e);
        }try {
            if(connection != null){connection.close();}
        }catch(SQLException e){
            throw new exceptionDAO ("Erro ao fechar a conexão");
        } 
    }
  }
}
