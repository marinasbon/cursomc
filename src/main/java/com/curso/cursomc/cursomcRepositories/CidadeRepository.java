package com.curso.cursomc.cursomcRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.cursomcDomain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
    
}
