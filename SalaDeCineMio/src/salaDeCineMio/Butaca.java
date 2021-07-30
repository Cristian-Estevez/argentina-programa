package salaDeCineMio;

public class Butaca {
	
	boolean ocupada;
	
//	public Butaca() {
//		this.ocupada = false;
//	}
		
	public boolean estaOcupadoELAsiento() {
		return this.ocupada;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ocupada + " ";
	}
	
	
}
