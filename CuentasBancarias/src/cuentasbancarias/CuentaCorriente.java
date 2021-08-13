package cuentasbancarias;

public class CuentaCorriente extends Cuenta {

	private double limiteDescubierto;
	private double saldoDescubierto;

	public CuentaCorriente(double saldo, double descubierto) {
		super(saldo);
		this.limiteDescubierto = descubierto;
		this.saldoDescubierto = descubierto;
	}

	@Override
	public double retirarDinero(double monto) {		 
		if (monto > getSaldoTotalDisponible()) {
			throw new Error("Se intentó retirar mas dinero del disponible.");
		} else if (monto <= super.getSaldo()) {
			super.retirarDinero(monto);
		} else {
			double montoATomarDelDescubierto = monto - this.getSaldo();
			super.retirarDinero(this.getSaldo());
			this.saldoDescubierto -= montoATomarDelDescubierto;
		}		
		return monto;
	}
	
	public double getSaldoTotalDisponible() {
		double saldoTotalDisponible = this.getSaldo() + saldoDescubierto;
		return saldoTotalDisponible;		
	}
	
	private double getLimiteDescubierto() {
		return limiteDescubierto;
	}
	
	private double getSaldoDescubierto() {
		return saldoDescubierto;
	}
	
	public double getSaldoNegativo() {
		return getSaldoDescubierto() - getLimiteDescubierto();
	}
	
	@Override
	public void agregarDinero(double monto) {
		if (getSaldoDescubierto() == getLimiteDescubierto()) {
			super.agregarDinero(monto);
		} else {
			double diferenciaAFavor = monto + this.getSaldoNegativo();
			saldoDescubierto = getLimiteDescubierto();
			super.agregarDinero(diferenciaAFavor);
		}		
	}
}
