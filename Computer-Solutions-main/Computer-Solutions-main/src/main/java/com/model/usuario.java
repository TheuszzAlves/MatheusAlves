package com.model;


import com.dao.exceptionDAO;
import com.dao.usuarioDAO;
import java.util.Date;


public class usuario {

    public usuario(String nome, String email,  int Senha, String sexo, Date dataNasc, int cpfUsu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public void setIdadeUsu(Date DataNascUsu) {
        this.DataNascUsu = DataNascUsu;
    }

    public int getCpfUsu() {
        return cpfUsu;
    }

    public void setCpfUsu(int cpfUsu) {
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
    
    private int idUsu;
    private String nomeUsu;
    private Date DataNascUsu;
    private int cpfUsu;
    private int senhaUsu;
    private String sexoUsu;
    private String emailUsu;
    
}
