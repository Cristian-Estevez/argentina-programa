package salaDeCineMio;

public class SalaDeCineMio {

	public Butaca[][] butacas;
	@SuppressWarnings("unused")
	private int cantidadDeButacas;
	private int butacasOcupadas;
	
	public SalaDeCineMio(int filas, int cantidadButacas) {
		this.butacas = new Butaca[filas][cantidadButacas/filas];
		inicializarSala(); // tengo que inicializar cada valor de un array creado con una clase
		cantidadDeButacas = cantidadButacas;
	}

	private void inicializarSala() {
		for (int i = 0; i < this.butacas.length; i++) {
			for (int j = 0; j < this.butacas[i].length; j++) {
				this.butacas[i][j] = new Butaca();
			}
			
		}
	}
	
	public void mostrarButacas() {
		for (Butaca[] fila : this.butacas) {
			for(Butaca butaca : fila) {
				System.out.print(butaca + " ");
			}
			System.out.println("");
		}		
	}
	
	/**
	 * @pre: pasar fila y asiento existente
	 * @param fila
	 * @param asiento
	 * @return true si ocupada, false si desocupada
	 */
	public boolean estaOcupada(int fila, int asiento) {
		return butacas[fila][asiento].estaOcupadoELAsiento();
	}
	
	/**
	 * @pre: 	
	 * @param fila
	 * @param asiento
	 * @return true si el asiento estaba desocupada y se logro ocupar
	 * @return false en caso de que el asiento estuviera ocupado
	 */
	public boolean ocuparButaca(int fila, int asiento) {
		if (!butacas[fila][asiento].estaOcupadoELAsiento()) {
			butacas[fila][asiento].ocuparAsiento();
			butacasOcupadas++;
			return true;
		} 
		return false;
	}
	
	public int getButacasOcupadas() {
		return butacasOcupadas;
	}
	
	public boolean hayEspacioPara(int cantidadDePersonas) {
		int cont;
		for(int i = 0; i < this.butacas.length; i++) {
			cont = 0;
			for (int j = 0; j < this.butacas[i].length; j++) {
				int primerAsientoLibre = j + 2 - cantidadDePersonas;
				int ultimoAsientoLibre = j + 1;
				if(!estaOcupada(i, j)) {
					cont++;
					System.out.println(cont+"");
				}
				if (cont == cantidadDePersonas) {
					System.out.println("Hay asientos contiguos para " + cantidadDePersonas + " personas, en la fila " + (i + 1) + "; en los asientos " + primerAsientoLibre + " al " + ultimoAsientoLibre );
					return true;
				}
			}
		}
		System.out.println("No hay " + cantidadDePersonas + " asientos contiguos en esta sala.");
		return false;
	}
}
