package r002InversionesMensuales;

import org.junit.BeforeClass;
import org.junit.Test;


public class AlmacenPagoTest {

	static AlmacenPago c1;
	
	@BeforeClass
	static public void beforeClass(){
		c1 = new AlmacenPago();
	}
	
	@Test (expected=Error.class)
	public void inversionNegativaFailTest() {
		c1.resultadoInversion(-1000, 0.24, 4);
	}
	
	@Test (expected=Error.class)
	public void montoFinalMenorAlInicialFailTest() {
		c1.cuantosMeses(100, 0.3, 36);
	}
	
	@Test (expected=Error.class)
	public void metodoValidarMontoParaInteresFailTest() {
		c1.cuantosMeses(100, 0, 36);
	}
	
	@Test (expected=Error.class)
	public void metodoValidarAniosFailTest() {
		c1.resultadoInversion(100, 0.3, -9);
	}
	

	
	
	/* falta arreglar lo del toString(
	@Test
	public void resultadoCorrectoTest() {
		CuentaInversion miCuenta = new CuentaInversion();
		assertEquals("1268.2418\n"
				+ "1608.4372\n"
				+ "2039.8873\n"
				+ "2587.0704", miCuenta.resultadoInversion(1000, 0.24, 4).toString());
	}
	 */

}
