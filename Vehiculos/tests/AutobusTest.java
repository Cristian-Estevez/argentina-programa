import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import vehiculos.Autobus;
import vehiculos.Persona;

public class AutobusTest {
	
	Persona carlitos, paola, sergio, raul, marina;
	Autobus el60;

	@Before
	public void setup() {
		carlitos = new Persona("Carlitos");
		paola = new Persona("Paola");
		sergio = new Persona("Sergio");
		raul = new Persona("Raul");
		marina = new Persona("Marina");
		el60 = new Autobus(carlitos);
		
	}
	
	@Test
	public void cambiaDeChoferCuandoNoHayPasajeros() {
		int pasajerosEsperados = 0;
		assertEquals(pasajerosEsperados, el60.getCantidadPasajerosAbordo());
		assertEquals(carlitos, el60.getChofer());
		el60.cambiarChofer(paola);
		assertEquals(paola, el60.getChofer());
	}
	
	@Test (expected=Error.class)
	public void noPermiteCambiarDeChoferConPasajerosABordo() {
		el60.subePasajero(paola);
		el60.subePasajero(sergio);
		el60.cambiarChofer(marina);
	}

	
}
