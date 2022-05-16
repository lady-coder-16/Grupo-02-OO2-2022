package com.trabajo.Grupo02OO22022.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.InheritanceType;


@Entity
@Table (name = "curso")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter @RequiredArgsConstructor

public class Curso extends NotaPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	@NotEmpty
	@Column(name = "codCurso", nullable = false, length = 60)
	private String carrera;
	
	@NotEmpty
	@Column(name = "proyector", nullable = false, length = 60)
	private boolean proyector;
	

	

}
