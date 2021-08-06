package biblioteca;

import java.util.Comparator;

public class CompararPorApellido implements Comparator<Libro>{
	
	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getApellido().compareTo(o2.getApellido());
	}

}
