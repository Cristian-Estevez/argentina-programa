package monedero;

public class Monedero {
	
	private double dinero;

	public Monedero(double dineroInicial) {
		dinero = dineroInicial;
	}
	
	public void ingresarDinero(double dineroAIngresar) {
		dinero += dineroAIngresar;
	}
	
	public double sacarDinero(double dineroASacar) {
		if (dinero >= dineroASacar) {
			dinero -= dineroASacar;
			return dineroASacar;
		} else {
			return 0;
		}
	}
	
	public double verDineroDisponible() {
		return dinero;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monedero miMonedero = new Monedero(1000);
		
		System.out.println("El dinero disponilbe es: " + miMonedero.verDineroDisponible());
		
		System.out.println("Sacar 450:        " + miMonedero.sacarDinero(450));
	}

}
