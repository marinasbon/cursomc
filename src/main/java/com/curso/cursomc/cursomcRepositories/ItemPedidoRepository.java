package com.curso.cursomc.cursomcRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.cursomcDomain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, com.curso.cursomc.cursomcDomain.ItemPedidoPK>{
    
}
