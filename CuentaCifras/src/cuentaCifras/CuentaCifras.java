package cuentaCifras;

public class CuentaCifras {
	
	static public int contar(int num){
		int resultado = 0; // aca esta el problema cuando llamo de vuelta me lo convierte en 0
		
		if ( num > 9) {
			while (num % 10 != 0) {
				resultado += num % 10;
				System.out.println("" + resultado);
				num = num / 10;
			}
			if (resultado > 9) {
				return contar(resultado);
			}

		} else {
			return num;
		}
				
		return resultado;
	}
	
	public static void main(String[] args) {
		
		// System.out.println(contar(222));// 6
		System.out.println(contar(1111111111)); // 1
		// System.out.println(contar(7777)); // 1
		// cuando la suma tiene que dar 1 devuelve 0
	}

}
