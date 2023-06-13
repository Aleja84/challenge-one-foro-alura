package com.alura.api.usuario;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import lombok.Setter;

@Embeddable
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Usuario {
	
    public Usuario() {
		super();
	}
	public Usuario(DatosRegistroUsuario autor) {
		this.contrasena = autor.contrasena();
		this.email = autor.email();
		this.nombreUsuario = autor.nombre();
	}
	private Long idUsuario;
	private String nombreUsuario;
	private String email;
	private String contrasena;


	}
