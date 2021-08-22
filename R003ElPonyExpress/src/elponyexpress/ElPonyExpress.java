package elponyexpress;

public class ElPonyExpress {
	
	private final static int MAXIMO_MILLAS_POR_CABALLO = 100;
	
	public static int caballos(int[] distancias) {
		int distanciaRecorrida = 0;
		int caballosNecesarios = 1;
		for (int i = 0; i < distancias.length; i++) {
			if ((distanciaRecorrida + distancias[i]) <= MAXIMO_MILLAS_POR_CABALLO) { 
				distanciaRecorrida += distancias[i];
			} else {
				caballosNecesarios++;
				distanciaRecorrida = distancias[i];
			}
		}		
		return caballosNecesarios;
	}
//	
//	private static boolean llegaConLasMillas(int millasRecorridas, int proximoTramo) {
//		return millasRecorridas + proximoTramo <= MAXIMO_MILLAS_POR_CABALLO;
//	}
}
