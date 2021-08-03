package sumo;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		PreTorneo torneo = new PreTorneo(10);
		
		torneo.agregar(new Luchador(300, 1500));
		torneo.agregar(new Luchador(320, 1500));
		torneo.agregar(new Luchador(299, 1580));
		torneo.agregar(new Luchador(330, 1690));
		torneo.agregar(new Luchador(330, 1540));
		torneo.agregar(new Luchador(339, 1500));
		torneo.agregar(new Luchador(298, 1700));
		torneo.agregar(new Luchador(344, 1570));
		torneo.agregar(new Luchador(276, 1678));
		torneo.agregar(new Luchador(289, 1499));
		
		torneo.calcularDominios();
		
		System.out.println(Arrays.toString(torneo.calcularDominios()));
	}

}
