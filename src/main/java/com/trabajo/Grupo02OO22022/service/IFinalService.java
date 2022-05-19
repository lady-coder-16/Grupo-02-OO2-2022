package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Final;


public interface IFinalService {

    public List <Final> listaFinal();
    public void guardar (Final final1);
    public Final buscarPorID (long id);
    public void eliminar (long id);

    
}
