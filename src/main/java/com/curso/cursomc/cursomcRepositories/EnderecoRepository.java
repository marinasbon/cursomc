package com.curso.cursomc.cursomcRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.cursomcDomain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
    
}
