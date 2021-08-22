package vehiculos;

public abstract class Vehiculo {

	protected Persona chofer;
	private double kilometrosRecorridos;
	protected int pasajerosABordo;
	
	public Vehiculo(Persona chofer) {
		this.asignarChofer(chofer);
	}
	
	public void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public void cambiarChofer(Persona chofer) {
		if (this.estaVacio()) {
			this.asignarChofer(chofer);
		} else {
			throw new Error("El autbus debe estar vacío para poder cambiar de chofer");
		}
	}
	
	public int getCantidadPasajerosAbordo() {
		return pasajerosABordo;
	}
	
	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	public boolean estaVacio() {
		return pasajerosABordo == 0;
	}
	
	public Persona getChofer() {
		return chofer;
	}
}
