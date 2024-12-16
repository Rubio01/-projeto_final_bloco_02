package com.rubio.farmacia.repository;

import com.rubio.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public List<Produto> findByNomeContainingIgnoreCase(String name);
}
