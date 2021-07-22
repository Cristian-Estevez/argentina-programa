package nota;

public class Nota {
	
	private int valorNota = 0;
	
	public Nota(int valorInicial) {
		this.setValorNota(valorInicial);
	}
	
	public int obtenerValor() {
		return this.valorNota;
	}
	
	public boolean aprobado() {
		return (this.valorNota >= 4);
	}
	
	public boolean desaprobado() {
		return (this.valorNota < 4);
	}
	
	public void recuperar(int nuevoValor) {
		if (nuevoValor > this.valorNota) {
			this.valorNota = nuevoValor;
		}
	}
	
	private boolean esValorCorrecto(int x) {
		return (x >= 0) && (x <= 10);
	}
	
	private void setValorNota(int nota) {
		if (!esValorCorrecto(nota)) {
			Error notaInvalida = new Error("Nota inválida ingresada");
			throw notaInvalida;
		}
		this.valorNota = nota;
	}
	
	public static void main(String[] args) {
		Nota invalida = new Nota(11);
	}
}
	

