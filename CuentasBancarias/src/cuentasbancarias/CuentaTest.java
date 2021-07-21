package cuentasbancarias;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
	
	@Test
	public void retiroDineroNoMeAlcanzaJustitoTest() {
		miCuenta.agregarDinero(12345.80);
		miCuenta.retirarDinero(12346);
		assertNotEquals(0, miCuenta.getSaldo(), 0.001);
	}
	
}
