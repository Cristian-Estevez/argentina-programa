package biblioteca;

import java.util.Arrays;

public class Biblioteca {
	
	private Libro[] libros;
	private int cantidadLibros;
	
	public Biblioteca(int cantidadLibros) {
		libros = new Libro[cantidadLibros];
		this.cantidadLibros = 0;
	}
	
	public void agregarLibro(Libro libro) {
		if (!bibliotecaLlena()) {
			libros[cantidadLibros] = libro;
			cantidadLibros++;			
		} else {
			throw new Error("La biblioteca no tiene más espacio.");
		}
	}
	
	private boolean bibliotecaLlena() {
		return cantidadLibros == libros.length;
	}
	
	//ORDENADORES:
	
	public void ordenarPorPagina() {
		Arrays.sort(libros, 0, cantidadLibros, new CompararPorPagina());//por cantidad de paginas
	}
	
	public void ordenarPorApellidoAutor() {
		Arrays.sort(libros, 0, cantidadLibros, new CompararPorApellido());
	}
	
	public void ordenarPorAnioPublicacion() {
		Arrays.sort(libros, 0, cantidadLibros, new CompararPorAnio());
	}
	
	public void ordenarPorTitulo() {
		Arrays.sort(libros);
	}
	
	public void ordenarPorTituloNormalizado() {
		Arrays.sort(libros, 0, cantidadLibros, new CompararPorTituloNormalizado());
	}
	//
	
	@Override
	public String toString() {
		return Arrays.toString(libros);
	}
	
	
}
