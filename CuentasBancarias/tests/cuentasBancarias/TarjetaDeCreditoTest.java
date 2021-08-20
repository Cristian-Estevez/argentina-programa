package cuentasBancarias;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cuentasbancarias.Cuenta;
import cuentasbancarias.TarjetaDeCredito;

public class TarjetaDeCreditoTest {
	
	Cuenta cuenta2000, cuenta5000, cuenta0;
	TarjetaDeCredito tar2000, tar5000, tar0;
	
	@Before
	public void setup() {
		cuenta2000 = new Cuenta(2000);
		cuenta5000 = new Cuenta(5000);
		cuenta0 = new Cuenta();
		tar2000 = new TarjetaDeCredito(cuenta2000);
		tar5000 = new TarjetaDeCredito(cuenta5000);
		tar0 = new TarjetaDeCredito(cuenta0);
	}

	@Test
	public void elSaldoDeLaCuentaNoVariaAlComprar() {
		assertEquals(2000, tar2000.getSaldo(), 0);
		tar2000.comprar(6000);
		tar2000.comprar(340);
		assertEquals(2000, tar2000.getSaldo(), 0);
	}
	
	@Test
	public void elSaldoAcumuladoAPagarTieneUnInteresDel3Por100() {
		tar2000.comprar(100);
		assertEquals(103, tar2000.getSaldoAPagar(), 0);
	}
	
	@Test
	public void elSaldoEnCuentaAsociadaVariaAlEfectuarElPago() {
		tar2000.comprar(800);
		tar2000.pagar();
		assertEquals(1176, tar2000.getSaldo(), 0);
	}
	
	@Test (expected=Error.class)
	public void noSePuedePagarLaTarjetaConSaldoInsuficiente() {
		tar5000.comprar(5001);
		tar5000.pagar();
	}
	

}
