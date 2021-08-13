package eraDeImperios;

public class Caballero extends Unidad {

	private final int DANIO = 30;
	private final double DISTANCIA_ATAQUE_MAXIMA = 3;
	private final int DISTANCIA_ATAQUE_MINIMA = 1;
	private int nivelDeMiedo;
	
	public Caballero (Posicion unaPosicion) {
		super(unaPosicion);
		nivelDeMiedo = 0;
	}
	
	@Override
	public void atacar(Unidad otraUnidad) {
		if(nivelDeMiedo >= 5) {
			this.escapar();
		}
		double distancia = this.distanciaCon(otraUnidad);
		if (distancia < DISTANCIA_ATAQUE_MAXIMA && distancia >= DISTANCIA_ATAQUE_MINIMA) {
			otraUnidad.recibirDanio(DANIO);
			nivelDeMiedo++;
		}
	}
	
	public void escapar() {
		this.posicion.moverse(4, 4);
		System.out.println("El caballo se asustó y corrió unos metros.");
	}
	
	public void volverALaBatalla() {
		this.posicion.moverse(-4, -4);
		nivelDeMiedo = 0;
		System.out.println("El caballero ha vuelto a la zona de batalla.");
	}
}
