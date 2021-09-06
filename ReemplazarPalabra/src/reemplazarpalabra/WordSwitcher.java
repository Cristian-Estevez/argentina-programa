package reemplazarpalabra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Implementar un método tal que dado un archivo de entrada (archivo que será leído) y uno de salida (archivo que será escrito), especificados con su ruta, y dos palabras: palabraAReemplazar y nuevaPalabra,  escriba en el archivo de salida el contenido del archivo de entrada, pero con la primer palabra reemplazada por la segunda.

 public void reemplazar(String archivoOrigen, String archivoDestino,
         String palabraAReemplazar, String nuevaPalabra);


Ejemplo, supongamos el contenido del archivo origen:

Un kit también puede formar parte de otro kit, por lo que un kit es un grupo de elementos de cualquiera de los tipos de elementos (simples o kit).  Cada tipo de elemento tiene un código, nombre y un precio.

 */

public class WordSwitcher {
	private BufferedReader br;
	private BufferedWriter bw;

	public WordSwitcher() {
	}

	public void reemplazar(String archivoOrigen, String archivoDestino, String palabraAReemplazar, String nuevaPalabra)
			throws IOException {

		br = new BufferedReader(new FileReader(archivoOrigen));
		bw = new BufferedWriter(new FileWriter(archivoDestino));
		String linea = "";
		String textoDeSalida = "";
		while ((linea = br.readLine()) != null) {
			textoDeSalida += linea.replaceAll(palabraAReemplazar, nuevaPalabra);			
		}
		bw.write(textoDeSalida);
		br.close();
		bw.close();
	}
}
