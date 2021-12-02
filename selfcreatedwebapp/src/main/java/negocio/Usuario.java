package negocio;

public class Usuario {
	
	private String name;
	private int monedas;
	private int id;
	
	public Usuario (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	
	public int getMonedas() {
		return monedas;
	}

	@Override
	public String toString() {
		return "Usuario =" + name + ". Su id es: " + this.id + ". Monedas: " + monedas + ".";
	}
	
}
