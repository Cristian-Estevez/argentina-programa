package eraDeImperios;

public class Posicion {

	private double x, y;
	
	public Posicion(double x, double y) {
		
		this.x = x;
		this.y = y;
		
	}

	/**
	 *  
	 * @param otraPosicion
	 * @return devuelve la distancia entre dos posiciones
	 */
	public double distanciaCon(Posicion otraPosicion) {
		double dist = Math.sqrt(Math.pow(this.x - otraPosicion.x, 2)
				+ (Math.pow(this.y - otraPosicion.y, 2)));
		return dist;
	}
}
