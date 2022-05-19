package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Tradicional;
import com.trabajo.Grupo02OO22022.repository.TradicionalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("tradicionalService")
@Service
public class TradicionalServiceImplements implements ITradicionalService {

    @Autowired
    private TradicionalRepository TradicionalRepository;

    @Override
    public List<Tradicional> listaTradicionals() {
        
        return (List<Tradicional>) TradicionalRepository.findAll();
    }

    @Override
    public void guardar (Tradicional tradicional) {
        TradicionalRepository.save(tradicional);       
    }

    @Override
    public Tradicional buscarPorID(long id) { 
        Tradicional tradicional = new Tradicional();
        Tradicional tradicionalABuscar = TradicionalRepository.findById(id).orElse(null);
        if(tradicionalABuscar != null){
            tradicional = tradicionalABuscar;
        }
        return tradicional;
    }


    @Override
    public void eliminar(long id) {
        TradicionalRepository.deleteById(id);
    }

   

    
}
