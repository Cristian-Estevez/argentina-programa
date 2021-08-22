package cuentasbancarias;

import java.util.Comparator;

public class ComparadorPorMonto implements Comparator<Registro>{

	@Override
	public int compare(Registro o1, Registro o2) {
		return o1.getMonto().compareTo(o2.getMonto());
	}
	
}
