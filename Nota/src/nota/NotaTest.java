package nota;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NotaTest {

	@Test
	public void inicializacionTest() {
		Nota n1 = new Nota(4);
		assertNotNull(n1);
	}

	@Test 
	public void obtenerValorTest() {
		Nota n1 = new Nota(4);
		int esperado = 4;
		int obtenido = n1.obtenerValor();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void aprobado4Test() {
		Nota nAp = new Nota(4);
		assertTrue(nAp.aprobado());
	}
	
	@Test
	public void aprobado10Test() {
		Nota nAp = new Nota(10);
		assertTrue(nAp.aprobado());
	}
	
	@Test
	public void desaprobado3Test() {
		Nota nIns = new Nota(3);
		assertFalse(nIns.aprobado());
	}
	
	@Test
	public void desaprobado0Test() {
		Nota nIns = new Nota(0);
		assertFalse(nIns.aprobado());
	}
	
	@Test
	public void recuperaYSubeNotaTest() {
		Nota nP1 = new Nota(2);
		assertTrue(nP1.desaprobado());
		
		nP1.recuperar(8);
		assertEquals(8, nP1.obtenerValor());
		assertTrue(nP1.aprobado());
	}
	
	@Test
	public void recuperaYNoSubeNotaTest() {
		Nota nP1 = new Nota(5);
		nP1.recuperar(2);
		assertEquals(5, nP1.obtenerValor());
		assertTrue(nP1.aprobado());
	}
	
	@Test(expected = Error.class)
	public void valorIncorrectoTest() {
		@SuppressWarnings("unused")
		Nota n1 = new Nota(11);
	}
	
}
