package biblioteca;

import java.util.Comparator;

public class ComparadorPorPublicacion implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return Integer.compare(o1.getAnioPublicacion(), o2.getAnioPublicacion());
	}
	//es lo mismo que el otro comparator, el de paginas, pero se hace un poco diferente. cambiando le typo de retorno del get en Libro

}
