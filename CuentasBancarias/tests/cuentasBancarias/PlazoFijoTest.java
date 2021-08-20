package cuentasBancarias;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cuentasbancarias.Cuenta;
import cuentasbancarias.PlazoFijo;

public class PlazoFijoTest {

	Cuenta cuenta2000, cuenta5000, cuenta0;
	PlazoFijo plazo1;
	
	@Before
	public void setup() {
		cuenta2000 = new Cuenta(2000);
		plazo1 = new PlazoFijo(cuenta2000);
	}
	
	@Test
	public void depositoDineroEnPlazoFijoELSaldoDeLaCuentaDisminuye() {
		double saldoEsperado = 1000;
		plazo1.ponerAPlazoFijo(1000);
		assertEquals(saldoEsperado, cuenta2000.getSaldo(), 0);
	}
	
	@Test
	public void plazoFijoDevuelveConIntereses() {
		double saldoEsperado = 2030;
		plazo1.ponerAPlazoFijo(1000);
		plazo1.recuperarDinero();
		assertEquals(saldoEsperado, cuenta2000.getSaldo(), 0);
	}
	
	@Test (expected=Error.class)
	public void noSePuedePonerAPlazoFijoSaldoInsuficienteEnCuenta() {
		plazo1.ponerAPlazoFijo(2001);
	}

}
