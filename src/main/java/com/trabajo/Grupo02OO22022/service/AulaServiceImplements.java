package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Aula;
import com.trabajo.Grupo02OO22022.repository.AulaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("aulaService")
@Service
public class AulaServiceImplements implements IAulaService {

    @Autowired
    private AulaRepository aulaRepository;

    @Override
    public List<Aula> listaAulas() {
        
        return (List<Aula>) aulaRepository.findAll();
    }

    @Override
    public void guardar (Aula user) {
        aulaRepository.save(user);       
    }

    @Override
    public Aula buscarPorID(long id) { 
        return aulaRepository.findById(id).orElse(null);
    }
   

    
}
