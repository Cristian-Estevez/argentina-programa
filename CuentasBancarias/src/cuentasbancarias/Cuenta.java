package cuentasbancarias;

public class Cuenta {
	
	private double saldo = 0;
	
	public void agregarDinero(double dineroAagregar) {
		saldo += dineroAagregar;
	}
	
	public double retirarDinero(double dineroAretirar) {
		if ( dineroAretirar > saldo) {
			System.out.println("No te alcanza la platita");
			return 0;
		}
		saldo -= dineroAretirar;
		return dineroAretirar;
	
	}
		
	public double getSaldo() {
		return saldo;
	}
	

}
