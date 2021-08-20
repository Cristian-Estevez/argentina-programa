package cuentasBancarias;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cuentasbancarias.Cuenta;
import cuentasbancarias.TarjetaDeDebito;

public class TarjetaDeDebitoTest {

	Cuenta cuenta2000, cuenta5000, cuenta0;
	TarjetaDeDebito tar2000, tar5000, tar0;
	
	@Before
	public void setup() {
		cuenta2000 = new Cuenta(2000);
		cuenta5000 = new Cuenta(5000);
		cuenta0 = new Cuenta();
		tar2000 = new TarjetaDeDebito(cuenta2000);
		tar5000 = new TarjetaDeDebito(cuenta5000);
		tar0 = new TarjetaDeDebito(cuenta0);
	}
	
	@Test
	public void puedoComprarConDebito() {
		assertEquals(2000, tar2000.getSaldo(), 0);
		tar2000.comprar(1999);
		assertEquals(1, tar2000.getSaldo(), 0);
	}
	
	@Test (expected=Error.class)
	public void noPuedoComprarPorSaldoInsuficiente() {
		tar0.comprar(5);
	}

}
