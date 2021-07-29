package punto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PuntoTest {

	Punto p1, p2, p3, p4;
	
	@Before
	public void setup() {
		p1 = new Punto(0, 0);
		p2 = new Punto(0, 1);
		p3 = new Punto(1, 0);
		p4 = new Punto(12, 58);
	}
	
	@Test
	public void esOrigenDeCoordenadasTrueTest() {
		assertTrue(p1.esELOrigen());
	}
	
	@Test
	public void estaSobreEjeXTrueTest() {
		assertTrue(p1.estaSobreEjeX());
	}
	
	@Test
	public void estaSobreEjeYTrueTest() {
		assertTrue(p1.estaSobreEjeY());
	}
	
	@Test
	public void estaSobreEjeXFalseTest() {
		assertFalse(p2.estaSobreEjeX());
	}

	@Test
	public void estaSobreEjeYFalseTest() {
		assertFalse(p3.estaSobreEjeY());
	}
	
	@Test
	public void esOrigenDeCoordenadasFalseTest() {
		assertFalse(p4.esELOrigen());
	}
	
	@Test
	public void empiezaSiendoOrigenYDejaDeSerlo() {
		assertTrue(p1.esELOrigen());
		p1.setY(2);
		assertFalse(p1.esELOrigen());
	}
	
	@Test
	public void primeroNoEsOrigenYLuegoSi() {
		assertFalse(p2.esELOrigen());
		p2.setY(0);
		assertTrue(p2.esELOrigen());
	}
	
	
}
