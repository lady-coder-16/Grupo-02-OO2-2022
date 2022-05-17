package com.trabajo.Grupo02OO22022.service;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.NotaPedido;
import com.trabajo.Grupo02OO22022.repository.NotaPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaPedidoServiceImplements implements INotaPedidoService {

    @Autowired
    private NotaPedidoRepository notaRepository;

	@Override
	public List<NotaPedido> listarTodos() {
	    return (List<NotaPedido>) notaRepository.findAll();
	}

	

	@Override
	public NotaPedido buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void guardar(NotaPedido nota) {
		notaRepository.save(nota); 		
	}

	
	@Override
	public void eliminar(long id) {
		notaRepository.deleteById(id);
		
	}




   


    
    
}
