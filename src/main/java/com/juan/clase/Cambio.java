package com.juan.clase;

public class Cambio {
	private int pesos;
	private int trm;
	private int dolares;
	
	public Cambio(int pesos, int trm, int dolares) {
		super();
		this.pesos = pesos;
		this.trm = trm;
		this.dolares = dolares;
	}
	public int getPesos() {
		return pesos;
	}
	public void setPesos(int pesos) {
		this.pesos = pesos;
	}
	public int getTrm() {
		return trm;
	}
	public void setTrm(int trm) {
		this.trm = trm;
	}
	public int getDolares() {
		return dolares;
	}
	public void setDolares(int dolares) {
		this.dolares = dolares;
	}
	
}
