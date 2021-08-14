package eraDeImperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtaquesTest {
	
	
	Soldado s1, s2;
	Caballero c2, c3;
	Arquero a2, a3;
	
	@Test
	public void elCAballeroVuelveALaBatallaYPuedeSeguirAtacando() {
		c2 = new Caballero(new Posicion(0, 0));
		c3 = new Caballero(new Posicion(1, 2));
		
		c2.atacar(c3);
		c2.atacar(c3);
		c2.atacar(c3);
		assertEquals(10, c3.getSalud());
		c2.atacar(c3);
		assertEquals(10, c3.getSalud());//no recibió daño porque el caballo se alejó
		c2.volverALaBatalla();
		c2.atacar(c3);
		assertEquals(0, c3.getSalud());
	}
	
	@Test
	public void elCaballoCorreAlQuererRealizarSextoAtaqueConsecutivo() {
		c2 = new Caballero(new Posicion(0, 0));
		c3 = new Caballero(new Posicion(1, 2));
		
		c2.atacar(c3);
		c2.atacar(c3);
		c2.atacar(c3);
		c2.atacar(c3);
		c2.atacar(c3);
		c2.atacar(c3);
	}
	
	@Test
	public void arqueroVuelveAHacerDañoDespuesDeRecargarFlechas() {
		a2 = new Arquero(new Posicion(0, 1));
		a3 = new Arquero(new Posicion(5, 1));
		
		assertEquals(100, a3.getSalud());
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		assertEquals(65, a3.getSalud());
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		assertEquals(65, a3.getSalud());
		a2.recargar();
		a2.atacar(a3);
		assertEquals(58, a3.getSalud());
	}
	
	@Test
	public void arqueroSeQuedaSinFlechasYNoHaceMasDaño() {
		a2 = new Arquero(new Posicion(0, 1));
		a3 = new Arquero(new Posicion(5, 1));
		
		assertEquals(100, a3.getSalud());
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		assertEquals(65, a3.getSalud());
		a2.atacar(a3);
		a2.atacar(a3);
		a2.atacar(a3);
		assertEquals(65, a3.getSalud());
	}

	@Test
	public void ataqueArqueroQuita7DeVida() {
		Arquero a1 = new Arquero(new Posicion(0, 1));
		Arquero u1 = new Arquero(new Posicion(5, 1));
		
		assertEquals(100, u1.getSalud());
		a1.atacar(u1);
		assertEquals(93, u1.getSalud());
	}
	
	@Test
	public void ataqueCaballeroQuita30DeVida() {
		Caballero c1 = new Caballero(new Posicion(0, 1));
		Arquero u1 = new Arquero(new Posicion(2, 1));
		
		assertEquals(100, u1.getSalud());
		c1.atacar(u1);
		assertEquals(70, u1.getSalud());
	}

	@Test
	public void ataqueSoldadoQuita20DeVida() {
		Soldado s3 = new Soldado(new Posicion(0, 1));
		Arquero u1 = new Arquero(new Posicion(1, 1));
		
		
		assertEquals(100, u1.getSalud());
		s3.atacar(u1);
		assertEquals(80, u1.getSalud());
	}
	
	@Test
	public void elSoldadoSeCansaDespuesDe3AtaquesSinDescansarYYaNoPuedeHacerDaño() {
		s1 = new Soldado(new Posicion(0, 1));
		s2 = new Soldado(new Posicion(1, 1));
		
		s1.atacar(s2);
		s1.atacar(s2);
		s1.atacar(s2);
		assertEquals(40, s2.getSalud());
		s1.atacar(s2);
		s1.atacar(s2);
		assertEquals(40, s2.getSalud());		
	}
	
	@Test
	public void elSoldadoPuedeVolverAAtacarDespuesDeQuedarseSinStaminaYdescansar() {
		s1 = new Soldado(new Posicion(0, 1));
		s2 = new Soldado(new Posicion(1, 1));
		
		s1.atacar(s2);
		s1.atacar(s2);
		s1.atacar(s2);
		assertEquals(40, s2.getSalud());
		s1.atacar(s2);
		assertEquals(40, s2.getSalud());
		s1.descansar();
		s1.atacar(s2);
		assertEquals(20, s2.getSalud());
	}
}
