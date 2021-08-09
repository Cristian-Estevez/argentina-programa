package cuentasBancarias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import cuentasbancarias.Cuenta;

public class CuentaTest {
	Cuenta miCuenta;
	
	@Before
	public void setUp() throws Exception {
		miCuenta = new Cuenta();
	}

	@Test
	public void creoYconsultoSaldoTest() {
		assertNotNull(miCuenta);
		double esperado = 0;
		double obtenido = miCuenta.getSaldo();
		double tolerancia = 0.001;
		assertEquals(esperado, obtenido, tolerancia);
		
	}

	@Test
	public void agregoDineroTest() {
		miCuenta.agregarDinero(50.25);
		assertEquals(50.25, miCuenta.getSaldo(), 0.001);
	}
	
	@Test
	public void retirarDineroMeAlcanzaYsobraTest() {
		miCuenta.agregarDinero(12345.80);
		miCuenta.retirarDinero(457.90);
		assertEquals(11887.90, miCuenta.getSaldo(), 0.001);
	}
	
	@Test
	public void retiroDineroMeAlcanzaJustitoTest() {
		miCuenta.agregarDinero(12345.80);
		miCuenta.retirarDinero(12345.80);
		assertEquals(0, miCuenta.getSaldo(), 0.001);
	}
	
	@Test (expected=Error.class)
	public void retiroDineroNoMeAlcanzaJustitoTest() {
		miCuenta.agregarDinero(12345.8);
		miCuenta.retirarDinero(12346);
		assertNotEquals(0, miCuenta.getSaldo(), 0.001);
	}
	
	@Test (expected=Error.class)
	public void cuentaNoSePuedeIniciarConSaldoNegativo() {
		Cuenta c1 = new Cuenta(-344);
		assertNull(c1);
	}
	
	@Test
	public void transferenciaExitosaTests() {
		Cuenta c1 = new Cuenta(10_000);
		Cuenta c2 = new Cuenta();
		c1.transferir(550, c2);
		assertEquals(9450, c1.getSaldo(), 0.001);
		assertEquals(550, c2.getSaldo(), 0.001);
	}
	
	@Test (expected=Error.class)
	public void transferenciaConSaldoInsuficienteTest() {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.transferir(550, c2);
	}
	
	@Test (expected=Error.class)
	public void transferenciaConSaldoNegativoTest() {
		Cuenta c1 = new Cuenta(10_000);
		Cuenta c2 = new Cuenta();
		c1.transferir(-550, c2);
	}
	
	@Test (expected=Error.class)
	public void transferirSaldoCeroTest() {
		Cuenta c1 = new Cuenta(10_000);
		Cuenta c2 = new Cuenta();
		c1.transferir(0, c2);
	}
}
