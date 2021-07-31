package salaDeCineMio;

public class App {

	public static void main(String[] args) {
		SalaDeCineMio c1 = new SalaDeCineMio(4, 32);
		System.out.println(c1.estaOcupada(1, 3));
		
		c1.mostrarButacas();
		
		c1.hayEspacioPara(3);
		c1.hayEspacioPara(33);
	}

}
