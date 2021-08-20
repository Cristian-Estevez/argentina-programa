package cuentasbancarias;

public class TarjetaDeDebito extends Productos implements Comprable {

	public TarjetaDeDebito(Cuenta cuenta){
		super(cuenta);
	}
	
	@Override
	public void comprar(double monto) {
		super.cuentaAsociada.retirarDinero(monto);
	}

}
