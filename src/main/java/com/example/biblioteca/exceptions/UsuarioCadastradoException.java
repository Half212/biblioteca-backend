package com.example.biblioteca.exceptions;

public class UsuarioCadastradoException extends RuntimeException {

    public UsuarioCadastradoException(String email){
        super("Usuario já cadastrado para o e-mail " + email);
    }
}
