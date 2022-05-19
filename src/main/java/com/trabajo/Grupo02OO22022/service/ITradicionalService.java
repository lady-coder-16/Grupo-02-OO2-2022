package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Tradicional;

public interface ITradicionalService {

    public List <Tradicional> listaTradicionals();
    public void guardar (Tradicional tradicional);
    public Tradicional buscarPorID (long id);
    public void eliminar (long id);

    
}
