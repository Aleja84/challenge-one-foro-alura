package com.alura.api.topico;
import java.util.*;

import com.alura.api.curso.Curso;
import com.alura.api.model.StatusTopico;
import com.alura.api.respuesta.Respuesta;
import com.alura.api.usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Table(name="topicos")
@Entity(name="Topico")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {
    public Topico(DatosRegistroTopico topico) {
    	this.autor = new Usuario(topico.autor());
    	this.curso = new Curso(topico.curso());
    	this.titulo = topico.titulo();
    	this.mensaje = topico.mensaje();
    	
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idTopico;
	private String titulo;
	private String mensaje;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusTopico status = StatusTopico.NO_RESPONDIDO;
	@Embedded
	private Usuario autor;
	@Embedded
	private Curso curso;
	@OneToMany(mappedBy = "topico")
	private List<Respuesta> respuestas = new ArrayList<>();

	

}
