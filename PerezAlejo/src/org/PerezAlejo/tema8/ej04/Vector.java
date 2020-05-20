package org.PerezAlejo.tema8.ej04;

public class Vector {
	
	public static int[] ordenar(int[] vector) throws InputDataException{
		if (vector.equals(null) || vector.length>5000) {
			throw new InputDataException("El vector es nulo o supera los 5000 elementos");
		}
		return null;
	}

}
