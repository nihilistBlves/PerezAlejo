package org.PerezAlejo.tema8.ej02;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesTest {

	@Test
	public void testEsFinDeSemana01() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esFinDeSemana(20, 5, 2020);
		} catch (FechaException e) {
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertFalse(tester.esFinDeSemana(20, 5, 2020));
		} catch (FechaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEsFinDeSemana02() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esFinDeSemana(23, 5, 2020);
		} catch (FechaException e) {
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertTrue(tester.esFinDeSemana(23, 5, 2020));
		} catch (FechaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEsFinDeSemana03() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esFinDeSemana(2, 2, 2019);
		} catch (FechaException e) {
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertTrue(tester.esFinDeSemana(2, 2, 2019));
		} catch (FechaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEsFinDeSemana04() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esFinDeSemana(11, 9, 2001);
		} catch (FechaException e) {
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertFalse(tester.esFinDeSemana(11, 9, 2001));
		} catch (FechaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEsFinDeSemana05() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esFinDeSemana(15, 3, 1800);
		} catch (FechaException e) {
			e.printStackTrace();
		}
		
		//ASSERT
		
		assertThrows(FechaException.class, ()->tester.esFinDeSemana(15,3,1800));
	}

	@Test
	public void testEsFinDeSemana06() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esFinDeSemana(28, 7, 3289);
		} catch (FechaException e) {
			e.printStackTrace();
		}
		
		//ASSERT
		
		assertThrows(FechaException.class, ()->tester.esFinDeSemana(15,3,1800));
	}

}
