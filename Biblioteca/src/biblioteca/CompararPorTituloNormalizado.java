package biblioteca;

import java.util.Comparator;

public class CompararPorTituloNormalizado implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getTituloNormalizado().compareTo(o2.getTituloNormalizado());
	}

}
