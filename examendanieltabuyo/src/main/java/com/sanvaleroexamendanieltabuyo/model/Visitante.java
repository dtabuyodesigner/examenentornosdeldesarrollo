package com.sanvaleroexamendanieltabuyo.model;

public class Visitante {

	private String email;
	private String pass_visitante;
	
	
	public Visitante(String email, String pass_visitante) {
		super();
		this.email = email;
		this.pass_visitante = pass_visitante;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass_visitante() {
		return pass_visitante;
	}
	public void setPass_visitante(String pass_visitante) {
		this.pass_visitante = pass_visitante;
	}
	
	
	
}
