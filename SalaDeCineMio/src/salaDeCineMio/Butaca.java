package salaDeCineMio;

public class Butaca {
	
	boolean ocupada;
	
	public boolean estaOcupadoELAsiento() {
		return this.ocupada;
	}
	
	@Override
	public String toString() {
		if (this.ocupada) {
			return "[  Ocupada   ]";
		}
		return "[ Desocupada ]";
	}

	public void ocuparAsiento() {
		this.ocupada = true;
	}	
}