package algoritmosdebusqueda;

public class BusquedaBinaria {

	static int inicio, fin, medio;
	
	public static int buscar(int buscado, int[] v) {
		int inicio = 0
			, fin = v.length - 1
			, medio = (inicio + fin) / 2
			, posicion = -1;
		
		while(inicio <= fin && posicion == -1) {
			if (buscado < v[medio]) {
				fin = medio -1;
			} else if (buscado > v[medio]) {
				inicio = medio +1;
			} else {
				posicion = medio;
			}
			medio = (inicio + fin) / 2;
		}		
		return posicion;		
	}
}
