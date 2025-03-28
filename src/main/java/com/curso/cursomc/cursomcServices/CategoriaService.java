package com.curso.cursomc.cursomcServices;

import com.curso.cursomc.cursomcDomain.Categoria;
import com.curso.cursomc.cursomcRepositories.CategoriaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
