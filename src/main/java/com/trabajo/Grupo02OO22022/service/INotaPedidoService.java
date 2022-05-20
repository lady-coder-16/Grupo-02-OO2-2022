package com.trabajo.Grupo02OO22022.service;

import java.util.List;
import com.trabajo.Grupo02OO22022.entity.NotaPedido;

public interface INotaPedidoService {

    public List <NotaPedido> listarTodos();
    public void guardar (NotaPedido notaPedido);
    public NotaPedido buscarPorID (long id);
    public void eliminar (long id);

    
}
