package semana;

public enum DiaDeLaSemana {

	DOMINGO(0, "Dom"), 
	LUNES(1, "Lun"), 
	MARTES(2, "Mar"), 
	MIERCOLES(3, "Mie"), 
	JUEVES(4, "Jue"), 
	VIERNES(5, "Vie"), 
	SABADO(6, "Sab");
	
	private String abbr;
	private int indice;

	private DiaDeLaSemana(int indice, String abbr) {
		this.abbr = abbr;
		this.indice = indice;
	}

	public String getAbbr() {
		return this.abbr;
	}
	
	public boolean anteriorA(DiaDeLaSemana otro) {
		return Integer.compare(indice, otro.indice) < 0;
	}
	
	public DiaDeLaSemana maniana() {
		switch (indice) {
		case 0:{
			return LUNES;
		}
		case 1:{
			return MARTES;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + indice);
			
		}
	}
	
}
