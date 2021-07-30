package salaDeCineMio;

import java.util.Arrays;

public class SalaDeCineMio {

	public Butaca[][] butacas;
	private int cantidadDeButacas;
	private int butacasOcupadas;
	
	public SalaDeCineMio(int filas, int cantidadButacas) {
		butacas = new Butaca[filas][cantidadButacas/filas];
		inicializarSala(); // tengo que inicializar cada valor de un array creado con una clase
		cantidadDeButacas = cantidadButacas;
	}

	private void inicializarSala() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = new Butaca();
			}
			
		}
	}
	
	public void mostrarButacas() {
		for (Butaca[] fila : butacas) {
			for(Butaca butaca : fila) {
				System.out.print(butaca);
			}
			System.out.println("");
		}		
	}
	
	public boolean estaOcupada(int fila, int asiento) {
		return butacas[fila][asiento].estaOcupadoELAsiento();
	}
}
