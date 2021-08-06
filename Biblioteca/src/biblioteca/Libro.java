package biblioteca;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
	
	private int paginas;
	private Autor autor;
	private String titulo;
	private int anioPublicacion;
	private Genero genero;
	private static final int LARGO_MAXIMO_TITULO = 200;
	
	public Libro(int paginas, Autor autor, String titulo, int anioPublicacion, Genero genero) {
		this.paginas = paginas;
		this.autor = autor;
		this.titulo = this.tituloAcorde(titulo);
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
	}

	private String tituloAcorde(String titulo) {
		if (titulo.length() > LARGO_MAXIMO_TITULO) {
			return titulo.substring(0, LARGO_MAXIMO_TITULO);
		}
		return titulo;
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

	public int getPaginas() {
		return paginas;
	}
	
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	
	@Override
	public String toString() {
		return autor.getAutorAPA() + "(" + anioPublicacion + ")" + ". " + titulo;
	}

	@Override
	public int compareTo(Libro o) {
		return this.titulo.compareTo(o.titulo);
	}
	
	public String getTituloNormalizado() {
		String[] t = titulo.split(" ");
		String tituloNormalizado = "";
		switch (t[0]) {
			case "El":
			case "La":
			case "Un":
			case "Los":
			case "Las":
			case "Una":
			case "Unos":
			case "Unas":
				for (int i = 1; i < t.length; i++) {
					tituloNormalizado += t[i] + " ";
				}
			tituloNormalizado += ", " + t[0];
			return tituloNormalizado.trim();
		}
		return titulo;			
	}

	public String getApellido() {
		return this.autor.getApellido();
	}
	
	
	public boolean libroRepetido(Libro otro) {
		return this.equals(otro);
	}

	public String getTitulo() {
		return titulo;
	}
	
	
}
