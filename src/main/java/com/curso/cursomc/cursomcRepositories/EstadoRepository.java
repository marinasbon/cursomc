package com.curso.cursomc.cursomcRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.cursomcDomain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
    
}
