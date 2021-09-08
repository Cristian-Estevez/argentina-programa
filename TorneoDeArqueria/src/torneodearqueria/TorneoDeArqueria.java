package torneodearqueria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TorneoDeArqueria {

	public static void main(String[] args) {
		LectorDeDatos ldt = null;
		String rutaArchivoCsv = "archivos/1000tiros.csv";
		HashMap<Integer, ArrayList<Tiro>> datos = null;
		HashMap<Integer, Integer> resultados = new HashMap<Integer, Integer>();

		try {
			ldt = new LectorDeDatos(rutaArchivoCsv);
		} catch (FileNotFoundException e) {
			System.err.println("No se encontró el archivo [" + rutaArchivoCsv + "].");
		}

		try {
			datos = ldt.obtenerDatos();
		} catch (IOException e) {
			System.err.println("Algo sucedió al leer las lineas del archivo [" + rutaArchivoCsv + "].");
		}

		ArrayList<Tiro> tiros;

		for (Entry<Integer, ArrayList<Tiro>> cadaParticipante : datos.entrySet()) {
			tiros = cadaParticipante.getValue();
			int participante = cadaParticipante.getKey();
			int puntajeFinal = 0;
			if (tiros.size() >= 5) {
				Collections.sort((List<Tiro>) tiros);
				for (int i = 0; i < 5; i++) {
					puntajeFinal += tiros.get(i).getPuntajeTiro();
				}
				resultados.put(participante, puntajeFinal);
			}
		}

		ArrayList<Integer> primerPuesto = new ArrayList<Integer>(), segundoPuesto = new ArrayList<Integer>(),
				tercerPuesto = new ArrayList<Integer>();
		int resultadoOro = 0, resultadoPlata = 0, resultadoBronce = 0;
		for (Entry<Integer, Integer> unResultado : resultados.entrySet()) {
			if (unResultado.getValue() > resultadoOro) {
				resultadoOro = unResultado.getValue();
				tercerPuesto = segundoPuesto;
				segundoPuesto = primerPuesto;
				primerPuesto = new ArrayList<Integer>();
				primerPuesto.add(unResultado.getKey());
			} else if (unResultado.getValue() == resultadoOro) {
				primerPuesto.add(unResultado.getKey());
			} else if (unResultado.getValue() > resultadoPlata) {
				resultadoPlata = unResultado.getValue();
				tercerPuesto = segundoPuesto;
				segundoPuesto = new ArrayList<Integer>();
				segundoPuesto.add(unResultado.getKey());
			} else if (unResultado.getValue() == resultadoPlata) {
				segundoPuesto.add(unResultado.getKey());
			} else if (unResultado.getValue() > resultadoBronce) {
				resultadoBronce = unResultado.getValue();
				tercerPuesto = new ArrayList<Integer>();
				tercerPuesto.add(unResultado.getKey());
			} else if (unResultado.getValue() == resultadoBronce) {
				tercerPuesto.add(unResultado.getKey());
			}
		}

		System.out.println("1º Puesto : " + resultadoOro + " participantes: " + primerPuesto);
		System.out.println("2º Puesto: " + resultadoPlata + " participantes: "  + segundoPuesto);
		System.out.println("3º Puesto: " + resultadoBronce + " participantes: "  + tercerPuesto);
	}

}
