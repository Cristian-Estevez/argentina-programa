package bonustrack;

public class SumaCifras {
	
	public int sumarCifras(int numero) {
		int suma = 0;
		int cifras = cuantasCifrasTiene(numero);		
		
		/*
		int unidad = (numero / 1) % 10;
		int decena = (numero / 10) % 10;
		int centena = (numero / 100) % 10;
		int uDeMil = (numero / 1000) % 10;
		
		suma = unidad + decena + centena + uDeMil;
		*/
		if (numero < 10) {
			return numero;
		}
		
		// int unidad, decena;		
		for (int i = 0; i < cifras; i++) {
			suma += numero / Math.pow(10, i) % 10;
		}
		
		/*while (suma >= 10) {
			unidad = suma % 10;
			decena = (suma / 10) % 10;
			suma = unidad + decena;
		}
		*/
		
		return sumarCifras(suma);
	}


	private int cuantasCifrasTiene(int numero) {
		int div = numero;
		int cifras = 0;
		while (div != 0) {
			div = div / 10;
			cifras ++;
		}
		return cifras;
	}
	
	
	public static void main(String[] args) {
		
		SumaCifras sc = new SumaCifras();
		System.out.println(sc.sumarCifras(1213));
		System.out.println(sc.sumarCifras(1234));
		System.out.println(sc.sumarCifras(3899));
		System.out.println(sc.sumarCifras(999999));
		System.out.println(sc.sumarCifras(234567899));
	}

}
