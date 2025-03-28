package com.curso.cursomc.cursomcRepositories;

import com.curso.cursomc.cursomcDomain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
