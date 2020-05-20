package org.PerezAlejo.tema8.ej02;

public class Utilidades {

	public boolean esFinDeSemana(int dia, int mes, int año) throws FechaException{
		if (año<1900 || año>3000) {
			throw new FechaException("Fecha fuera del intervalo");
		}
		
		return false;
	}
	
}
