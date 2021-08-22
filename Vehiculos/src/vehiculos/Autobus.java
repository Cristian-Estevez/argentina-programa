package vehiculos;

public class Autobus extends Vehiculo {
	
	private Persona[] pasajeros;
	private static final int CUPO_POSIBLE = 50;
	
	public Autobus(Persona chofer) {
		super(chofer);
		pasajeros = new Persona[CUPO_POSIBLE];
	}
	
	public void subePasajero(Persona pasajero) {
		if(this.hayCupo()) {
			pasajeros[pasajerosABordo++] = pasajero;
		}
	}
	
	public boolean hayCupo() {
		return this.getCantidadPasajerosAbordo() < CUPO_POSIBLE;
	}
}
