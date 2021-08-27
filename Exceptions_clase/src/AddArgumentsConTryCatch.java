
public class AddArgumentsConTryCatch {

	public static void main(String[] args) {
		try{
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe){
			System.err.println("Uno de los argumentos de la linea de comandos no es del tipo int");			
		}
	}
}
