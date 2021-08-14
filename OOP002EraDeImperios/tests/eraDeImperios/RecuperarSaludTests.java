package eraDeImperios;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class RecuperarSaludTests {

	Caballero c1, c2, c3;
	Arquero a1, a2, a3;
	Soldado s1, s2, s3;
	static Posicion p1 ,p2;
	
	@BeforeClass
	public static void setup() {
		p1 = new Posicion(1, 1);
		p2 = new Posicion(2, 2);
	}
	
	@Test
	public void dineroInicial150Test() {
		c1 = new Caballero(p1);
		int dineroInicialEsperado = 150;
		assertEquals(dineroInicialEsperado, c1.getDineroEnCartera());
	}
	
	@Test
	public void dineroenCarteraBaja75DespuesDeComprarPocionTest() {
		c1 = new Caballero(p2);
		int dineroEnCarteraEsperado = 75;
		int dineroInicialEsperado = 150;
		assertEquals(dineroInicialEsperado, c1.getDineroEnCartera());
		c1.comprarPocion();		
		assertEquals(dineroEnCarteraEsperado, c1.getDineroEnCartera());
	}

	@Test
	public void recuperaSaludDespuesDeTomarPocionTest() {
		c1 = new Caballero(p1);
		s1 = new Soldado(p2);
		
		int saludEsperadaDespuesDelAtaque = 70;
		int saludEsperadaDespuesDeComprarPocion = 100;
		
		c1.atacar(s1);
		assertEquals(saludEsperadaDespuesDelAtaque, s1.getSalud());
		s1.comprarPocion();
		assertEquals(saludEsperadaDespuesDeComprarPocion, s1.getSalud());
	}
}
