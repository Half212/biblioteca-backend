package com.example.biblioteca.model.repositories;

import com.example.biblioteca.model.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

@Transactional(readOnly = true)
@NamedQueries({
        @NamedQuery(name = "LivroRepository.findbyUsuarioId",
                query = "SELECT livro FROM Livro livro WHERE livro.usuario_email = :usuarioEmail")
})
public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findByNome(String nome);

    List<Livro> findByUsuarioEmail(@Param("usuarioEmail") String usuarioEmail);

}