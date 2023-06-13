package com.alura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.api.topico.DatosRegistroTopico;
import com.alura.api.topico.Topico;
import com.alura.api.topico.TopicoRepository;


@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@PostMapping
	public void registrarTopico(@RequestBody DatosRegistroTopico topico) {
		topicoRepository.save(new Topico (topico));
		System.out.println("El request llega correctamente");
		System.out.println(topico);
		
	}
	

}
