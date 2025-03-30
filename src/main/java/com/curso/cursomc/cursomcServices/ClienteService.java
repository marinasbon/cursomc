package com.curso.cursomc.cursomcServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursomc.cursomcDomain.Cliente;
import com.curso.cursomc.cursomcRepositories.ClienteRepository;
import com.curso.cursomc.cursomcServices.cursomcExceptions.ObjectNotFoundException;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}
