package cuentasbancarias;

public class PlazoFijo extends Productos {

	private final static double INTERES_MENSUAL = 0.03;
	private double saldo;
	
	public PlazoFijo(Cuenta cuenta) {
		super(cuenta);
		saldo = 0;
	}
	
	public void ponerAPlazoFijo(double monto) {
		cuentaAsociada.retirarDinero(monto);
		saldo += monto * (1 + INTERES_MENSUAL);
	}
	
	public void recuperarDinero() {
		cuentaAsociada.agregarDinero(saldo);
		saldo = 0;
	}
	
	public double getSaldoPlazoFijo() {
		return saldo;
	}
	
}
