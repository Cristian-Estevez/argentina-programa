package referencias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CrisculoTest {

	@Test
	public void creaCirculoParametrizadoTest() {
		Circulo c1 = new Circulo(3.2);
		assertNotNull(c1);
	}

	@Test
	public void creaCirculoParametrizadoYPidoRadioTest() {
		Circulo c1 = new Circulo(3.2);
		assertEquals(3.2, c1.getRadio(), 0.001);
	}
	
	@Test
	public void creaCirculoPorDefectoTest() {
		Circulo c1 = new Circulo();
		assertNotNull(c1);
	}
	
	@Test
	public void creaCirculoPorDefectoYPidoRadioTest() {
		Circulo c1 = new Circulo();
		assertEquals(1, c1.getRadio(), 0.001);
	}
	
	@Test
	public void referenciasIgualesTest() {
		Circulo c = new Circulo();
		Circulo o = c;
		assertTrue(o == c);
		assertTrue(o.equals(c));
	}
	

	@Test
	public void referenciasDistintasTest() {
		Circulo c = new Circulo();
		Circulo o = new Circulo();
		assertFalse(o == c);
		assertTrue(o.equals(c));
	}
	

	@Test (expected=Error.class)
	public void RadioInvalidoTest() {
		@SuppressWarnings("unused")
		Circulo c = new Circulo(-3);
	}
	
	
}
