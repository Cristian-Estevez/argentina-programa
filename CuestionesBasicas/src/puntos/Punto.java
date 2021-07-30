package puntos;

import java.util.Objects;

public class Punto implements Cloneable, Comparable<Punto> {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
	
	@Override
	protected Punto clone() throws CloneNotSupportedException {
		return (Punto) super.clone();		
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	public Double getModulo() {
		return Math.sqrt(x * x + y * y); 
	}
	
	@Override
	public int compareTo(Punto otro) {
		
//		Double miModulo = this.getModulo();
//		Double otroModulo = otro.getModulo();
		
//		if (miModulo > otroModulo) {
//			return 1;
//		} else if (miModulo < otroModulo) {
//			return -1;
//		}		
//		return 0;
		
//		return (int) (miModulo - otroModulo);
//		return Double.compare(miModulo, otroModulo);
		
		return getModulo().compareTo(otro.getModulo());
	}

	public Double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	
}
