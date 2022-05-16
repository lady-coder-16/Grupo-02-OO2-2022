package com.trabajo.Grupo02OO22022.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Materia")
@Getter
@Setter
@RequiredArgsConstructor

public class Materia implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY) 
    private long id;

    @NotEmpty
    @Column(name="codMateria", nullable=false)
    private int codMateria;
    
    @NotEmpty
    @Column(name="materia", nullable=false, length=45)
    private String materia;
    
    @Column(name="apellido", nullable=false, length=45)
    private String apellido;
    
    
    //Faltan las relaciones entre carrera/docente con materia
    @NotEmpty
    private Carrera carrea;
    @NotEmpty
    private Docente docente; 

  
}
