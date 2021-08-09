package r002InversionesMensuales;

public class App {

	public static void main(String[] args) {
		
		AlmacenPago miCuenta = new AlmacenPago();
		
//		miCuenta.resultadoInversion(1000, 0.24, 4);	
		miCuenta.resultadoInversion(1000, 0.71355714, 5);
		miCuenta.cuantosMeses(1000, 0.24, 2587);
	}

}
