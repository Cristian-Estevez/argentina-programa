package torneodearqueria;

import java.util.Objects;

// 
public class Tiro implements Comparable<Tiro> {
	private int coordX;
	private int coordY;

	public Tiro(int x, int y) {
		this.coordX = x;
		this.coordY = y;
	}

	public double getDistanciaDelCentro() {
		return Math.sqrt(Math.pow(0 - this.coordX, 2) + (Math.pow(0 - this.coordY, 2)));
	}

	public int getPuntajeTiro() {
		int puntaje = 0;
		if (this.getDistanciaDelCentro() <= 10) {
			puntaje = 1000;
		} else if (this.getDistanciaDelCentro() <= 20) {
			puntaje = 500;
		} else if (this.getDistanciaDelCentro() <= 30) {
			puntaje = 200;
		} else if (this.getDistanciaDelCentro() <= 40) {
			puntaje = 100;
		} else if (this.getDistanciaDelCentro() <= 50) {
			puntaje = 50;
		}
		return puntaje;
	}

	@Override
	public String toString() {
		return "Tiro [coordX=" + coordX + ", coordY=" + coordY + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(this.getPuntajeTiro());
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Tiro other = (Tiro) obj;
//		return this.getPuntajeTiro() == other.getPuntajeTiro();
//	}

	@Override
	public int compareTo(Tiro o) {
		int retorno = 0;
		if (this.getDistanciaDelCentro() < o.getDistanciaDelCentro()) {
			retorno = -1;
		} 
		if (this.getDistanciaDelCentro() > o.getDistanciaDelCentro()) {
			retorno = 1;
		}		
		return retorno;
	}
	
	
}
