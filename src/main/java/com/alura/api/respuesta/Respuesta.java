package com.alura.api.respuesta;

import java.time.LocalDateTime;

import com.alura.api.topico.Topico;
import com.alura.api.usuario.Usuario;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "Respuesta")
@Table(name = "respuestas")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Respuesta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRespuesta;
	private String mensaje;
	@ManyToOne
	private Topico topico;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	private Usuario autor;
	private Boolean solucion = false;


}
