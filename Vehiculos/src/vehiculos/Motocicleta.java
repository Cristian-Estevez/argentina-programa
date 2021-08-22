package vehiculos;

public class Motocicleta extends Vehiculo {

	@SuppressWarnings("unused")
	private Persona acompañante;
	
	public Motocicleta(Persona chofer) {
		super(chofer);
	}

	public void subeAcompañante(Persona acompañante) {
		if (this.estaVacio()) {
			this.acompañante = acompañante;
			this.pasajerosABordo++;
		} else {
			throw new Error("Ya hay un acompañante, no quedan asientos disponibles.");
		}		
	}
}
