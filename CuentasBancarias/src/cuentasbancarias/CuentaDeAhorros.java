package cuentasbancarias;

public class CuentaDeAhorros extends Cuenta {

	private double saldoReservado = 0;
	
	public CuentaDeAhorros(double saldo) {
		super(saldo);
	}
	
	public CuentaDeAhorros() {
		super();
	}
	
	public void reservarSaldo(double monto) {
		super.validarMontoPositivo(monto);
		super.retirarDinero(monto);
		saldoReservado += monto;
	}
	
	public double getSaldoReservado() {
		return saldoReservado;
	}
	
	public void reincorporarSaldo(double monto) {
		if (monto >= this.getSaldo()) {
			super.agregarDinero(monto);
		}
		throw new Error("El saldo reservado es menor al monto ingresado");
	}

	
	
	
}
