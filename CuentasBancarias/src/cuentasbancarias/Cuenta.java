package cuentasbancarias;

public class Cuenta {
	
	private double saldo = 0;
	private Registro[] registros;
	private int posicionRegistro = 1;
	
	
	public Cuenta(double saldo) {
		this.validarMontoPositivo(saldo);
		this.saldo = saldo;
		registros = new Registro[30];
	}
	
	public Cuenta() {
		this(0);
	}
		
	public void agregarDinero(double dineroAagregar) {
		this.validarMontoPositivo(dineroAagregar);
		saldo += dineroAagregar;
		this.registrarTransaccion(dineroAagregar, Motivo.DEPOSITO);
	}
	
	public double retirarDinero(double dineroAretirar) {
		this.validarMontoPositivo(dineroAretirar);
		if (dineroAretirar > this.saldo) {
			throw new Error("Dinero insuficiente");
		}
		this.saldo -= dineroAretirar;
		this.registrarTransaccion(dineroAretirar, Motivo.TRANSFERENCIA_EXTRACCION);
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
	
	public void registrarTransaccion(double dineroAagregar, Motivo motivo) {
		registros[posicionRegistro - 1] = new Registro(dineroAagregar, motivo);
		posicionRegistro++;
	}
	
	protected void validarMontoPositivo(double saldo) {
		if (saldo < 0) {
			throw new Error("El monto para manipular en la cuenta no puede ser igual a cero ni un valor negativo");
		}
	}
	
	public String getDetallesTransaccion(int posicion) {
		if(posicion <= posicionRegistro) {
			return registros[posicion - 1].getDetallesTransaccion();
		}
		throw new Error("No existen registros en esa posición");
		
	}

}
