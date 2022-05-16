package com.trabajo.Grupo02OO22022.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Final")
@Getter
@Setter
@RequiredArgsConstructor

public class Final extends NotaPedido{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	@Column(name = "fechaExamen", nullable = false)
	private LocalDate fechaExamen;
	
	

}
