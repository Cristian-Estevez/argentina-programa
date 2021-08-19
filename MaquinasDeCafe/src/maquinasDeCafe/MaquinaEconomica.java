package maquinasDeCafe;

public class MaquinaEconomica extends MaquinaDeCafe {

	private int contadorDeServidos = 0;
	
	@Override
	public void restarCafe() {
		contadorDeServidos++;
		if (contadorDeServidos % 3 == 0) {
			super.restarCafe();
			contadorDeServidos = 0;
		}
	}
}
