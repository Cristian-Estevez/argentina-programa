package cuentasbancarias;

public abstract class Productos {
	
	protected Cuenta cuentaAsociada;

	public Productos(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}
	
	public double getSaldo() {
		return cuentaAsociada.getSaldo();
	}
}
