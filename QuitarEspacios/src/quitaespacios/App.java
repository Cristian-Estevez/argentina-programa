package quitaespacios;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) {
		QuitaEspacios qe = null;
		try {
			qe = new QuitaEspacios("archivos/consigna.txt");
		} catch (FileNotFoundException e) {
			System.err.println("No se encontró el archivo especificado");
		}
	
		System.out.println(qe.textoSinEspacios());
	}
}
