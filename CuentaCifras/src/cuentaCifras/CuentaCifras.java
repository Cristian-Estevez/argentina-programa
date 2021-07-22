package cuentaCifras;

public class CuentaCifras {
	
	static public int contar(int num){
		
		
		int unidad = (num / 1)  % 10;
		int decena = (num / 10) % 10;
		int centena = (num / 100) % 10;
		int unidadDeMil = (num / 1000) % 10;
		
		int resultado = unidad + decena + centena + unidadDeMil;
		
		
		if (resultado > 9) {
			resultado = contar(resultado);
		}
		
		return resultado;
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		// System.out.println(contar(222));// 6
		System.out.println(contar(8889)); // 1
		// System.out.println(contar(7777)); // 1
		// cuando la suma tiene que dar 1 devuelve 0
	}

}
