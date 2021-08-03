package eraDeImperios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnidadTest {

	@Test
	public void calcularDistanciaEntreUnidadesTest() {
		Unidad u1 = new Unidad(new Posicion(0, 0));
		Unidad u2 = new Unidad(new Posicion(1, 1));
		assertEquals(Math.sqrt(2), u1.distanciaCon(u2), 0);
	}
	
	@Test
	public void pruebasDeAtaqueADiferentesDistancias() {
		Unidad u1 = new Unidad(new Posicion(0, 0));
		Unidad u2 = new Unidad(new Posicion(1, 1));
		Unidad u3 = new Unidad(new Posicion(0, 2));

		assertEquals(100, u2.getSalud());
		u1.atacar(u2);
		assertEquals( 90, u2.getSalud());

		assertEquals(100, u3.getSalud());
		u1.atacar(u3);
		assertEquals(100, u3.getSalud());
	}

}
