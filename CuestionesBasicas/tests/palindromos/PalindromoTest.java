package palindromos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoTest {

	@Test
	public void palabras() {
		assertTrue(Palindromo.esPalindromo("oro"));
		assertFalse(Palindromo.esPalindromo("loro"));
		assertTrue(Palindromo.esPalindromo("reconocer"));
		assertTrue(Palindromo.esPalindromo("orejero"));
	}

	@Test
	public void frases() {
		assertTrue(Palindromo.esPalindromo("dabale arroz a la zorra el abad"));
	}
	
	@Test
	public void frasesConMayusculas() {
		assertTrue(Palindromo.esPalindromo("Dabale arroz a la Zorra el abad"));
	}
	
	@Test
	public void frasesConTildes() {
		assertTrue(Palindromo.esPalindromo("Dábale arroz a la Zorra el abad"));
	}
	
	@Test
	public void frasesConSignosDePuntuacion() {
		assertTrue(Palindromo.esPalindromo("Ana, la tacaña catalana"));
	}
}
