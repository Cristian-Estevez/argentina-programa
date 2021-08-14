package eraDeImperios;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ObtenerDineroTest {

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
	public void alMorirPierdeELDineroTest() {
		s1 = new Soldado(p1);
		s2 = new Soldado(p2);
		
		int dineroEsperadoAlInicio = 150;
		int dineroEsperadoAlMorir = 0;
		
		assertEquals(dineroEsperadoAlInicio, s2.getDineroEnCartera());
		
		for (int i = 0; i < 5; i++) {
			s1.atacar(s2);
			s1.descansar();
		}
		assertEquals(0, s2.getSalud());
		assertFalse(s2.estaVivo());
		assertEquals(dineroEsperadoAlMorir, s2.getDineroEnCartera());
	}

	@Test
	public void aumentaElDineroEnCarteraAlMatarEnemigos() {
		s1 = new Soldado(p1);
		c2 = new Caballero(p2);
		a2 = new Arquero(p2);

		int dineroEsperadoAlMatarAUnEnemigoCon150 = 300;
		int dineraEsperadoAlMatarAUnEnemigoQueHabiaGastadoEnUnaPocion = 375;
		for (int i = 0; i <= 6; i++) {
			s1.atacar(c2);
			s1.descansar();
		}
		assertEquals(dineroEsperadoAlMatarAUnEnemigoCon150, s1.getDineroEnCartera());
		a2.comprarPocion();
		for (int i = 0; i <= 6; i++) {
			s1.atacar(a2);
			s1.descansar();
		}
		assertEquals(dineraEsperadoAlMatarAUnEnemigoQueHabiaGastadoEnUnaPocion, 
				s1.getDineroEnCartera());		
	}
}
