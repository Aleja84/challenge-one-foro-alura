package com.alura.api.curso;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Embeddable
public class Curso {
    
	public Curso(DatosRegistroCurso curso) {
		this.categoria = curso.categoria();
		this.nombreCurso = curso.nombre();
	}
	private Long idCurso;
	private String nombreCurso;
	private String categoria;
	
	public Curso() {
		super();
	}

	
	

}
