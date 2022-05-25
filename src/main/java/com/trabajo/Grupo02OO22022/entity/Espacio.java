package com.trabajo.Grupo02OO22022.entity;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "espacio")
@Getter
@Setter
@RequiredArgsConstructor
public class Espacio implements Serializable {

	public Espacio(LocalDate fecha2, char turno2, Aula aula2) {
		this.fecha = fecha2;
		this.turno = turno2;
		this.aula = aula2;
	}

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
	@Column(name = "turno", nullable = false)
	private char turno;
	
	@NotEmpty
	@Column(name = "libre", nullable = false)
	private boolean libre;
	
	@ManyToOne
    @JoinColumn(name = "aula_id")
	private Aula aula;
	
}
