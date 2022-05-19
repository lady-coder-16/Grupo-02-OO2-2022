package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Curso;
import com.trabajo.Grupo02OO22022.repository.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("cursoService")
@Service
public class CursoServiceImplements implements ICursoService {

    @Autowired
    private CursoRepository CursoRepository;

    @Override
    public List<Curso> listaCursos() {
        
        return (List<Curso>) CursoRepository.findAll();
    }

    @Override
    public void guardar (Curso curso) {
        CursoRepository.save(curso);       
    }

    @Override
    public Curso buscarPorID(long id) { 
        return CursoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        CursoRepository.deleteById(id);
    }

   

    
}
