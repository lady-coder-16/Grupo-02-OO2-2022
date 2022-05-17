package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Aula;
import com.trabajo.Grupo02OO22022.repository.AulaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaServiceImplements implements IAulaService {

    @Autowired
    private AulaRepository AulaRepository;

    @Override
    public List<Aula> listaAulas() {
        
        return (List<Aula>) AulaRepository.findAll();
    }

    @Override
    public List<Aula> listarTodos() {   
        return (List<Aula>)AulaRepository.findAll();
    }

    @Override
    public void guardar (Aula user) {
        AulaRepository.save(user);       
    }

    @Override
    public Aula buscarPorID(long id) { 
        return AulaRepository.findById(id).orElse(null);
    }
   

    
}
