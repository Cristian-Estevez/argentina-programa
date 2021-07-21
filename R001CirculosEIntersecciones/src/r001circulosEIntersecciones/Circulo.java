package r001circulosEIntersecciones;

public class Circulo {
	private Punto centro;
	private double radio;	
	
	public Circulo(Punto cen, double r) {
		if (r <= 0) {
			System.err.println("El valor de radio solo puede ser positivo");
			System.exit(0);
		}
		centro = cen;
		radio = r;
	}
	
	public double getDistanciaPuntos(Circulo c) {
	
		double x1 = this.centro.getCoordX();
		double x2 = c.centro.getCoordX();
		double y1 = this.centro.getCoordY();
		double y2 = c.centro.getCoordY();
		
		double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return dist;
	}
	
	public double getSumaRadios(Circulo c) {
		return (double) (this.radio + c.radio);
	}
		
	public boolean intersectaCon(Circulo c) {
		double distanciaCentros = getDistanciaPuntos(c);
		double sumaRadios = getSumaRadios(c);
		
		if (distanciaCentros > sumaRadios) {
			return false;
		} 
		return true;
	}
	
}

/* FUNDAMENTOS TEORICOS EN: 
 * https://www.geeksforgeeks.org/check-two-given-circles-touch-intersect/
 * https://mathworld.wolfram.com/Circle-CircleIntersection.html
 * http://mimosa.pntic.mec.es/clobo/geoweb/circun3.htm 
*/
