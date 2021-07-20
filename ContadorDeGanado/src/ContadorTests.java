import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContadorTests {

	Contador contador;

	// comente todas las creaciones de contadores para no repetir codigo, y con el @Before logro que se ejecute un código antes de cada test
	
	@Before
	public void setUp() {
		contador = new Contador();
	}
	
	// Corre despues de cada test
	@After 
	public void tearDown() {
		contador = null;
	}
	
	@Test
	public void creacion() {
		assertNotNull(contador);
	}

	@Test
	public void quePuedeContar() {
		// 4 As
		
		// Arrange
		// Contador c = new Contador();
		
		// Act
		contador.contar();
		
		// Assert
		assertEquals(1, contador.mostrar());
		
		// Annihilate (no es necesario en este caso)
		contador = null;
	}
	
	@Test
	public void queReiniciaSinHaberContado() {
		// Arrange
		// Contador c = new Contador();
		
		// Act
		contador.reiniciar();
		
		// Assert
		assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void queReiniciaLuegoDeContar() {
		// Arrange
		// Contador c = new Contador();
		contador.contar();
		
		
		// Act
		contador.reiniciar();
		
		// Assert
		assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void queCuentaVarias100Veces() {
		// Arrange
		//Contador c = new Contador();
		for (int i = 0; i < 100; i++) { 
			contador.contar();
		}
		
		// Act
		contador.reiniciar();
		
		// Assert
		assertEquals(0, contador.mostrar());
	}
}
