package vehiculos;

public class Motocicleta extends Vehiculo {

	@SuppressWarnings("unused")
	private Persona acompaniante;
	
	public Motocicleta(Persona chofer) {
		super(chofer);
	}
	
	public Motocicleta() {
	}

	public void subeAcompañante(Persona acompaniante) {
		if (this.estaVacio()) {
			this.acompaniante = acompaniante;
			this.pasajerosABordo++;
		} else {
			throw new Error("Ya hay un acompañante, no quedan asientos disponibles.");
		}		
	}
}
