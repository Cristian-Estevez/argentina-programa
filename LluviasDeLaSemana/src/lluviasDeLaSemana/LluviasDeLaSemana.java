package lluviasDeLaSemana;

public class LluviasDeLaSemana {

	private boolean[] lluvias;
	
	public LluviasDeLaSemana() {
		lluvias = new boolean[7];
	}
	
	/**
	 * @pre: el día debe estar entre 1 y 7
	 * @post: en el día indicado quedó registrado que llovió
	 * @param dia
	 */
	public void agregarQueLlovio(int dia) {
		validarDia(dia-1);
		lluvias[dia-1] = true;
	}
	
	/**
	 * @pre: el día debe estar entre 1 y 7
	 * @post: devuelve si llovió o no el día indicado
	 * @param dia
	 */
	public boolean llovioElDia(int dia) {
		validarDia(dia-1);
		return lluvias[dia-1];
	}
	
	/**
	 * @post: devuelve el número de días que llovió en la semana
	 * @return
	 */
	public int cantidadDeDiasQueLlovio() {
		int cantidadDias = 0;
		for (int i = 0; i < lluvias.length; i++) {
			if (lluvias[i]) {
				cantidadDias++;
			}
		}		
		return cantidadDias;
	}
	
	
	private void validarDia(int dia) {
		if (dia < 0 || dia > 6) {
			throw new Error("Día incorrecto");
		}		
	}
	
}
