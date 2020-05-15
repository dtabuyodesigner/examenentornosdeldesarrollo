package com.sanvaleroexamendanieltabuyo.model;

import java.time.LocalDate;

public class DetalleCuadro extends Cuadro {

	private String tecnica;
	
	private int ancho;
	private int largo;
	
	public DetalleCuadro(String nombre, String apellidos, String curso, String email, LocalDate fecha_nacimiento,
			String nombre_cuadro, String nombre_alumno, String tecnica, int ancho, int largo) {
		super(nombre, apellidos, curso, email, fecha_nacimiento, nombre_cuadro, nombre_alumno);
		this.tecnica = tecnica;
		this.ancho = ancho;
		this.largo = largo;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}

	
	
}
