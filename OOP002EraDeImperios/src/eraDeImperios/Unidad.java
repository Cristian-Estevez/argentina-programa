package eraDeImperios;

public abstract class Unidad {

	protected Posicion posicion;
	private int salud;
	private final int SALUD_INICIAL = 100;
	private static final int DINERO_INICIAL = 150;
	private static final int VALOR_POCION = 75;
	private int dineroEnCartera;

	public Unidad(Posicion unaPosicion) {
		posicion = unaPosicion;
		salud = SALUD_INICIAL;
		dineroEnCartera = DINERO_INICIAL;
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

	/**
	 * @pre: recibe puntos de daño y la referenciade la unidad que lanzó el ataque, 
	 * 
	 * @post se le restan los puntos de salud pasados por parametro a esta unidad.
	 * En caso que la unidad muera(salud <= 0) el dinerEnCartera que tenia 
	 * esta unidad pasa al la atancante
	 * @param ptsDanio
	 * @param atacante
	 */
	protected void recibirDanio(int ptsDanio, Unidad atacante) {
		if (this.estaVivo()){
			this.salud -= ptsDanio;
			if (salud <= 0) {
				atacante.saquear(this.getDineroEnCartera());
				this.dineroEnCartera = 0;
				this.salud = 0;
			}
		}
	}

	/**
	 * @post en caso de que sea suficiente se disminuye el dinero en cartera por la 
	 * misma cantidad del VALOR_POCION
	 * @post la salud de la unidad vuelve al valor de SALUD_INICIAL
	 */
	public void comprarPocion() {
		this.estaVivo();
		if (getDineroEnCartera() >= VALOR_POCION) {
			dineroEnCartera -= VALOR_POCION;
			salud = SALUD_INICIAL;
			System.out.println("Te has recuperado.");
		} else {
			System.out.println("Dinero insuficiente");
		}

	}

	public int getDineroEnCartera() {
		return dineroEnCartera;
	}

	public boolean estaVivo() {
		if (salud > 0) {
			return true;
		}
		return false;
	}

	public void saquear(int dinero) {
		this.dineroEnCartera += dinero;
	}
}
