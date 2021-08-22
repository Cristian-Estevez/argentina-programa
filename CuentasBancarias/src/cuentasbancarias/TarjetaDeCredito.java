package cuentasbancarias;

public class TarjetaDeCredito extends Productos implements Comprable {

	private double saldoAPagarAcumulado;
	private final static double INTERES_POR_GASTOS_ADMINISTRATIVOS = 0.03;
	
	public TarjetaDeCredito(Cuenta cuenta) {
		super(cuenta);
	}
	
	@Override
	public void comprar(double monto) {
		saldoAPagarAcumulado += monto * (1 + INTERES_POR_GASTOS_ADMINISTRATIVOS);
	}
	
	public double getSaldoAPagar() {
		return saldoAPagarAcumulado;
	}

	public double getSaldo() {
		return cuentaAsociada.getSaldo();
	}
	
	public void pagar() {
		cuentaAsociada.retirarDinero(saldoAPagarAcumulado);
	}
}
