package torneodearqueria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LectorDeDatos {
	BufferedReader br;
	HashMap<Integer, ArrayList<Tiro>> tablaDeTirosPorParticipante = new HashMap<>();

	public LectorDeDatos(String rutaArchivo) throws FileNotFoundException {
		br = new BufferedReader(new FileReader(rutaArchivo));
	}

	public HashMap<Integer, ArrayList<Tiro>> obtenerDatos() throws IOException {
		String linea = "";
		ArrayList<Tiro> arrayDeTirosTmp;
		while ((linea = br.readLine()) != null) {
			String[] tmp = linea.split(",");
			int participante = Integer.parseInt(tmp[0]);
			Tiro tiroTmp = new Tiro(Integer.parseInt(tmp[1]) , Integer.parseInt(tmp[2]));
			
			if (tiroTmp.getDistanciaDelCentro() <= 50) {
				if (tablaDeTirosPorParticipante.containsKey(participante)) {
					arrayDeTirosTmp = tablaDeTirosPorParticipante.get(participante);
				} else {
					arrayDeTirosTmp = new ArrayList<Tiro>();
				}
				arrayDeTirosTmp.add(tiroTmp);
				tablaDeTirosPorParticipante.put(participante, arrayDeTirosTmp);
			}
		}		
		br.close();
		return tablaDeTirosPorParticipante;
	}
}
