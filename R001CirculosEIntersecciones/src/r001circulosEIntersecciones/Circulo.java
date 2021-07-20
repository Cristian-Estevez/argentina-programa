package r001circulosEIntersecciones;

public class Circulo {
	private Punto centro;
	private double radio;	
	
	public Circulo(Punto cen, double r) {
		centro = cen;
		radio = r;
	}
	
	public double getDistanciaPuntos(Circulo c) {
		double dist = 0;
		double xDeA, xDeB, yDeA, yDeB;
		xDeA = this.centro.getCoordX();
		xDeB = c.centro.getCoordX();
		yDeA = this.centro.getCoordY();
		yDeB = c.centro.getCoordY();
		
		dist = Math.sqrt((xDeA - xDeB) * (xDeA - xDeB) + (yDeA - yDeB) * (yDeA - yDeB));
		// System.out.println(dist); for debug
		return dist;
	}
	
	public double getSumaRadios(Circulo c) {
		double sumaRadios;
		sumaRadios = this.radio + c.radio;
		// System.out.println(sumaRadios); for debug
		return sumaRadios;
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
