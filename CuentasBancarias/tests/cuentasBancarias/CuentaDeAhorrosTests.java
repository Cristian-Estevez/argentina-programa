package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import cuentasbancarias.CuentaDeAhorros;

public class CuentaDeAhorrosTests {

	CuentaDeAhorros c1;
	
	@Test (expected=Error.class)
	public void resguardoSaldoTest() {
		c1 = new CuentaDeAhorros(400);
		assertEquals(400, c1.getSaldo(), 0.001);
		
		c1.ahorrar(400);
		assertEquals(0, c1.getSaldo(), 0.001);
		
		c1.retirarDinero(1);
	}

	@Test
	public void ahorraCorrectamenteTest() {
		c1 = new CuentaDeAhorros(250);
		assertEquals(250, c1.getSaldo(), 0.001);
		c1.ahorrar(50);
		assertEquals(200, c1.getSaldo(), 0.001);
		assertEquals(50, c1.getSaldoAhorro(), 0.001);
	}
}
