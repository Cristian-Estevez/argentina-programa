import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import torneodearqueria.Tiro;

public class TiroTest {

	Tiro entre0Y10, entre10Y20, entre20Y30, entre30Y40, entre40Y50, tiroFuera;

	@Before
	public void setup() {
		entre0Y10 = new Tiro(1, 1);
		entre10Y20 = new Tiro(13, 15);
		entre20Y30 = new Tiro(17, 15);
		entre30Y40 = new Tiro(32, -20);
		entre40Y50 = new Tiro(-45, -5);
		tiroFuera = new Tiro(55, 55);
	}

	@Test
	public void getDistanciaConCentro() {
		double distanciaEsperadaPrimero = 1.41;
		double distanciaEsperadaSegundo = 19.84;
		double distanciaEsperadaTercero = 22.67;
		assertEquals(distanciaEsperadaPrimero, entre0Y10.getDistanciaDelCentro(), 0.01);
		assertEquals(distanciaEsperadaSegundo, entre10Y20.getDistanciaDelCentro(), 0.01);
		assertEquals(distanciaEsperadaTercero, entre20Y30.getDistanciaDelCentro(), 0.01);
	}

	@Test
	public void unTiroFueraDeLaDianaDaCeroPuntos() {
		int diametroDeDiana = 50;
		double distanciaDelCentroTiroFuera = tiroFuera.getDistanciaDelCentro();
		assertTrue(distanciaDelCentroTiroFuera > 50);
		assertEquals(0, tiroFuera.getPuntajeTiro());
	}

	@Test
	public void puntajesCorrectos() {
		/*
		 * Si la distancia al centro es <= 10 cm vale 1000 puntos. Si la distancia al
		 * centro es mayor que 10 cm y <= 20 cm vale 500 puntos. Si la distancia al
		 * centro es mayor que 20 cm y <= 30 cm vale 200 puntos. Si la distancia al
		 * centro es mayor que 30 cm y <= 40 cm vale 100 puntos. Si la distancia al
		 * centro es mayor que 40 cm y <= 50 cm vale 50 puntos. Más de 50 cm del centro
		 * es tiro inválido y no obtiene puntaje.
		 */
		assertEquals(1000, entre0Y10.getPuntajeTiro());
		assertEquals(500, entre10Y20.getPuntajeTiro());
		assertEquals(200, entre20Y30.getPuntajeTiro());
		assertEquals(100, entre30Y40.getPuntajeTiro());
		assertEquals(50, entre40Y50.getPuntajeTiro());

	}
}
