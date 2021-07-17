package r001circulosEIntersecciones;

public class Circulo {
	private Punto centro;
	private double radio;
	private double xMax, xMin, yMax, yMin;
	
	
	public Circulo(Punto cen, double r) {
		centro = cen;
		radio = r;
		xMax = centro.getCoordX() + r;
		xMin = centro.getCoordX() - r;
		yMax = centro.getCoordY() + r;
		yMin = centro.getCoordY() - r;
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
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(c1.intersectaCon(c2)); // true
	}
}
