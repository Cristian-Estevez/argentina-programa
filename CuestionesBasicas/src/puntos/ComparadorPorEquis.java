package puntos;

import java.util.Comparator;

public class ComparadorPorEquis implements Comparator<Punto> {

	@Override
	public int compare(Punto uno, Punto dos) {
		return uno.getX().compareTo(dos.getX());
	}

}
