package r002InversionesMensuales;

public class App {

	public static void main(String[] args) {
		
		AlmacenPago miCuenta = new AlmacenPago();
		
		miCuenta.resultadoInversion(1000, 0.24, 4);		
		miCuenta.cuantosMeses(1000, 0.24, 2587);
	}

}
