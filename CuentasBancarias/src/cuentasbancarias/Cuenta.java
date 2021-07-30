package cuentasbancarias;

public class Cuenta {
	
	private double saldo = 0;
	
	public Cuenta(double saldo) {
		this.validarMontoPositivo(saldo);
		this.saldo = saldo;
	}
	
	public Cuenta() {
		this(0);
	}
	
	public void validarMontoPositivo(double saldo) {
		if (saldo < 0) {
			throw new Error("El monto para manipular en la cuenta no puede ser igual a cero ni un valor negativo");
		}
	}
	
	
	public void agregarDinero(double dineroAagregar) {
		this.validarMontoPositivo(dineroAagregar);
		saldo += dineroAagregar;
	}
	
	public double retirarDinero(double dineroAretirar) {
		this.validarMontoPositivo(dineroAretirar);
		if (dineroAretirar > this.saldo) {
			throw new Error("Dinero insuficiente");
		}
		this.saldo -= dineroAretirar;
		return dineroAretirar;
	}
		
	public double getSaldo() {
		return this.saldo;
	}
	
	public void transferir(double monto, Cuenta cuentaDestino) {
		if (monto == 0) {
			throw new Error("El monto a transferir debe ser mayor a cero");
		}
		this.retirarDinero(monto);
		cuentaDestino.agregarDinero(monto);
	}
	

}
