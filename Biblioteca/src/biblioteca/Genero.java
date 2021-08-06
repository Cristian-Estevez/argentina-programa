package biblioteca;

public enum Genero {
	
	FICCION(001), FANTASIA(002), DIVULGACION(003), AUTOAYUDA(004), INFANTIL(005);

	private int codigo;

	private Genero(int codigo) {
		this.codigo=codigo;
	}
	
	public int getCodigo(int codigo) {
		return this.codigo;
	}

}
