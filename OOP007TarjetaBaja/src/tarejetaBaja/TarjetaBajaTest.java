package tarejetaBaja;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TarjetaBajaTest {

	TarjetaBaja t1;
	
	@Before
	public void setup() {
		t1 = new TarjetaBaja(0);
	}
	
	@Test
	public void tarjetaIniciaCon0Test() {
		assertEquals(0, t1.obtenerSaldo(), 0);
	}
	
	@Test
	public void tarjetaIniciaConCargaTest() {
		TarjetaBaja t = new TarjetaBaja(500);
		assertEquals(500, t.obtenerSaldo(), 0);
	}

	@Test
	public void puedoCargarDinero() {
		t1.cargar(250);
		assertEquals(250, t1.obtenerSaldo(), 0);
	}
	
	@Test (expected=Error.class)
	public void noPuedoCargarDineroNegativo() {
		t1.cargar(-2);
	}
	
	@Test (expected=Error.class)
	public void noPuedoInicializarTarjetaConSaldoNegativo() {
		TarjetaBaja t = new TarjetaBaja(-5000);
	}
	
	@Test
	public void viajeEnColectivoAumentaVariableViajesColectivoTest() {
		assertEquals(0, t1.contarViajesColectivo(), 0);
		t1.cargar(200.5);
		t1.pagarViajeEnColectivo();
		assertEquals(1, t1.contarViajesColectivo(), 0);
	}
	
	@Test
	public void viajeEnSubteAumentaVariableViajesSubteTest() {
		assertEquals(0, t1.contarViajesSubte(), 0);
		t1.cargar(200.5);
		t1.pagarViajeEnSubte();
		assertEquals(1, t1.contarViajesSubte(), 0);
	}
	
	@Test (expected=Error.class)
	public void viajeEnColectivoNoAumentaVariableViajesColectivoSiElDineroEsInsuficienteTest() {
		assertEquals(0, t1.contarViajesColectivo(), 0);
		t1.pagarViajeEnColectivo();
		assertEquals(1, t1.contarViajesColectivo(), 0);
	}
	
	@Test (expected=Error.class)
	public void viajeEnSubteNoAumentaVariableViajesSubteSiElDineroEsInsuficienteTest() {
		assertEquals(0, t1.contarViajesSubte(), 0);
		t1.pagarViajeEnSubte();
		assertEquals(1, t1.contarViajesSubte(), 0);
	}
	
	@Test
	public void sePuedeViajarEnColectivoConElDineroJustoTest() {
		assertEquals(0, t1.contarViajesColectivo(), 0);
		t1.cargar(21.5);
		t1.pagarViajeEnColectivo();
		assertEquals(1, t1.contarViajesColectivo(), 0);
	}
	
	@Test
	public void sePuedeViajarEnSubteConElDineroJustoTest() {
		assertEquals(0, t1.contarViajesSubte(), 0);
		t1.cargar(19.5);
		t1.pagarViajeEnSubte();
		assertEquals(1, t1.contarViajesSubte(), 0);
	}
	
	@Test
	public void elSaldoDisminuyeDespuesDeViajarEnColectivoTest() {
		t1.cargar(21.5);
		t1.pagarViajeEnColectivo();
		assertEquals(0, t1.obtenerSaldo(), 0);
		t1.cargar(41.5);
		t1.pagarViajeEnColectivo();
		assertEquals(20, t1.obtenerSaldo(), 0);
	}
	
	@Test
	public void elSaldoDisminuyeDespuesDeViajarEnSubteTest() {
		t1.cargar(19.5);
		t1.pagarViajeEnSubte();
		assertEquals(0, t1.obtenerSaldo(), 0);
		t1.cargar(39.0);
		t1.pagarViajeEnSubte();
		assertEquals(19.5, t1.obtenerSaldo(), 0);
	}
	
	@Test (expected=Error.class)
	public void NoSePuedeViajarEnColectivoConElDineroInsuficienteTest() {
		t1.pagarViajeEnColectivo();
	}
	

	@Test (expected=Error.class)
	public void NoSePuedeViajarEnSubteConElDineroInsuficienteTest() {
		t1.pagarViajeEnSubte();
	}
		
}
