
public class CirculosEIntersecciones {

	public class Punto
	{

		public double x = 0, y = 0;

		public Punto(double param_x, double param_y) {
			x = param_x;
			y = param_y;
		}
	}

	public class Circulo
	{

		private double rad, min_rango, max_rango;
		private Punto pto;

		public Circulo(CirculosEIntersecciones.Punto centro, double radio) {
			rad = radio;
			pto = centro;
			min_rango = pto.x - rad;
			max_rango = pto.x + rad;
		}
		
		public boolean intersectaCon(Circulo c2) {
			if ((this.max_rango >= c2.min_rango || c2.min_rango >= this.min_rango)||(this.max_rango <= c2.max_rango || c2.max_rango >= this.min_rango))
				return true;
			else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(c1.intersectaCon(c2));
		
	}

}
