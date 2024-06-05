package com.controller;

import com.dao.exceptionDAO;
import com.model.usuario;
import java.util.Date;


public class cadastroUsuarioController {
    
    public boolean cadastrarUsuario(String nome, String email, int cpfUsu, int Senha, String sexo, Date dataNasc) throws exceptionDAO{
        if (nome != null && nome.length()>0 && email != null && email.length() >0 && cpfUsu!=0 && dataNasc!=null
                && Senha!=0 && sexo!= null && sexo.length()>0){
            usuario Usuario = new usuario (nome, email, Senha, sexo, dataNasc, cpfUsu);
            Usuario.cadastrarUsuario(Usuario);
        
        return true;
        }
    
        return false;
    }

    public boolean cadastrarUsuario(String text, String text0, int Senha, String genero, Date date, int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
