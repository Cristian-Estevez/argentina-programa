package r002InversionesMensuales;

public class AlmacenPago
{
	
	private double saldo = 0;
	private int cantidadMesesMaximo = 0;
	private double interesMensual = 0;
	
	/**
	 * @post: imprime por std output el monto acumulado por los intereses al final de cada año
	 * @param montoInvertir
	 * @param interesAnual
	 * @param cantidadAniosMaximo
	 */
	public void resultadoInversion(double montoInvertir, double interesAnual, int cantidadAniosMaximo) {
		// validando input 
		validarMonto(montoInvertir);
		validarMonto(interesAnual);
		validarAnios(cantidadAniosMaximo);		
		
		interesMensual = (interesAnual * 100) / 12;
		cantidadMesesMaximo = cantidadAniosMaximo * 12;
		saldo = montoInvertir;
		
		for (int i = 1; i <= cantidadMesesMaximo ; i++) {
			saldo += (interesMensual * saldo) / 100;
			if (i % 12 == 0) {
				System.out.format("%.4f \n", saldo);
			}
		}
	}
	
	private void validarAnios(int anios) {
		if(anios <= 0) {
			throw new Error("La cantidad de años debe ser un número mayor a 0.");
		}
	}
	
	private void validarMonto(double monto) {
		if (monto <= 0) {
			throw new Error("El monto ingresado debe ser mayor a 0.");
		}
	}
	
	/**
	 * @post: imprime por pantalla los meses que demora llegar al saldo final deseado
	 * @param montoInvertir
	 * @param interesAnual
	 * @param saldoFinalDeseado
	 */
	public void cuantosMeses(double montoInvertir, double interesAnual, double saldoFinalDeseado) {
		// validar input
		validarMonto(montoInvertir);
		validarMonto(interesAnual);
		validarMonto(saldoFinalDeseado);
		validarSaldoFinalDeseadoMayorAInicial(montoInvertir, saldoFinalDeseado);
		
		int mesesTranscurridos = 0;
		saldo = montoInvertir;
		interesMensual = (interesAnual * 100) / 12;
		
		while(saldo < saldoFinalDeseado) {
			mesesTranscurridos++;
			saldo += (interesMensual * saldo) / 100;
		}
		System.out.println(mesesTranscurridos);
	}

	private void validarSaldoFinalDeseadoMayorAInicial(double montoInicial, double montoDeseado) {
		if (montoInicial > montoDeseado) {
			throw new Error("El saldo final deseado debe ser mayor al depósito inicial");
		}
	}
	
}
/* preguntar si manejar ingreso de datos negativos
 * 
 * 
 */