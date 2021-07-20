package cuentaCifras;

public class CuentaCifras {

	static public int contar(int num){
		int resultado = 0;
		
		
		
		int temp = num;
		do {
			resultado += temp % 10;
			temp = temp / 10;
		} while (temp != 0);
		if (resultado < 10) {
			return resultado;
		}
		contar(resultado);
		
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CuentaCifras.contar(2334));
		
	}

}
