package com.alura.api.topico;


import com.alura.api.curso.DatosRegistroCurso;
import com.alura.api.usuario.DatosRegistroUsuario;


	
	public record DatosRegistroTopico(String titulo, String mensaje, DatosRegistroCurso curso, DatosRegistroUsuario autor) {}
			


