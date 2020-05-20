package org.PerezAlejo.tema8.ej01;

public class Cadena {
	
	private String cadena;
	
	public Cadena(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}

	public void cDelante(String concatenadoDelante) {
		cadena = concatenadoDelante + cadena;
	}
	
	public void cDetras(String concatenadoDetras) {
		cadena = cadena + concatenadoDetras;
	}
	
	public void quitar(char c) {
		cadena = cadena.replaceAll(Character.toString(c), "");
	}
	
	public void quitar(char c, int n) {
		for (int i = 0; i < n; i++) {
			cadena = cadena.replaceFirst(Character.toString(c), "");
		}
	}
 
}
