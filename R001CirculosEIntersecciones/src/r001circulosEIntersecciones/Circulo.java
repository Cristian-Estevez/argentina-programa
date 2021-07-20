package r001circulosEIntersecciones;

public class Circulo {
	private Punto centro;
	private double radio;
	private double xMax, xMin, yMax, yMin;
	
	
	public Circulo(Punto cen, double r) {
		centro = cen;
		radio = r;
		xMax = centro.getCoordX() + radio;
		xMin = centro.getCoordX() - radio;
		yMax = centro.getCoordY() + radio;
		yMin = centro.getCoordY() - radio;
	}
	
	public boolean intersectanEnX(Circulo c) {
		if((this.xMax > c.xMin && this.xMax < c.xMax) || 
				(this.xMin > c.xMin && this.xMin < c.xMax)) {
			return true;
		} 		
		return false;
	}
	
	public boolean intersectanEnY(Circulo c) {
		if((this.yMax < c.yMax && this.yMax > c.yMin) ||
				this.yMin > c.yMin && this.yMin < c.yMax) {
			return true;
		}
		return false;
	}
	
	public boolean intersectaCon(Circulo c) {
		boolean enX = intersectanEnX(c);
		boolean enY = intersectanEnY(c);
		System.out.println(enX + "\n" + enY);
		if (enX || enY) {
			return true;
		} 	
		
		return false;
	}
	
	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(0, 0), 100.5);
		Circulo c2 = new Circulo(new Punto(0, 0), 0.5);
		System.out.println(c1.intersectaCon(c2)); // true
	}
}
