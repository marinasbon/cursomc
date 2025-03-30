package com.curso.cursomc.cursomcServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursomc.cursomcDomain.Pedido;
import com.curso.cursomc.cursomcRepositories.PedidoRepository;
import com.curso.cursomc.cursomcServices.cursomcExceptions.ObjectNotFoundException;


@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}
