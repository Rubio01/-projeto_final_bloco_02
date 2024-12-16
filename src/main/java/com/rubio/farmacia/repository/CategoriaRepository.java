package com.rubio.farmacia.repository;

import com.rubio.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findByNomeContainingIgnoreCase(@Param("nome") String nome);
}
