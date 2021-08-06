package biblioteca;

import java.util.Objects;

public class Libro implements Cloneable, Comparable<Libro> {

	private String autor;
	private int paginas;
	private String titulo;
	private int anioPublicacion;
	private Genero genero;
	private static final int CARACTERES_MAXIMOS = 200;
	

	public Libro(String autor, int paginas, String titulo, int anioPublicacion, Genero genero) {
		
		this.autor = autor;
		this.paginas = paginas;
		this.titulo = recortarTitulo();
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return this.autor + " (" + this.anioPublicacion + ") " + this.genero;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}

	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}

	@Override
	public int compareTo(Libro o) {
		
		if (this.autor.compareTo(o.autor) == 0) {
			return this.titulo.compareTo(o.titulo);
		}
		return this.autor.compareTo(o.autor);
		
	}
	
	public Integer getPaginas() {
		return this.paginas;
	}
	
	public int getAnioPublicacion() {
		return this.anioPublicacion;
	}
	
	public String recortarTitulo() {
		if (this.titulo.length() >= CARACTERES_MAXIMOS) {
			return this.titulo.substring(0, CARACTERES_MAXIMOS);
		}
		return this.titulo;
	}
	

	public static void main(String[] args) {
		Libro libro = new Libro("Jose", 100, "Novelas", 1458, Genero.FANTASIA);
		System.out.println(libro);
	}

}



/*
 *para normalizar el título
 *split
 *trim removes spaces from end a start of the string
 *substring
 *concat 
 * 
*/