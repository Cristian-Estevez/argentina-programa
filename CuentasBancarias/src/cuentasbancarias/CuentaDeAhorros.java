package cuentasbancarias;

public class CuentaDeAhorros extends Cuenta {

	private double saldoAhorro = 0;
	
	public CuentaDeAhorros(int saldo) {
		super(saldo);
	}
	
	public CuentaDeAhorros() {
		super();
	}
	
	public void ahorrar(double monto) {
		super.validarMontoPositivo(monto);
		super.retirarDinero(monto);
		saldoAhorro += monto;
	}
	
	public double getSaldoAhorro() {
		return saldoAhorro;
	}

	
	
	
}
