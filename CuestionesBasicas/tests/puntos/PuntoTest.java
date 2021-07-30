package puntos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void toStringEnPuntoTest() {
		Punto punto = new Punto(3, 4);
		assertEquals("[3.0,4.0]", punto.toString());
	}
	
	@Test
	public void quePuedoClonarTest() throws CloneNotSupportedException {
		Punto punto = new Punto(3, 4);
		Punto clon = punto.clone();
		
		assertNotSame(punto, clon);
		assertEquals(punto, clon);
	}
	
	@Test
	public void equalsTest() {
		Punto punto = new Punto(3, 4);
		Punto otro = new Punto(3, 4);
		Punto tres = new Punto(3, 6);
		assertEquals(punto, otro);
		assertNotEquals(punto, tres);	
	}
	
	@Test
	public void hashCodeTest() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(3, 4);
		Punto tres = new Punto(3, 6);
		
		assertEquals(uno, dos);
		assertEquals(uno.hashCode(), dos.hashCode());
//		System.out.println(uno.hashCode() + "\n" + dos.hashCode() + "\n" + tres.hashCode());
		assertNotEquals(uno.hashCode(), tres.hashCode());
	}
	
	@Test
	public void moduloTest() {
		Punto uno = new Punto(3, 4);
		assertEquals(5.0, uno.getModulo(), 0);
		
		Punto dos = new Punto(-3, -4);
		assertEquals(5.0, dos.getModulo(), 0);
	}

	@Test
	public void compareToTest() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(4, 5);
		Punto tres = new Punto(3, 4);
		
		assertTrue(uno.compareTo(dos) < 0);
		assertTrue(dos.compareTo(uno) > 0);
		assertTrue(uno.compareTo(tres) == 0);
	}
	
	@Test
	public void ordenarTest() {
		Punto[] puntos = {
				new Punto(2, 3),
				new Punto(1, 1),
				new Punto(0, 0),
				new Punto(4, 5)
		};
		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	}
	
	@Test
	public void ordenarConComparatorTest() {
		Punto[] puntos = {
				new Punto(-2, 3),
				new Punto(1, 1),
				new Punto(0, 0),
				new Punto(4, -5)
		};
		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos, new ComparadorPorModulos());
		Arrays.sort(puntos, new ComparadorPorEquis());
		System.out.println(Arrays.toString(puntos));
	}
}
