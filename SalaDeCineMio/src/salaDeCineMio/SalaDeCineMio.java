package salaDeCineMio;

public class SalaDeCineMio {

	private Butaca[][] butacas;
	private int cantidadDeButacas;
	private int butacasOcupadas;
	
	public SalaDeCineMio(int filas, int cantidadButacas) {
		butacas = new Butaca[filas][cantidadButacas/filas];
		cantidadDeButacas = cantidadButacas;
	}
	
	public boolean consultarOcupada(int fila, int numButaca) {
		return butacas[fila][numButaca].estaOcupada();
	}
	
	public int getButacas() {
		return cantidadDeButacas;
	}
}
