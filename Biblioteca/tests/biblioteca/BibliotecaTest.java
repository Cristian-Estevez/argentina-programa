package biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test (expected=Error.class)
	public void agregarFallaPorBibliotecaLlenaTest() {
		Biblioteca b = new Biblioteca(5);
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
	}

	@Test
	public void normalizaTituloSoloCuandoCorrespondeTest() {
		Libro l = new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION);
		assertEquals("libro de pablo neruda , Un", l.getTituloNormalizado());

		Libro l2 = new Libro(3, new Autor("Hernandez", "José"), "Martín Fierro", 1842, Genero.FICCION);
		assertEquals("Martín Fierro", l2.getTituloNormalizado());

	}
	
	@Test
	public void hayLibrosRepetidosTest() {
		Libro l1 = new Libro(355, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 2020, Genero.AUTOAYUDA);
		Libro l2 = new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION);
		Libro l3 = new Libro(355, new Autor("NoEsNeruda", "Pablo"), "Un libro de pablo neruda", 2020, Genero.AUTOAYUDA);

		assertTrue(l1.libroRepetido(l2));
		assertFalse(l1.libroRepetido(l3));
	}
	
	@Test
	public void recortaElTituloSiEsNecesarioTest() {
		String unTituloDe314Caracteres = "Un libro de pablo neruda con un titulo de un largo mayor a 200 carateres porque está escrito tres veces. Un libro de pablo neruda con un titulo de un largo mayor a 200 carateres porque está escrito tres veces. Un libro de pablo neruda con un titulo de un largo mayor a 200 carateres porque está escrito tres veces.";
		String unTituloMenorA200Caracteres = "Martín Fierro";
		Libro l1 = new Libro(355, new Autor("Neruda", "Pablo"), unTituloDe314Caracteres, 2020, Genero.AUTOAYUDA);
		Libro l2 = new Libro(100, new Autor("Hernandez", "José"), unTituloMenorA200Caracteres, 1845, Genero.FICCION);

		assertEquals(314, unTituloDe314Caracteres.length());
		assertEquals(200, l1.getTitulo().length());
		
		assertEquals(l2.getTitulo().length(), unTituloMenorA200Caracteres.length());
	}
}
