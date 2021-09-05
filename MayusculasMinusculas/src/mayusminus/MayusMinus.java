package mayusminus;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Crear una aplicación donde se solicite la ruta de un archivo por teclado y 
 * un texto que se desea escribir en el archivo. 
Se deberá mostrar por pantalla el mismo texto pero variando entre mayúsculas 
y minúsculas, es decir, si se escribe “Bienvenido” deberá devolver “bIENVENIDO”. 
Si se escribe cualquier otro carácter, se quedara tal y como se escribió. 
Se deberá crear un método para escribir en el archivo el texto introducido y 
otro para mostrar el contenido en mayúsculas.
 */

public class MayusMinus {

	static Scanner input = new Scanner(System.in);
	static PrintWriter escritor = null;

	static String rutaArchivo;
	static String texto;

	public static void enMayus() {
		System.out.println(texto.toUpperCase());
	}

	public static void alReves() {
		String retString = "";
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == ' ') {
				retString += c;
			} else if (Character.isUpperCase(c)) {
				retString += Character.toLowerCase(c);
			} else {
				retString += Character.toUpperCase(c);
			}

		}
		System.out.println(retString);
	}

	public static void original() {
		System.out.println(texto);
	}

	public static void escribir() {
		escritor.print(texto);
		escritor.close();
	}

	public static void main(String[] args) {
		System.out.println("Ingrese el nombre del archivo de salida:");
		rutaArchivo = "archivos/" + input.nextLine();
		try {
			escritor = new PrintWriter(new FileWriter(rutaArchivo));
		} catch (IOException e) {
			System.err.println("No se puede escribir el archivo");
		}
		System.out.println("Ingrese el texto deseado");
		texto = input.nextLine();

		enMayus();
		alReves();
		original();
		escribir();

	}

}
