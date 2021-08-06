package biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortTest {

	@Test
	public void ordenarPorCantidadDePaginasTest() {
		Biblioteca b = new Biblioteca(10);
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION));
		b.agregarLibro(new Libro(76, new Autor("Anónimo", ""), "Las mil y una noches", 1844, Genero.FICCION));
		b.agregarLibro(new Libro(12, new Autor("Rowling", "J. K."), "Harry Potter", 1846, Genero.FICCION));

		b.ordenarPorPagina();
		assertEquals("[Neruda, Pablo(1842). Un libro de pablo neruda, Rowling, J. K.(1846). Harry Potter, Anónimo, (1844). Las mil y una noches, Hernandez, José(1845). Martín Fierro, null, null, null, null, null, null]", b.toString());

	}

	@Test
	public void ordenarPorAnioPublicacionTest() {
		Biblioteca b = new Biblioteca(4);
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION));
		b.agregarLibro(new Libro(76, new Autor("Anónimo", ""), "Las mil y una noches", 1844, Genero.FICCION));
		b.agregarLibro(new Libro(12, new Autor("Rowling", "J. K."), "Harry Potter", 1846, Genero.FICCION));

		b.ordenarPorAnioPublicacion();
		assertEquals("[Neruda, Pablo(1842). Un libro de pablo neruda, Anónimo, (1844). Las mil y una noches, Hernandez, José(1845). Martín Fierro, Rowling, J. K.(1846). Harry Potter]", b.toString());

	}
	
	@Test
	public void ordenarPorTituloTest() {
		Biblioteca b = new Biblioteca(4);
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION));
		b.agregarLibro(new Libro(76, new Autor("Anónimo", ""), "Las mil y una noches", 1844, Genero.FICCION));
		b.agregarLibro(new Libro(12, new Autor("Rowling", "J. K."), "Harry Potter", 1846, Genero.FICCION));

		b.ordenarPorTitulo();
		assertEquals("[Rowling, J. K.(1846). Harry Potter, Anónimo, (1844). Las mil y una noches, Hernandez, José(1845). Martín Fierro, Neruda, Pablo(1842). Un libro de pablo neruda]", b.toString());

	}
	
	@Test
	public void ordenarPorTituloNormalizadoTest() {
		Biblioteca b = new Biblioteca(4);
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION));
		b.agregarLibro(new Libro(76, new Autor("Anónimo", ""), "Las mil y una noches", 1844, Genero.FICCION));
		b.agregarLibro(new Libro(12, new Autor("Rowling", "J. K."), "Harry Potter", 1846, Genero.FICCION));

		b.ordenarPorTituloNormalizado();
		assertEquals("[Rowling, J. K.(1846). Harry Potter, Hernandez, José(1845). Martín Fierro, Neruda, Pablo(1842). Un libro de pablo neruda, Anónimo, (1844). Las mil y una noches]", b.toString());

	}

	
	@Test
	public void ordenarPorApellidoAutorTest() {
		Biblioteca b = new Biblioteca(4);
		b.agregarLibro(new Libro(100, new Autor("Hernandez", "José"), "Martín Fierro", 1845, Genero.FICCION));
		b.agregarLibro(new Libro(3, new Autor("Neruda", "Pablo"), "Un libro de pablo neruda", 1842, Genero.FICCION));
		b.agregarLibro(new Libro(76, new Autor("Anónimo", ""), "Las mil y una noches", 1844, Genero.FICCION));
		b.agregarLibro(new Libro(12, new Autor("Rowling", "J. K."), "Harry Potter", 1846, Genero.FICCION));

		b.ordenarPorApellidoAutor();
		assertEquals("[Anónimo, (1844). Las mil y una noches, Hernandez, José(1845). Martín Fierro, Neruda, Pablo(1842). Un libro de pablo neruda, Rowling, J. K.(1846). Harry Potter]", b.toString());
	}
}
