package r002InversionesMensuales;

public class AlmacenPago {

	private double saldo = 0;

	/**
	 * @post: imprime por std output el monto acumulado por los intereses al final
	 *        de cada año
	 * @param montoInvertir
	 * @param interesAnual
	 * @param cantidadAniosMaximo
	 */
	public double[] resultadoInversion(double montoInvertir, double interesAnual, 
								  int cantidadAniosMaximo) {
		// validando input
		validarMonto(montoInvertir);
		validarMonto(interesAnual);
		validarAnios(cantidadAniosMaximo);
		
		double[] saldosAcumuladosAnuales = new double[cantidadAniosMaximo];
		double interesMensual = (interesAnual * 100) / 12;
		int cantidadMesesMaximo = cantidadAniosMaximo * 12;
		saldo = montoInvertir;

		for (int i = 1, anios = 0; i <= cantidadMesesMaximo; i++) {
			saldo += (interesMensual * saldo) / 100;
			if (i % 12 == 0) {				
				double acumuladoPorAnio = redondeo4Decimales(saldo);
				System.out.println(acumuladoPorAnio);
				saldosAcumuladosAnuales[anios] = acumuladoPorAnio;
				anios++;
			}
		}
		return saldosAcumuladosAnuales;		
	}
	
	/**
	 * @post: imprime por pantalla los meses que demora llegar al saldo final
	 *        deseado
	 * @param montoInvertir
	 * @param interesAnual
	 * @param saldoFinalDeseado
	 */
	public int cuantosMeses(double montoInvertir, double interesAnual, 
							 double saldoFinalDeseado) {
		// validar input
		validarMonto(montoInvertir);
		validarMonto(interesAnual);
		validarMonto(saldoFinalDeseado);
		validarSaldoFinalDeseadoMayorAInicial(montoInvertir, saldoFinalDeseado);

		int mesesTranscurridos = 0;
		saldo = montoInvertir;
		double interesMensual = (interesAnual * 100) / 12;

		while (saldo < saldoFinalDeseado) {
			mesesTranscurridos++;
			saldo += (interesMensual * saldo) / 100;
		}
		System.out.println(mesesTranscurridos);
		return mesesTranscurridos;
	}

	private double redondeo4Decimales(double num) {
		double numRedondeado = ((Math.round(num * 10000)) / 10000.0);		
		return numRedondeado;
	}

	private void validarAnios(int anios) {
		if (anios <= 0) {
			throw new Error("La cantidad de años debe ser un número mayor a 0.");
		}
	}

	private void validarMonto(double monto) {
		if (monto <= 0) {
			throw new Error("El monto ingresado debe ser mayor a 0.");
		}
	}
	
	private void validarSaldoFinalDeseadoMayorAInicial(double montoInicial, double montoDeseado) {
		if (montoInicial > montoDeseado) {
			throw new Error("El saldo final deseado debe ser mayor al depósito inicial");
		}
	}

}