package com.controller;

import com.dao.exceptionDAO; // Importa a classe de exceção DAO
import com.model.usuario; // Importa a classe de modelo de usuário
import java.text.ParseException; // Importa a classe ParseException para tratar exceções de parsing
import java.text.SimpleDateFormat; // Importa a classe SimpleDateFormat para formatar datas
import java.util.Date; // Importa a classe Date para trabalhar com datas

public class cadastroUsuarioController {
    
    // cadastrar um user
    public boolean cadastrarUsuario(String nome, String email, int Senha, String sexo, String dataNasc, String cpfUsu) throws ParseException, exceptionDAO {
        // Verifica se os parâmetros não são nulos e têm comprimento válido e se o CPF e a data são válidos
        if (nome != null && nome.length() > 0 && ValidarCpf(cpfUsu) && email != null && email.length() > 0 && sexo != null && sexo.length()>0 && ValidarData(dataNasc)) {
            
            // Formata a data de nascimento para o formato correto
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataUsu = formato.parse(dataNasc);
            
            // Cria uma instância de usuário com os parâmetros 
            usuario Usuario = new usuario (nome, email, Senha, sexo, dataUsu, cpfUsu);
            
            // Chama o método para cadastrar 
            Usuario.cadastrarUsuario(Usuario);
        
            return true; // Retorna verdadeiro se
        }
    
        return false; // Retorna falso
    }
    
    // validar o CPF
    public boolean ValidarCpf(String cpf) {
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                // Verifica se não é um número e se não está nas posições do ponto e traço do CPF
                if (!(i == 4 || i == 8 || i == 12)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // validar a data
    public boolean ValidarData(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))) {
                // Verifica se não é um número e se não está nas posições das barras da data
                if (!(i == 2 || i == 5)) {
                    return false;
                }
            }
        }
        return true;
    }
}
