package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.Aula;

public interface IAulaService {

    public List <Aula> listaAulas();
    public void guardar (Aula aula);
    public Aula buscarPorID (long id);

    
}
