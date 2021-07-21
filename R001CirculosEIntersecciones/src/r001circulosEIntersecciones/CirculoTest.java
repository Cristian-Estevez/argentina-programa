package r001circulosEIntersecciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {
	Circulo circuloA, circuloB;

	@Test
	public void intersectaConExtremoFalseTest() {
		// caso extremo, si el radio del circuloB pasa a 0.42 hay intersección
		circuloA = new Circulo(new Punto(0, 0), 1);
		circuloB = new Circulo(new Punto(1, 1), 0.41);
		assertFalse(circuloA.intersectaCon(circuloB));
	}

	@Test
	public void  intersectaConExtremoTrueTest() {
		// agregando solo un centecimo al radio de cualquiera de los círculos, respecto dl test anterior, se cumple con la prueba
		circuloA = new Circulo(new Punto(0, 0), 1.01); 
		circuloB = new Circulo(new Punto(1, 1), 0.41);
		assertTrue(circuloA.intersectaCon(circuloB));
	}
	
	@Test
	public void granInterseccionTest() {
		circuloA = new Circulo(new Punto(1, 1), 3);
		circuloB = new Circulo(new Punto(1, 2), 3);
		assertTrue(circuloA.intersectaCon(circuloB));
	}
	
	@Test
	public void circulosIgualesDaTrueTest() {
		circuloA = new Circulo(new Punto(1, 1), 9);
		circuloB = new Circulo(new Punto(1, 1), 9);
		assertTrue(circuloA.intersectaCon(circuloB));
	}
	
	@Test
	public void getDistanciaPuntosValoresNegativosTest() {
		circuloA = new Circulo(new Punto(-2, -10), 1.01); 
		circuloB = new Circulo(new Punto(1, -99), 0.41);
		assertEquals(89.05, circuloA.getDistanciaPuntos(circuloB), 0.001);
	}
}
