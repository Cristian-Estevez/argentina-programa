package salaDeCineMioTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import salaDeCineMio.SalaDeCineMio;

public class SalaDeCineMioTest {
	
	@Test
	public void verSiUnaButacaEstaDesocupadaTest() {
		SalaDeCineMio c1 = new SalaDeCineMio(4, 32);
		assertNotNull(c1);
		assertFalse(c1.butacas[1][1].estaOcupadoELAsiento());
	}
}
