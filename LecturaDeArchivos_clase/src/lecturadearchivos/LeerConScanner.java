package lecturadearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LeerConScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		String myPath = "/home/cristian/Desktop/prog/cursos/java/argentina_programa/LecturaDeArchivos_clase/";
		
		Scanner sc = new Scanner(new File(myPath + "datos.in"));
		sc.useLocale(Locale.ENGLISH);
		double[] vec= new double[sc.nextInt()];
		
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextDouble();
			System.out.println(vec[i]);
		}
		
		sc.close();
		
	}

}
