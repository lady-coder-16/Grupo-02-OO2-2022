package com.trabajo.Grupo02OO22022.service;

import java.time.LocalDate;
import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Aula;
import com.trabajo.Grupo02OO22022.entity.Espacio;
import com.trabajo.Grupo02OO22022.repository.EspacioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("espacioService")
@Service
public class EspacioServiceImplements implements IEspacioService {

    @Autowired
    private EspacioRepository EspacioRepository;

    @Override
    public List<Espacio> listaEspacios() {
        
        return (List<Espacio>) EspacioRepository.findAll();
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
        return (List<Espacio>)EspacioRepository.findByLibreTrue();
    }

    @Override
    public Espacio traerEspacio(LocalDate fecha, char turno, Aula aula) {
        List<Espacio> espacio = this.listaEspacios();
        Espacio espacio1 = null;
        for(Espacio espacio2 : espacio){
            if(espacio2.getFecha().equals(fecha) && espacio2.getTurno() == turno && espacio2.getAula().getId()==aula.getId()){
                espacio1 = espacio2;
            }
        }
        return espacio1;
    }
    
}
