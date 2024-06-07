package com.model;

import com.dao.exceptionDAO;
import com.dao.usuarioDAO;
import java.util.Date;

public class usuario {


    private int idUsu;
    private String nomeUsu;
    private Date DataNascUsu;
    private String cpfUsu;
    private int senhaUsu;
    private String sexoUsu;
    private String emailUsu;

public usuario(){}

public usuario(String nomeUsu, String emailUsu, int senhaUsu, String sexoUsu, Date DataNascUsu, String cpfUsu){
    
    this.nomeUsu = nomeUsu;
    this.emailUsu = emailUsu;
    this.senhaUsu = senhaUsu;
    this.sexoUsu = sexoUsu;
    this.cpfUsu = cpfUsu;
    this.DataNascUsu = DataNascUsu;
    
}

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public Date getDataNascUsu() {
        return DataNascUsu;
    }

    public void setDataNascUsu(Date DataNascUsu) {
        this.DataNascUsu = DataNascUsu;
    }

    public String getCpfUsu() {
        return cpfUsu;
    }

    public void setCpfUsu(String cpfUsu) {
        this.cpfUsu = cpfUsu;
    }

    public int getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(int senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(String sexoUsu) {
        this.sexoUsu = sexoUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public void cadastrarUsuario (usuario Usuario) throws exceptionDAO{
        new usuarioDAO().cadastrarUsuario(Usuario);

        
    }
    
}
    

