package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Laboratorio;
import com.trabajo.Grupo02OO22022.repository.LaboratorioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("laboratorioService")
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
        Laboratorio laboratorio = new Laboratorio();
        Laboratorio laboratorioABuscar = LaboratorioRepository.findById(id).orElse(null);
        if(laboratorioABuscar != null){
            laboratorio = laboratorioABuscar;
        }
        return laboratorio;
    }

    @Override
    public void eliminar(long id) {
        LaboratorioRepository.deleteById(id);
    }

   
    
}
