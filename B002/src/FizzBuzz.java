public class FizzBuzz{
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} 
		}
	}
}

/*
 * hacer dos clases fizzbuzz y app
 * 
 * app con main donde creo obj fizzbuzz y metodo para obtener pasando el nro
 * 
 * fizzbuzz pasarle como parametro el tope maximo de fizzbuzz en lugar de 0 a 100
 * 
 */