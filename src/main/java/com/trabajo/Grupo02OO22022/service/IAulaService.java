package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Aula;

public interface IAulaService {

    public List <Aula> listaAulas();
    public List <Aula> listarTodos();
    public List <Aula> listarActivos();
    public void guardar (Aula user);
    public Aula buscarPorID (long id);
    public void eliminar (long id);

    
}
