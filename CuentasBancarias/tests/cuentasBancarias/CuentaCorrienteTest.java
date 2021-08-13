package cuentasBancarias;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cuentasbancarias.CuentaCorriente;

public class CuentaCorrienteTest {
	
	CuentaCorriente c1, c2;

	@Test
	public void averiguarSaldoDisponibleTest() {
		c1 = new CuentaCorriente(0, 3000);
		assertEquals(3000, c1.getSaldoTotalDisponible(), 0.001);
		c1.agregarDinero(2505);
		assertEquals(5505, c1.getSaldoTotalDisponible(), 0.001);
	}

	@Test
	public void retiroMontoDeMiSaldoTest() {
		c1 = new CuentaCorriente(200, 3000);
		c1.retirarDinero(200);
		assertEquals(0, c1.getSaldo(), 0);
		assertEquals(3000, c1.getSaldoTotalDisponible(), 0);
	}
	
	
	@Test
	public void retiroDineroDelDescubiertoTest() {
		c1 = new CuentaCorriente(200, 3000);
		assertEquals(2000, c1.retirarDinero(2000), 0);
		assertEquals(1200, c1.getSaldoTotalDisponible(), 0);
		
		c2 = new CuentaCorriente(5001, 2000);
		assertEquals(7001, c2.retirarDinero(7001), 0);
		assertEquals(0, c2.getSaldoTotalDisponible(), 0);
	}
	
	
	@Test
	public void retiroSaldoDescubiertoCompletoTest() {
		c1 = new CuentaCorriente(0, 60000);
		c1.retirarDinero(60000);
		assertEquals(0, c1.getSaldoTotalDisponible(), 0);		
	}
	
	@Test (expected=Error.class)
	public void intentoRetirarMasDelDescubiertoPermitido() {
		c1 = new CuentaCorriente(0, 250);
		c1.retirarDinero(300);
	}
	
	@Test
	public void agregoDineroPoneEnCeroMiSaldoDescubierto() {
		c1 = new CuentaCorriente(0, 3000);
		c1.retirarDinero(1522);
		c1.agregarDinero(1522);
		assertEquals(3000, c1.getSaldoTotalDisponible(), 0);
		assertEquals(0, c1.getSaldoNegativo(), 0);
	}
	
	@Test
	public void agregoDineroConUnPocoDeSaldoNegativoTest() {
		c1 = new CuentaCorriente(0, 1000);
		c1.retirarDinero(755);
		c1.agregarDinero(1000);
		assertEquals(245, c1.getSaldo(), 0);
		assertEquals(1245, c1.getSaldoTotalDisponible(), 0);
	}
	
	@Test
	public void CuentaCorrientePuedeTransferirTest() {
		c1 = new CuentaCorriente(500, 1500);
		c2 = new CuentaCorriente(0, 1000);
		c1.transferir(2000, c2);
		
		double saldoEsperadoC2 = 2000;
		assertEquals(saldoEsperadoC2, c2.getSaldo(), 0);
		
		double saldoTotalDisponibleEsperadoC2 = 3000;
		assertEquals(saldoTotalDisponibleEsperadoC2, c2.getSaldoTotalDisponible(), 0);
		
		assertEquals(0, c2.getSaldoNegativo(), 0);
		
		double saldoNegativoEsperadoC1 = -1500;
		assertEquals(saldoNegativoEsperadoC1, c1.getSaldoNegativo(), 0);
	}
	
	
	
	
	
}
