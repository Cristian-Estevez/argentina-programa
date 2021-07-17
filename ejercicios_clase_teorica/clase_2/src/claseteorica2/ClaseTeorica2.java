package claseteorica2;

public class ClaseTeorica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		numero = 3;
		
		long numeroLong;
		numeroLong = 5000000000000000l;
		
		float s = 3.43f;
		
		double dobleReal = 3.7356238745141;
		
		boolean thaBool = true; // or false
		
		String str = "un string no es un dato primitivo";
		
		int arr[] = new int[2];
		arr[0] = 56;
		arr[1] = 12;
		
		long[] vec = {2, 1, 3};
		
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
		
		
		// matriz
		int[][] mat = new int[2][2];
		mat[0][0] = 34;
		mat[0][1] = 44;
		mat[1][0] = 9;
		mat[1][1] = 12;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + ", ");
			}
			System.out.println("");
		}
		// matriz irregular
		int[][] v = new int[2][]; // la segunda dimension puede ser de diferentes tamaños
		v[0] = new int[3];
		v[1] = new int[5];
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.print(v[i][j] + ", ");
			}
			System.out.println("");
		}
		
		// if statements
		int n = 50;
		if (n == 0) {
			System.out.println("Soy 0");
		} else if (n < 50){
			System.out.println("Soy menor a 50");
		} else {
			System.out.println("Soy mayor o igual a 50");
		}
		
		
		// switch method
		
		int m = 1;
		switch(m){
			case 1:
				System.out.println("Soy 1");
				break;
			case 2: 
				System.out.println("Soy 2");
				break;
			default:
				System.out.println("Soy otro número");
				break;
			
		}
		
		
		// while loop
		while (m < 5) {
			System.out.println(m++);			
		}
		
		// do while
		do {
			System.out.println(m--);
		}while(m > 0);
		
	}

}
