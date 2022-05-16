package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Materia;

public interface IMateriaService {

    public List <Materia> listaMaterias();
    public List <Materia> listarTodos();

    public void guardar (Materia user);
    public Materia buscarPorID (long id);
    public void eliminar (long id);

    
}
