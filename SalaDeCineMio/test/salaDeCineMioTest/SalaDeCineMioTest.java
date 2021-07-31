package salaDeCineMioTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import salaDeCineMio.SalaDeCineMio;

public class SalaDeCineMioTest {
	
	@Test
	public void verSiUnaButacaEstaDesocupadaTest() {
		SalaDeCineMio c1 = new SalaDeCineMio(4, 32);
		assertNotNull(c1);
		assertFalse(c1.estaOcupada(1, 1));
	}
	
	@Test
	public void ocuparUnaButacaDesocupadaTest() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 8);
		assertFalse(c1.estaOcupada(1, 1));
		assertTrue(c1.ocuparButaca(1, 3));
		assertTrue(c1.estaOcupada(1, 3));
	}
	
	@Test
	public void intentarOcuparButacaQueEstaOcupada() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 4);
		c1.ocuparButaca(0, 0);
		assertTrue(c1.estaOcupada(0, 0));
		assertFalse(c1.ocuparButaca(0, 0));
	}
	
	@Test
	public void butacasOcupadasIncrementaCorrectamente() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 4);
		assertEquals(0, c1.getButacasOcupadas());
		c1.ocuparButaca(0, 0);
		assertEquals(1, c1.getButacasOcupadas());
		c1.ocuparButaca(1, 0);
		c1.ocuparButaca(0, 1);		
		assertEquals(3, c1.getButacasOcupadas());		
	}
	
	@Test
	public void butacasOcupadasNoIncrementaSiLaButacaYaEstabaOcupada() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 4);
		assertEquals(0, c1.getButacasOcupadas());
		c1.ocuparButaca(0, 0);
		assertEquals(1, c1.getButacasOcupadas());
		c1.ocuparButaca(0, 0);
		assertEquals(1, c1.getButacasOcupadas());
	}
	
	@Test
	public void espacioSuficientePara5Test() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 10);// recordar que pasa como segundo param las butacas totales de la sala
		assertTrue(c1.hayEspacioPara(5));
	}
	
	@Test
	public void noHayEspacioSuficientepara5Test() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 8);
		assertFalse(c1.hayEspacioPara(5));
	}
	
	@Test
	public void hayEspacioPara4DespuesDeHaberOcupadoAlgunasButacasTest() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 16);
		c1.ocuparButaca(0, 0);
		c1.ocuparButaca(0, 1);
		c1.ocuparButaca(0, 2);
		c1.ocuparButaca(0, 3);
		assertTrue(c1.hayEspacioPara(4));
	}
	
	@Test
	public void hayEspacioEnLaSiguienteFilaPara4DespuesDeHaberOcupadoAlgunasButacasTest() {
		SalaDeCineMio c1 = new SalaDeCineMio(2, 16);
		c1.ocuparButaca(0, 0);
		c1.ocuparButaca(0, 1);
		c1.ocuparButaca(0, 2);
		c1.ocuparButaca(0, 3);
		c1.ocuparButaca(0, 4);
		assertTrue(c1.hayEspacioPara(4));
	}
	
}
