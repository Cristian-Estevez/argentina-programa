package biblioteca;

import java.util.Comparator;

public class CompararPorPagina implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return Integer.compare(o1.getPaginas(), o2.getPaginas());
	}


	
}
