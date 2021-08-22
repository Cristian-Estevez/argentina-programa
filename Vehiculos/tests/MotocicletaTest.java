import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import vehiculos.Motocicleta;
import vehiculos.Persona;

public class MotocicletaTest {

	Persona carlitos, paola, sergio, raul, marina;
	Motocicleta unaMoto;

	@Before
	public void setup() {
		carlitos = new Persona("Carlitos");
		paola = new Persona("Paola");
		sergio = new Persona("Sergio");
		raul = new Persona("Raul");
		marina = new Persona("Marina");
		unaMoto = new Motocicleta(carlitos);
		
	}

	@Test
	public void cambiaDeChoferCuandoNoHayPasajeros() {
		int pasajerosEsperados = 0;
		assertEquals(pasajerosEsperados, unaMoto.getCantidadPasajerosAbordo());
		assertEquals(carlitos, unaMoto.getChofer());
		unaMoto.cambiarChofer(paola);
		assertEquals(paola, unaMoto.getChofer());
	}
	
	@Test (expected=Error.class)
	public void noPermiteCambiarDeChoferConPasajerosABordo() {
		unaMoto.subeAcompañante(paola);
		assertFalse(unaMoto.estaVacio());
		unaMoto.cambiarChofer(marina);
	}
}
