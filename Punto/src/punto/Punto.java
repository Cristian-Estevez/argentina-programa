package punto;

public class Punto {

	private double x, y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setX(double nuevoX) {
		this.x = nuevoX;
	}
	
	public void setY(double nuevoY) {
		this.y = nuevoY;
	}	
	
	public boolean estaSobreEjeX() {
		return this.y == 0;
	}
	
	public boolean estaSobreEjeY() {
		return this.x == 0;
	}
	
	public boolean esELOrigen() {
		return (this.estaSobreEjeX() && this.estaSobreEjeY());
	}
}

