package quitaespacios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author cristian
 *Crear un archivo de texto con el nombre y contenido que quiera. 
Crear una aplicación que lea el archivo de texto y muestre su contenido por pantalla sin espacios. 
Por ejemplo, si el archivo tiene el siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”. 
Capturar las excepciones que sean necesarias.
 */
public class QuitaEspacios {

	BufferedReader lector;
	
	public QuitaEspacios(String nombreArchivo) throws FileNotFoundException {
		lector = new BufferedReader(new FileReader(nombreArchivo));
	}
	
	public String textoSinEspacios() {
		String devolver = "", linea;
		String[] tmp;
		
		try {
			while ((linea = lector.readLine()) != null) {
				tmp = new String[linea.split(" ").length];
				tmp = linea.split(" ");
				for (int i = 0; i < tmp.length; i++) {
					devolver += tmp[i];
				}
			}
		} catch (IOException e) {
			System.out.println("No se pudo leer una de las lineas del archivo");
		}
		return devolver;
	}
}
