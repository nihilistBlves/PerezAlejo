package org.PerezAlejo.tema8.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.PerezAlejo.tema8.ej01.Cadena;
import org.junit.jupiter.api.Test;

class CadenaTest {

	@Test
	public void testcDelante01() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.cDelante("a");

		// ASSERT
		assertEquals("aguacamole", tester.getCadena(), "a+guacamole=aguacamole");
	}

	@Test
	public void testcDelante02() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.cDelante("");

		// ASSERT
		assertEquals("guacamole", tester.getCadena(), "NULL+guacamole=guacamole");
	}

	@Test
	public void testcDelante03() {
		// ARRANGE
		Cadena tester = new Cadena("");

		// ACT
		tester.cDelante("guacamole");

		// ASSERT
		assertEquals("guacamole", tester.getCadena(), "guacamole+NULL=guacamole");
	}

	@Test
	public void testcDelante04() {
		// ARRANGE
		Cadena tester = new Cadena("");

		// ACT
		tester.cDelante("");

		// ASSERT
		assertEquals("", tester.getCadena(), "NULL+NULL=NULL");
	}

	// ================================================================================

	@Test
	public void testcDetras01() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.cDetras("a");

		// ASSERT
		assertEquals("guacamolea", tester.getCadena(), "guacamole+a=guacamolea");
	}

	@Test
	public void testcDetras02() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.cDetras("");

		// ASSERT
		assertEquals("guacamole", tester.getCadena(), "guacamole+NULL=guacamole");
	}

	@Test
	public void testcDetras03() {
		// ARRANGE
		Cadena tester = new Cadena("");

		// ACT
		tester.cDetras("guacamole");

		// ASSERT
		assertEquals("guacamole", tester.getCadena(), "NULL+guacamole=guacamole");
	}

	@Test
	public void testcDetras04() {
		// ARRANGE
		Cadena tester = new Cadena("");

		// ACT
		tester.cDetras("");

		// ASSERT
		assertEquals("", tester.getCadena(), "NULL+NULL=NULL");
	}

	// ================================================================================

	@Test
	public void quitarChar01() {
		// ARRANGE
		Cadena tester = new Cadena("_o_");

		// ACT
		tester.quitar('o');

		// ASSERT
		assertEquals("__", tester.getCadena());
	}

	@Test
	public void quitarChar02() {
		// ARRANGE
		Cadena tester = new Cadena("_._P_._");

		// ACT
		tester.quitar('P');

		// ASSERT
		assertEquals("_.__._", tester.getCadena());
	}

	@Test
	public void quitarChar03() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.quitar('i');

		// ASSERT
		assertEquals("guacamole", tester.getCadena());
	}

	// ==========================================================================

	@Test
	public void quitarCharInt01() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.quitar('a', 1);

		// ASSERT
		assertEquals("gucamole", tester.getCadena());
	}

	@Test
	public void quitarCharInt02() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.quitar('a', 2);

		// ASSERT
		assertEquals("gucmole", tester.getCadena());
	}

	@Test
	public void quitarCharInt03() {
		// ARRANGE
		Cadena tester = new Cadena("guaAcaAmoAleA");

		// ACT
		tester.quitar('A', 7);

		// ASSERT
		assertEquals("guacamole", tester.getCadena());
	}

	@Test
	public void quitarCharInt04() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.quitar('u', 0);

		// ASSERT
		assertEquals("guacamole", tester.getCadena());
	}

	@Test
	public void quitarCharInt05() {
		// ARRANGE
		Cadena tester = new Cadena("guacamole");

		// ACT
		tester.quitar('u', -1);

		// ASSERT
		assertEquals("guacamole", tester.getCadena());
	}
}
