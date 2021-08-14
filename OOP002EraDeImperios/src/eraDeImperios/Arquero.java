package eraDeImperios;

public class Arquero extends Caballero {
	
	private final int DANIO = 7;
	private final double DISTANCIA_ATAQUE_MAXIMA = 25;
	private final int DISTANCIA_ATAQUE_MINIMA = 5;
	private static final int CANTIDAD_FLECHAS = 5;
	private int flechasEnCarcaj;

	public Arquero(Posicion unaPosicion) {
		super(unaPosicion);
		flechasEnCarcaj = CANTIDAD_FLECHAS;
	}
	
	@Override
	public void atacar(Unidad otraUnidad) {
		if (flechasEnCarcaj <= 0) {
			System.out.println("Debes recargar el carcaj");
		}
		double distancia = this.distanciaCon(otraUnidad);
		if (distancia < DISTANCIA_ATAQUE_MAXIMA && distancia >= DISTANCIA_ATAQUE_MINIMA && 
			flechasEnCarcaj > 0) {
			otraUnidad.recibirDanio(DANIO, this);
			flechasEnCarcaj--;
		}
	}	
	
	
	public void recargar() {
		flechasEnCarcaj = CANTIDAD_FLECHAS;
	}
}