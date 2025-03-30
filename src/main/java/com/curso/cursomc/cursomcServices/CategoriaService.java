package com.curso.cursomc.cursomcServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursomc.cursomcDomain.Categoria;
import com.curso.cursomc.cursomcRepositories.CategoriaRepository;
import com.curso.cursomc.cursomcServices.cursomcExceptions.ObjectNotFoundException;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
