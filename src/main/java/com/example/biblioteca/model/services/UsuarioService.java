package com.example.biblioteca.model.services;

import com.example.biblioteca.model.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsuarioService {

    Usuario persistir(Usuario usuario);

    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findById(Long id);

    void deletar(Long id);
}
