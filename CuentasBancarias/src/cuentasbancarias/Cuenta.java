package cuentasbancarias;

import java.util.Arrays;

public class Cuenta {
	
	private double saldo = 0;
	private Registro[] registros;
	private int posicionRegistro = 1;
	private static final int CANTIDAD_DE_REGISTROS_DEFAULT = 10;
	
	
	public Cuenta(double saldo) {
		this.validarMontoPositivo(saldo);
		registros = new Registro[CANTIDAD_DE_REGISTROS_DEFAULT];
		this.agregarDinero(saldo);

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
		if (posicionRegistro > CANTIDAD_DE_REGISTROS_DEFAULT) {
			posicionRegistro = 1;
		}
		registros[posicionRegistro - 1] = new Registro(dineroAagregar, motivo);
		posicionRegistro++;
		
	}
	
	protected void validarMontoPositivo(double saldo) {
		if (saldo < 0) {
			throw new Error("El monto para manipular en la cuenta no puede ser igual a cero ni un valor negativo");
		}
	}
	
	public String getDetallesTransaccion(int posicion) {
		if(posicion <= CANTIDAD_DE_REGISTROS_DEFAULT) {
			return registros[posicion - 1].getDetallesTransaccion();
		}
		throw new Error("No existen registros en esa posición");		
	}

	public void ordenarRegistros() {
		Arrays.sort(registros);
	}
	
	public void ordenarPorMonto() {
		Arrays.sort(this.registros, 0, registros.length, new ComparadorPorMonto());;
	}
	// sin testear todavía
	
}
