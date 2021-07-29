package salaDeCine;

public class Butaca {
	
	private boolean ocupada;
	
	public boolean estaOcupada() {
		return this.ocupada;
	}
	
	public boolean ocupar() {
		if(!this.ocupada) {
			this.ocupada = true;
			return true;
		}
		return false;
	}
	
	public boolean desocupar() {
		if(this.ocupada) {
			this.ocupada = false;
			return true;
		}
		return false;
	}

}
