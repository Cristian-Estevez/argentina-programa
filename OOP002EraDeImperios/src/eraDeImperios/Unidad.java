package eraDeImperios;

public class Unidad {
	
	private Posicion posicion;
	private int salud;
	private static final int SALUD_INICIAL = 100;
	private static final int DANIO = 10;
	private static final double DISTANCIA_ATAQUE_MAXIMA = 2;
	
	public Unidad(Posicion unaPosicion) {
		posicion = unaPosicion;
		salud = SALUD_INICIAL;
	}
	
	/**
	 * 
	 * @param otraUnidad
	 * @return regresa la distancia entre esta unidad y la pasada por parámetro
	 */
	public double distanciaCon(Unidad otraUnidad) {
		return this.posicion.distanciaCon(otraUnidad.posicion);
	}
	
	public int getSalud() {
		return this.salud;
	}
	
	/**
	 * @pre: Se debe pasar como parámetro a una unidad a la que se desea atacar 
	 * si el enemigo se encuentra a menos de 2 de distancia le quita 10 puntos de salud
	 * @param otraUnidad
	 */
	public void atacar(Unidad otraUnidad) {
		if (this.distanciaCon(otraUnidad) < DISTANCIA_ATAQUE_MAXIMA) {
			otraUnidad.recibirDanio();
		}
	}
	
	private void recibirDanio() {
		this.salud -= DANIO;
	}
}
