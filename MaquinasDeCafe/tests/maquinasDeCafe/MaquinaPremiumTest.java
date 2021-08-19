package maquinasDeCafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MaquinaPremiumTest {

	MaquinaDeCafe maquina;
	
	@Before
	public void setup() {
		maquina = new MaquinaPremium();
	}
	
	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		assertNotNull(vaso);
	}
	
	@Test
	public void  quePuedeServirUnCafe() {
		assertTrue(maquina.puedeServir());
	}
	
	@Test
	public void queSeAgotaElCafe() {
		for (int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		assertFalse(maquina.puedeServir());
	}
	
	@Test
	public void queLuegoDeAgotarELCafeSirveVasoVacio() {
		for (int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		VasoDeCafe vaso = maquina.servirCafe();
		assertFalse(vaso.estaLleno());
	}

}
