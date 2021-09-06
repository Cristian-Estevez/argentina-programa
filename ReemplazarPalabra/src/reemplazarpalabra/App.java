package reemplazarpalabra;

import java.io.IOException;

public class App {

	public static void main(String[] args) {

		WordSwitcher ws = new WordSwitcher();
		try {
			ws.reemplazar("archivos/input.txt", "archivos/salida.txt", "kit", "set");
		} catch (IOException e) {
			System.err.println("Algo salió mal al leer los archivos de entrada o se salida");
		}
	}

}
