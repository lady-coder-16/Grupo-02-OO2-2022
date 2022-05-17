package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Final;
import com.trabajo.Grupo02OO22022.repository.FinalRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinalServiceImplements implements IFinalService {

    @Autowired
    private FinalRepository FinalRepository;

    @Override
    public List<Final> listaFinal() {
        
        return (List<Final>) FinalRepository.findAll();
    }

    @Override
    public List<Final> listarTodos() {   
        return (List<Final>)FinalRepository.findAll();
    }

    @Override
    public void guardar (Final user) {
        FinalRepository.save(user);       
    }

    @Override
    public Final buscarPorID(long id) { 
        return FinalRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        FinalRepository.deleteById(id);
    }

   
    
}
