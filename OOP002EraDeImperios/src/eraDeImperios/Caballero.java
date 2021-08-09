package eraDeImperios;

public class Caballero extends Unidad {

	private static final int DANIO = 30;
	private static final double DISTANCIA_ATAQUE_MAXIMA = 3;
	private static final int DISTANCIA_ATAQUE_MINIMA = 1;
	
	public Caballero (Posicion unaPosicion) {
		super(unaPosicion);
	}
	
	@Override
	public void atacar(Unidad otraUnidad) {
		double distancia = this.distanciaCon(otraUnidad);
		if (distancia < DISTANCIA_ATAQUE_MAXIMA && distancia >= DISTANCIA_ATAQUE_MINIMA) {
			otraUnidad.recibirDanio(DANIO);
		}
	}
}
