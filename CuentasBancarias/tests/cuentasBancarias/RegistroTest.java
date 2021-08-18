package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import cuentasbancarias.Cuenta;

public class RegistroTest {

	Cuenta c1, c2, c3;
	
	@Test
	public void AlRegistrarMasTrnasaccionesDelLengthDelArraySobreescribeDesdeElPrimeroTest() {
		c1 = new Cuenta(2000);
		int iteracionesMayorAlLengthDeRegistrosArray = 40;
		for (int i = 0; i < iteracionesMayorAlLengthDeRegistrosArray; i++) {
			c1.agregarDinero(10);
		}
	}
	
	@Test
	public void SobreescribeElPrimerRegistroAlEccederseArrayLEngthPor1Test() throws InterruptedException {
		c1 = new Cuenta(10);
		int iteracionesMayorAlLengthDeRegistrosArray = 10;// la primer transacción registrada es la de creación de la cuenta
		for (int i = 0; i < iteracionesMayorAlLengthDeRegistrosArray; i++) {
			c1.agregarDinero(10);
			Thread.sleep(1001);
		}
		System.out.println("pos 1: " + c1.getDetallesTransaccion(1));
		System.out.println("pos 2: " + c1.getDetallesTransaccion(2));
		System.out.println("pos 3: " + c1.getDetallesTransaccion(3));
		System.out.println("pos 4: " + c1.getDetallesTransaccion(4));
		System.out.println("pos 5: " + c1.getDetallesTransaccion(5));
		System.out.println("pos 6: " + c1.getDetallesTransaccion(6));
		System.out.println("pos 7: " + c1.getDetallesTransaccion(7));
		System.out.println("pos 8: " + c1.getDetallesTransaccion(8));
		System.out.println("pos 9: " + c1.getDetallesTransaccion(9));
		System.out.println("pos 10: " + c1.getDetallesTransaccion(10));
	
		c1.ordenarRegistros();
		System.out.println("pos 1: " + c1.getDetallesTransaccion(1));
		System.out.println("pos 2: " + c1.getDetallesTransaccion(2));
		System.out.println("pos 3: " + c1.getDetallesTransaccion(3));
		System.out.println("pos 4: " + c1.getDetallesTransaccion(4));
		System.out.println("pos 5: " + c1.getDetallesTransaccion(5));
		System.out.println("pos 6: " + c1.getDetallesTransaccion(6));
		System.out.println("pos 7: " + c1.getDetallesTransaccion(7));
		System.out.println("pos 8: " + c1.getDetallesTransaccion(8));
		System.out.println("pos 9: " + c1.getDetallesTransaccion(9));
		System.out.println("pos 10: " + c1.getDetallesTransaccion(10));
	}

}
