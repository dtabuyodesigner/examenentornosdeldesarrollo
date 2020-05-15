package com.sanvaleroexamendanieltabuyo.model;

import java.awt.List;

public class Concurso {

	
	private String nombre_concurso;
	private String web;
	
	public Concurso(String nombre_concurso, String web) {
		super();
		this.nombre_concurso = nombre_concurso;
		this.web = web;
	}

	public String getNombre_concurso() {
		return nombre_concurso;
	}

	public void setNombre_concurso(String nombre_concurso) {
		this.nombre_concurso = nombre_concurso;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	// Lista de usuarios registrados en la web
	List<Visitante> usuarios;
	public​ Concurso() {
	Usuarios = ​ new​ ArrayList<>();
	}
	public​ ​ void​ puntuar(Usuario usuario, Cuadro cuadro, ​ int​ puntos) {
	if​ (!Usuarios.contains(usuario)) {
	throw​ ​ new​ NoRegistradoException("Debes estar registrado para poder puntuar");
	}
	if​ ((puntuacion < 0) || (puntuacion > 5)) {
	throw​ ​ new​ PuntuacionIncorrectaException("")
	}
	cuadro.sumarPuntuacion(puntuacion);
	}
	}
	


}
