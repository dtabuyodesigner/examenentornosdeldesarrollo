package com.sanvaleroexamendanieltabuyo.model;

public class AccionesVisitante extends Visitante {

	
	private int valoracion;
	private int veces_vota;
	
	
	public AccionesVisitante(String email, String pass_visitante, int valoracion, int veces_vota) {
		super(email, pass_visitante);
		this.valoracion = valoracion;
		this.veces_vota = veces_vota;
	}


	public int getValoracion() {
		return valoracion;
	}


	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}


	public int getVeces_vota() {
		return veces_vota;
	}


	public void setVeces_vota(int veces_vota) {
		this.veces_vota = veces_vota;
	}
	
	
	
}
