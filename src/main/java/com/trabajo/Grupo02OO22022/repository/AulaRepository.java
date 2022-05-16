package com.trabajo.Grupo02OO22022.repository;

import java.util.List;

import com.trabajo.Grupo02OO22022.entity.Aula;
import com.trabajo.Grupo02OO22022.entity.Persona;
import com.trabajo.Grupo02OO22022.entity.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AulaRepository extends CrudRepository<Aula, Long> {

    List<Aula> findAll();
    List<Aula> findByEnabledTrue();
 
}
