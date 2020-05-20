package org.PerezAlejo.tema8.ej03;

public class Utilidades {

	public boolean esPrimo(int numero) throws NumeroException {
		if (numero<0 || numero>1000000) {
			throw new NumeroException("El numero es menor de cero o mayor que un millon.");
		}
		return false;
	}
	
}
