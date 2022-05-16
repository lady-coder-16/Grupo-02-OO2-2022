package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Curso;

public interface ICursoService {

    public List <Curso> listaCursos();
    public List <Curso> listarTodos();
    public List <Curso> listarActivos();
    public void guardar (Curso user);
    public Curso buscarPorID (long id);
    public void eliminar (long id);

    
}
