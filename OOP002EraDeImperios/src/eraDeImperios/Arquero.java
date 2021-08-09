package eraDeImperios;

public class Arquero extends Caballero {
	
	private static final int DANIO = 7;
	private static final double DISTANCIA_ATAQUE_MAXIMA = 25;
	private static final int DISTANCIA_ATAQUE_MINIMA = 5;

	public Arquero(Posicion unaPosicion) {
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
