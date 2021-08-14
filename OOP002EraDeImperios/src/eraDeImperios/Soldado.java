package eraDeImperios;

public class Soldado extends Unidad {

	private final int DANIO = 20;
	private final double DISTANCIA_ATAQUE_MAXIMA = 1.5;
	private final static int STAMINA_INICIAL = 3;
	private int stamina;
	
	
	public Soldado(Posicion unaPosicion) {
		super(unaPosicion);
		stamina = STAMINA_INICIAL;
	}

	@Override
	public void atacar(Unidad otraUnidad) {
		if (stamina <= 0) {
			System.out.println("Este soldado necesita descansar.");
		}
		
		if (this.distanciaCon(otraUnidad) < DISTANCIA_ATAQUE_MAXIMA && 
				stamina > 0) {
			otraUnidad.recibirDanio(DANIO, this);
			stamina--;
		}
	}
	
	/**
	 * @pre: cuando el soldado realizó 3 ataques consecutivos sin descanso debe descansar
	 * para recuperar la stamina
	 */
	public void descansar() {
		stamina = STAMINA_INICIAL;
	}	
}