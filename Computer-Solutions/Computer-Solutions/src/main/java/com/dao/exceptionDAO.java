package com.dao;

public class exceptionDAO extends Exception {
    
    public exceptionDAO(String mensagem) {
        super(mensagem); // Chama o construtor da classe pai com a mensagem fornecida
    }
}
