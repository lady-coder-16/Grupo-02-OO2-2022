package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Espacio;
import com.trabajo.Grupo02OO22022.repository.EspacioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspacioServiceImplements implements IEspacioService {

    @Autowired
    private EspacioRepository EspacioRepository;

    @Override
    public List<Espacio> listaEspacios() {
        
        return (List<Espacio>) EspacioRepository.findAll();
    }

    @Override
    public List<Espacio> listarTodos() {   
        return (List<Espacio>)EspacioRepository.findAll();
    }

    @Override
    public void guardar (Espacio user) {
        EspacioRepository.save(user);       
    }

    @Override
    public Espacio buscarPorID(long id) { 
        return EspacioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        EspacioRepository.deleteById(id);
    }

    @Override
    public List<Espacio> listarActivos() {
        return (List<Espacio>)EspacioRepository.findByEnabledTrue();
    }

    
}
