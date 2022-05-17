package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Laboratorio;
import com.trabajo.Grupo02OO22022.repository.LaboratorioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaboratorioServiceImplements implements ILaboratorioService {

    @Autowired
    private LaboratorioRepository LaboratorioRepository;


    @Override
    public List<Laboratorio> listarTodos() {   
        return (List<Laboratorio>)LaboratorioRepository.findAll();
    }

    @Override
    public void guardar (Laboratorio user) {
        LaboratorioRepository.save(user);       
    }

    @Override
    public Laboratorio buscarPorID(long id) { 
        return LaboratorioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        LaboratorioRepository.deleteById(id);
    }

   
    
}
