package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Espacio;

public interface IEspacioService {

    public List <Espacio> listaEspacios();
    public List <Espacio> listarTodos();
    public List <Espacio> listarActivos();
    public void guardar (Espacio user);
    public Espacio buscarPorID (long id);
    public void eliminar (long id);

    
}
