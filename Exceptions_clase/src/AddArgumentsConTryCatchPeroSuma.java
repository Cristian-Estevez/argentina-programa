
public class AddArgumentsConTryCatchPeroSuma {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException nfe) {
				System.err.println("El argumento [" + args[i] + "] no es del tipo integer.");
			}
		}
		System.out.println("Sum = " + sum);
	}
}
