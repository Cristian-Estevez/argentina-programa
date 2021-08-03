	package sumo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuchadorTest {

	@Test
	public void dominioTotal() {
		Luchador uno = new Luchador(300, 1500);
		Luchador dos = new Luchador(290, 1450);
		assertTrue(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void dominioPeso() {
		Luchador uno = new Luchador(300, 1500);
		Luchador dos = new Luchador(290, 1500);
		assertTrue(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void dominioAltura() {
		Luchador uno = new Luchador(300, 1500);
		Luchador dos = new Luchador(300, 1450);
		assertTrue(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void empate() {
		Luchador uno = new Luchador(300, 1500);
		Luchador dos = new Luchador(300, 1500);
		assertFalse(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test 
	public void ningunoDomina() {
		Luchador uno = new Luchador(290, 1500);
		Luchador dos = new Luchador(300, 1450);
		
		assertFalse(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}

}
