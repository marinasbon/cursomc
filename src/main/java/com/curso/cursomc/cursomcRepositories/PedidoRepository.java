package com.curso.cursomc.cursomcRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.cursomcDomain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
