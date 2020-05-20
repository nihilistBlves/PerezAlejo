package org.PerezAlejo.tema8.ej04;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.PerezAlejo.tema8.ej03.NumeroException;
import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	public void testOrdenar01() throws InputDataException {
		//ARRANGE

		int[] vectorDesorganizado = {3,2,1};
		int[] vectorOrganizadoManualmente = {1,2,3};
		
		//ACT
		
		int[] vectorOrganizadoPorMetodo = Vector.ordenar(vectorDesorganizado);
		
		//ASSERT
		
		assertArrayEquals(vectorOrganizadoManualmente, vectorOrganizadoPorMetodo, "Son iguales");
		
	}

	@Test
	public void testOrdenar02() throws InputDataException {
		//ARRANGE

		int[] vectorDesorganizado = {5,9,2};
		int[] vectorOrganizadoManualmente = {2,5,9};
		
		//ACT
		
		int[] vectorOrganizadoPorMetodo = Vector.ordenar(vectorDesorganizado);
		
		//ASSERT
		
		assertArrayEquals(vectorOrganizadoManualmente, vectorOrganizadoPorMetodo, "No son iguales");
		
	}
	
	@Test
	public void testOrdenar03() throws InputDataException {
		//ARRANGE

		int[] vectorDesorganizado = null;
		
		//ACT
		
		int[] vectorOrganizadoPorMetodo = Vector.ordenar(vectorDesorganizado);
		
		//ASSERT
		
		assertThrows(InputDataException.class, ()->Vector.ordenar(vectorDesorganizado));
		
	}
	
	
	
	
}
