package cuentasBancarias;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cuentasbancarias.CuentaCorriente;
import cuentasbancarias.CuentaDeAhorros;

public class CuentaDeAhorrosTests {

	CuentaDeAhorros c1;
	CuentaCorriente c2;	
	
	@Test (expected=Error.class)
	public void resguardoSaldoTest() {
		c1 = new CuentaDeAhorros(400);
		assertEquals(400, c1.getSaldo(), 0.001);
		
		c1.reservarSaldo(400);
		assertEquals(0, c1.getSaldo(), 0.001);
		
		c1.retirarDinero(1);
	}

	@Test
	public void reservaSaldoCorrectamenteTest() {
		c1 = new CuentaDeAhorros(250);
		assertEquals(250, c1.getSaldo(), 0.001);
		c1.reservarSaldo(50);
		assertEquals(200, c1.getSaldo(), 0.001);
		assertEquals(50, c1.getSaldoReservado(), 0.001);
	}
	
	@Test (expected=Error.class)
	public void reincorporarDineroFallaSiSaldoReservadoInsuficiente() {
		c1 = new CuentaDeAhorros();
		c1.agregarDinero(300);
		c1.reservarSaldo(50);
		c1.reincorporarSaldo(50);
	}
	
	@Test
	public void transferenciaDesdeCuentaCorrienteAlDescubiertoTest() {
		c1 = new CuentaDeAhorros();
		c2 = new CuentaCorriente(0, 1000);
		
		c2.transferir(1000, c1);
		double saldoEsperadoC1 = 1000;
		double saldoNegativoEsperadoC2 = -1000;
		
		assertEquals(saldoEsperadoC1, c1.getSaldo(), 0);
		assertEquals(saldoNegativoEsperadoC2, c2.getSaldoNegativo(), 0);
	}
}
