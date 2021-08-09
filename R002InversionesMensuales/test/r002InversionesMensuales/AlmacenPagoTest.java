package r002InversionesMensuales;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
		
	@Test
	public void resultadoCorrectoResultadoInversionTest() {
		c1.resultadoInversion(1000, 0.24, 4);
		double[] resultadosEsperados1 = {1268.2418, 1608.4372, 2039.8873, 2587.0704};
		assertArrayEquals(c1.resultadoInversion(1000, 0.24, 4), resultadosEsperados1, 0);
		
		double[] resultadosEsperados2 = {2000, 4000.0001, 8000.0002, 16000.0005, 32000.0012};
		assertArrayEquals(c1.resultadoInversion(1000, 0.71355714, 5), resultadosEsperados2, 0);
		
	}
	
	@Test
	public void resultadoCorrectoCuantosMesesTest() {		
		int resultadoEsperado1 = 48;
		assertEquals(c1.cuantosMeses(1000, 0.24, 2587), resultadoEsperado1);
		
		int resultadoEsperado2 = 120;
		System.out.println(c1.cuantosMeses(1000, 0.07, 2000));
		assertEquals(c1.cuantosMeses(1000, 0.07, 2000), resultadoEsperado2);
	}
}
