package com.sanvaleroexamendanieltabuyo.model;

import java.time.LocalDate;

public class Cuadro extends Alumnos {

	
	private String nombre_cuadro;
	private String nombre_alumno;
	
	public Cuadro(String nombre, String apellidos, String curso, String email, LocalDate fecha_nacimiento,
			String nombre_cuadro, String nombre_alumno) {
		super(nombre, apellidos, curso, email, fecha_nacimiento);
		this.nombre_cuadro = nombre_cuadro;
		this.nombre_alumno = nombre_alumno;
	}

	public String getNombre_cuadro() {
		return nombre_cuadro;
	}

	public void setNombre_cuadro(String nombre_cuadro) {
		this.nombre_cuadro = nombre_cuadro;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}
	
	
	
	
}
