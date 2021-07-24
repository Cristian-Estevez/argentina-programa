package lluviasDeLaSemana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LluviasDeLaSemanaTest {
	LluviasDeLaSemana lluvias;
	
	@Before
	public void setup() {
		lluvias = new LluviasDeLaSemana();
	}
	
	
	@Test
	public void noLlovioNingunDia() {
		assertEquals(0, lluvias.cantidadDeDiasQueLlovio());
	}
	
	@Test
	public void llovioUnDia() {
		lluvias.agregarQueLlovio(2);
		assertTrue(lluvias.llovioElDia(2));
	}

	@Test
	public void llovioDosDia() {
		lluvias.agregarQueLlovio(1);
		lluvias.agregarQueLlovio(2);
		assertTrue(lluvias.llovioElDia(1));
		assertTrue(lluvias.llovioElDia(2));
		assertEquals(2, lluvias.cantidadDeDiasQueLlovio());
	}
	
	@Test (expected=Error.class)
	public void diaInvalido() {
		lluvias.agregarQueLlovio(8);
	}
}
