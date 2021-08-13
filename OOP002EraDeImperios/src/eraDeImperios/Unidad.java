package eraDeImperios;

public abstract class Unidad {
	
	protected Posicion posicion;
	private int salud;
	private final int SALUD_INICIAL = 100;
//	private static final int DANIO = 10;
//	private static final double DISTANCIA_ATAQUE_MAXIMA = 2;
	
	public Unidad(Posicion unaPosicion) {
		posicion = unaPosicion;
		salud = SALUD_INICIAL;
	}
	
	/**
	 * 
	 * @param otraUnidad
	 * @return regresa la distancia entre esta unidad y la pasada por parámetro
	 */
	protected double distanciaCon(Unidad otraUnidad) {
		return this.posicion.distanciaCon(otraUnidad.posicion);
	}
	
	public int getSalud() {
		return this.salud;
	}
	
	public abstract void atacar(Unidad otraUnidad);
	
	protected void recibirDanio(int ptsDanio) {
		this.salud -= ptsDanio;
	}
}
