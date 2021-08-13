package empresa;

public class PlantaTemporaria extends Empleado {

	private static double VALOR_HORA = 2000;
	
	public PlantaTemporaria(int horasTrabajadas, int cantidadHijos, boolean casado) {
		super(horasTrabajadas, cantidadHijos, casado);
	}

	@Override
	public double getSalario() {
		
		return 0;
	}

}
