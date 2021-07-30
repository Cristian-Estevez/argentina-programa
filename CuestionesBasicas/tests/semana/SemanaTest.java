package semana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SemanaTest {

	@Test
	public void test() {
		DiaDeLaSemana x = DiaDeLaSemana.LUNES;
		assertEquals("Lun", x.getAbbr());
		
		assertTrue(DiaDeLaSemana.LUNES.anteriorA(DiaDeLaSemana.MARTES));
		
		assertEquals(DiaDeLaSemana.MARTES, x.maniana());
		
	}

}
