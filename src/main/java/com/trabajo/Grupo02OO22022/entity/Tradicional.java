package com.trabajo.Grupo02OO22022.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tradicional")
@Getter
@Setter
@RequiredArgsConstructor


public class Tradicional extends Aula{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	@Column(name = "cantBancos", nullable = false)
	private int cantBancos;
	
	@NotEmpty
	@Column(name = "pizarron", nullable = false)
	private int pizarron;

	@NotEmpty
	@Column(name = "tieneProyector", nullable = false)
	private int tieneProyector;


}
