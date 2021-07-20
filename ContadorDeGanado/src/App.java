
public class App {
	
	public static void main(String[] args) {
		Contador contador1 = new Contador();
		System.out.println(contador1.mostrar());
		
		contador1.contar();
		System.out.println(contador1.mostrar());
		
		contador1.contar();
		contador1.contar();
		contador1.contar();
		contador1.contar();
		System.out.println(contador1.mostrar());
		
		
		contador1.reiniciar();
		System.out.println(contador1.mostrar());
		
	}
}
