package salaDeCine;

public class SalaDeCine {
	private Butaca[][] butacas;
	private int cantidadButacasOcupadas;
	
	public SalaDeCine(int cantidadDeButacas, int cantidadDeFilas) {
		butacas = new Butaca[cantidadDeButacas][cantidadDeButacas/cantidadDeFilas];
	}
	
	public void mostrarButacas() {
		for (Butaca[] fila : butacas) {
			for (Butaca butaca : fila) {
				System.out.print(butaca +" ");
			}
			System.out.println();
		}
	}
	
	public void ocupar(int fila, int columna) {
		if(butacas[fila][columna].ocupar()) {
			cantidadButacasOcupadas++;
		}
		
	}
	
	public void desocupar(int fila, int columna) {
		if(butacas[fila][columna].desocupar()) {
			cantidadButacasOcupadas--;
		}
	}
	
	public int getOcupadas() {
		return cantidadButacasOcupadas;
	}
	
	public static void main(String[] args) {
		SalaDeCine s1 = new SalaDeCine(8, 2);
		s1.mostrarButacas();
	}
}
