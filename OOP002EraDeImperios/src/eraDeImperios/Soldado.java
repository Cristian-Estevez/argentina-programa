package eraDeImperios;

public class Soldado extends Unidad {

	private static final int DANIO = 20;
	private static final double DISTANCIA_ATAQUE_MAXIMA = 1.5;
	
	public Soldado(Posicion unaPosicion) {
		super(unaPosicion);
	}

	public void atacar(Unidad otraUnidad) {
		if (this.distanciaCon(otraUnidad) < DISTANCIA_ATAQUE_MAXIMA) {
			otraUnidad.recibirDanio(DANIO);
		}
	}
}
