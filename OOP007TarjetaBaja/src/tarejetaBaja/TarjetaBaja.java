package tarejetaBaja;

public class TarjetaBaja {

	private double saldo; 
	private int viajesColectivo, viajesSubte;
	final double costoViajeColectivo = 21.5;
	final double costoViajeSubte = 19.5;
	
	/**
     * post: saldo de la Tarjeta en saldoInicial.
     */
	public TarjetaBaja(double saldoInicial) {
		if (dineroValido(saldoInicial)) {
			this.saldo = saldoInicial;
		}
	}
	
	/**
    * post: devuelve el saldo actual de la Tarjeta
    */
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	/**
     * post: agrega el monto al saldo de la Tarjeta.
     */
	public void cargar(double dinero) {
		if (dineroValido(dinero)) {
			this.saldo += dinero;
		}
	}
	
	private boolean dineroValido(double dinero) {
		if (dinero < 0) {
			Error errorDineroInvalido = new Error("El dinero a cargar debe ser mayor a 0");
			throw errorDineroInvalido;
		}
		return (dinero >= 0);
	}
	
	/**
     * post: devuelve la cantidad de viajes en colectivo.
     */
	public double contarViajesColectivo() {
		return viajesColectivo;
	}
	
	/**
     * post: devuelve la cantidad de viajes en subte.
     */
	public double contarViajesSubte() {
		return viajesSubte;
	}
	
	/**
     * post: devuelve la cantidad de viajes realizados.
     */
	public double contarViajes() {
		return viajesColectivo + viajesSubte;
	}
	
	/**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
	public void pagarViajeEnColectivo() {
		if (!dineroSuficiente(costoViajeColectivo)) {
			Error noAlcanzaParaElViaje = new Error("Saldo insuficiente para viajar en colectivo");
			throw noAlcanzaParaElViaje;
		}
		viajesColectivo++;
		this.saldo -= costoViajeColectivo;
	}
	
	/**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
	public void pagarViajeEnSubte() {
		if (!dineroSuficiente(costoViajeSubte)) {
			Error noAlcanzaParaElViaje = new Error("Saldo insuficiente para viajar en colectivo");
			throw noAlcanzaParaElViaje;
		}
		viajesSubte++;
		this.saldo -= costoViajeSubte;
	}
	
	/**
	 * @post: evalua si el saldo alcanza para realizar un viaje
	 * @param costo
	 * @return
	 */
	private boolean dineroSuficiente(double costo) {
		return costo <= this.saldo;
	}
}
