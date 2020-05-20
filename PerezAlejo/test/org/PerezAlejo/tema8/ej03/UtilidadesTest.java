package org.PerezAlejo.tema8.ej03;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesTest {

	@Test
	public void testEsPrimo01() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esPrimo(4);
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertFalse(tester.esPrimo(4));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testEsPrimo02() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esPrimo(7);
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertTrue(tester.esPrimo(7));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testEsPrimo03() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esPrimo(18);
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertFalse(tester.esPrimo(18));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testEsPrimo04() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esPrimo(71);
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ASSERT
		
		try {
			assertTrue(tester.esPrimo(71));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testEsPrimo05() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esPrimo(-12);
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ASSERT
		
		assertThrows(NumeroException.class, ()->tester.esPrimo(-12));
		
	}
	
	@Test
	public void testEsPrimo06() {
		//ARRANGE
		
		Utilidades tester = new Utilidades();
		
		//ACT
		
		try {
			tester.esPrimo(1000001);
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ASSERT
		
		assertThrows(NumeroException.class, ()->tester.esPrimo(1000001));
		
	}

}
