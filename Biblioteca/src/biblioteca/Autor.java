package biblioteca;

import java.util.Objects;

public class Autor implements Comparable<Autor>{

	private String apellido;
	private String nombre;
	
	public Autor(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public String getAutorAPA() {
		return apellido + ", " + nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	@Override
	public int compareTo(Autor o) {
		return this.apellido.compareTo(o.apellido);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	
}
