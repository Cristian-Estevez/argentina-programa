package empresa;

public abstract class Empleado {

	private int horasTrabajadas;
	private int cantidadHijos;
	private boolean casado;
	private static double VALOR_HIJO = 2000;
	private static double VALOR_CONYUGE = 1000;

	public Empleado(int horasTrabajadas, int cantidadHijos, boolean casado) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadHijos = cantidadHijos;
		this.casado = casado;
	}

	public abstract double getSalario();

	double getSalarioFamiliar() {
		double salarioFamiliar = this.cantidadHijos * VALOR_HIJO;
		if (this.casado) {
			salarioFamiliar += VALOR_CONYUGE;
		}
		return salarioFamiliar;
	}
}
