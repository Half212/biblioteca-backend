package com.example.biblioteca.model.services;

import com.example.biblioteca.model.entities.Livro;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LivroService {

    Livro persistir(Livro livro);

    Optional<Livro> findByName(String name);

    Optional<Livro> findById(Long id);

    List<Livro> buscarPorUsuarioEmail(String usuarioEmail);

    List<Livro> buscarTodos();

    void deletar(Long id);
}
