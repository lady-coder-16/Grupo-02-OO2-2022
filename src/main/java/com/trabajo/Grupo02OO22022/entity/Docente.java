package com.trabajo.Grupo02OO22022.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "docente")
@Getter
@Setter
@RequiredArgsConstructor
public class Docente extends Persona {
	@NotEmpty
	@Column(name="nroLegajo")
	private int nroLegajo;
	
	@ManyToOne
	@JoinColumn(name = "materia_id")
	private Materia materia;

}
