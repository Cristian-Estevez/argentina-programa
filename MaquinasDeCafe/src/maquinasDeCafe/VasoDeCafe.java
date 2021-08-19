package maquinasDeCafe;

public class VasoDeCafe {

	private boolean lleno = false;
	
	public VasoDeCafe(boolean lleno) {
		this.lleno = lleno;
	}
	
	public boolean estaLleno() {
		return lleno;
	}

	@Override
	public String toString() {
		return "VasoDeCafe [lleno=" + lleno + "]";
	}
	
}
