package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Curso;

public interface ICursoService {

    public List <Curso> listaCursos();
    public void guardar (Curso curso);
    public Curso buscarPorID (long id);
    public void eliminar (long id);

    
}
