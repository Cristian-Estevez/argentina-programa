package r001circulosEIntersecciones;

public class Circulo {
	private Punto centro;
	private double radio;	
	
	public Circulo(Punto cen, double r) {
		centro = cen;
		setRadio(r);
	}
	
	private double getDistanciaPuntos(Circulo c) {
	
		double x1 = this.centro.getCoordX();
		double x2 = c.centro.getCoordX();
		double y1 = this.centro.getCoordY();
		double y2 = c.centro.getCoordY();
		
		double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return dist;
	}
	
	private double getSumaRadios(Circulo c) {
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
	
	private void setRadio(double r) {
		if (r <= 0) {
			Error valorInvalido = new Error("Radio debe ser mayor a 0");
			throw valorInvalido;
		}
		this.radio = r;
	}
	
}

/* FUNDAMENTOS TEORICOS EN: 
 * https://www.geeksforgeeks.org/check-two-given-circles-touch-intersect/
 * https://mathworld.wolfram.com/Circle-CircleIntersection.html
 * http://mimosa.pntic.mec.es/clobo/geoweb/circun3.htm 
*/
