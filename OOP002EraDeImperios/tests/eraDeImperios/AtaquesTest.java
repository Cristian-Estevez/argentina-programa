package eraDeImperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtaquesTest {

	@Test
	public void ataqueArqueroQuita7DeVida() {
		Arquero a1 = new Arquero(new Posicion(0, 1));
		Unidad u1 = new Unidad(new Posicion(5, 1));
		
		assertEquals(100, u1.getSalud());
		a1.atacar(u1);
		assertEquals(93, u1.getSalud());
	}
	
	@Test
	public void ataqueCaballeroQuita30DeVida() {
		Caballero c1 = new Caballero(new Posicion(0, 1));
		Unidad u1 = new Unidad(new Posicion(2, 1));
		
		assertEquals(100, u1.getSalud());
		c1.atacar(u1);
		assertEquals(70, u1.getSalud());
	}

	@Test
	public void ataqueSoldadoQuita20DeVida() {
		Soldado s1 = new Soldado(new Posicion(0, 1));
		Unidad u1 = new Unidad(new Posicion(1, 1));
		
		assertEquals(100, u1.getSalud());
		s1.atacar(u1);
		assertEquals(80, u1.getSalud());
	}
	
}
