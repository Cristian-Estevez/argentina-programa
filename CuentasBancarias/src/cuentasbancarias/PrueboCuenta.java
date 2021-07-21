package cuentasbancarias;

public class PrueboCuenta {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
	    System.out.println(miCuenta.getSaldo()); // 0

	    miCuenta.agregarDinero(1000);
	    System.out.println(miCuenta.getSaldo()); // 1000

	    miCuenta.retirarDinero(550);
	    System.out.println(miCuenta.getSaldo()); // 450
	    
	    miCuenta.retirarDinero(550);
	    System.out.println(miCuenta.getSaldo()); // 

	}

}
