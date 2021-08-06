package biblioteca;

import java.util.Arrays;

public class Biblioteca {

	private Libro[] coleccion;
	private int cantidadLibros;
	
	public Biblioteca(int tamanioBiblioteca) {
		coleccion = new Libro[tamanioBiblioteca];
		cantidadLibros = 0;
	}
	
	public void agregarLibro(Libro libro) {
		if(cantidadLibros == coleccion.length) {
			throw new Error("No hay más espacio");
		}
		coleccion[this.cantidadLibros] = libro;
		cantidadLibros++;
	}
	
	public boolean libroRepetido(Libro libro) {
		int indice = 0;
		boolean libroRepetido = false;
		while(indice < cantidadLibros && !libroRepetido) {
			libroRepetido = coleccion[indice].equals(libro);
			indice++;
		}
		return libroRepetido;
	}
	
	public void ordenar() {
		Arrays.sort(coleccion);
	}
	
	public void ordenarPorPaginas() {
		Arrays.sort(coleccion, new ComparadorPorPaginas());
	}
	
	public void ordenarPorPublicacion() {
		Arrays.sort(coleccion, new ComparadorPorPublicacion());
	}
	
	public Libro[] getColeccion() {
		return coleccion;
	}
}

/*assertArraysEquals para comparar vectores
 * para los test de ordenamiento
 * 
 * para el punto 6:
 * enums tienen un metodo values que devuelve un array de los valores que contiene
 * si pongo por ejemploGenero.infantil.ordinal() me devuelve el index del enum 
*/ 

