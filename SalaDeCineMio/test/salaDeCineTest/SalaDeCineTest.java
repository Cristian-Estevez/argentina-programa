package salaDeCineTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import salaDeCineMio.SalaDeCineMio;

public class SalaDeCineTest {

	@Test
	public void crearSala4x8Test() {
		SalaDeCineMio c1 = new SalaDeCineMio(4, 32);
		assertNotNull(c1);
		assertEquals(32, c1.getButacas(), 0.001);
	}

	@Test
	public void butacaDesocupadaTest() {
		SalaDeCineMio c1 = new SalaDeCineMio(4, 32);
		assertFalse(c1.consultarOcupada(2, 5));
	}
}
