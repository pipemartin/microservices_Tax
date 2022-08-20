package com.juan.clase;

public class Respuesta {
	private int a;
	private int b;
	private int respuesta;
	private String error = "Ninguno";
	
	public Respuesta(int a, int b, int respuesta, String error) {
		super();
		this.a = a;
		this.b = b;
		this.respuesta = respuesta;
		this.error = error;
	}
	public Respuesta(int a, int b,  String error) {
		super();
		this.a = a;
		this.b = b;
		this.error = error;
	}
	
	public Respuesta(int a, int b, int respuesta) {
		super();
		this.a = a;
		this.b = b;
		this.respuesta = respuesta;
	}
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	
	
}
