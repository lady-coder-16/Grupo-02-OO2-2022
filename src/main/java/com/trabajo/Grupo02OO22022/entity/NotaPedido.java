package com.trabajo.Grupo02OO22022.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notaPedido")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@RequiredArgsConstructor

public class NotaPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;

	@NotEmpty
	@Column(name = "turno", nullable = false, length = 60)
	private char turno;

	@NotEmpty
	@Column(name = "aula", nullable = false)
	private String aula;

	@NotEmpty
	@Column(name = "cantEstudiantes", nullable = false)
	private int cantEstudiantes;

	@NotEmpty
	@Column(name = "materia", nullable = false)
	private Materia materia;

	@NotEmpty
	@Column(name = "observaciones", nullable = false, length = 120)
	private String observaciones;

}
