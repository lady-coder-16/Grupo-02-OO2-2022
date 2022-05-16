package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Laboratorio;



public interface ILaboratorioService {

    public List <Laboratorio> listarTodos();
    public List <Laboratorio> listarActivos();
    public void guardar (Laboratorio Laboratorio);
    public Laboratorio buscarPorID (long id);
    public void eliminar (long id);
   
    
}
