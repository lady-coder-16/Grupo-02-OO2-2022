package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Tradicional;
import com.trabajo.Grupo02OO22022.repository.TradicionalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradicionalServiceImplements implements ITradicionalService {

    @Autowired
    private TradicionalRepository TradicionalRepository;

    @Override
    public List<Tradicional> listaTradicionals() {
        
        return (List<Tradicional>) TradicionalRepository.findAll();
    }

    @Override
    public List<Tradicional> listarTodos() {   
        return (List<Tradicional>)TradicionalRepository.findAll();
    }

    @Override
    public void guardar (Tradicional user) {
        TradicionalRepository.save(user);       
    }

    @Override
    public Tradicional buscarPorID(long id) { 
        return TradicionalRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        TradicionalRepository.deleteById(id);
    }

    @Override
    public List<Tradicional> listarActivos() {
        return (List<Tradicional>)TradicionalRepository.findByEnabledTrue();
    }

    
}
