package claseteorica2;

public class Rectangulo {

	private int alto, ancho;
	
	public Rectangulo(int al, int an) {
		setAlto(al);
		setAncho(an);
	}
		
	public int getAlto() {
		return alto;
	}
	
	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int obtenerArea() {
		return alto * ancho;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rec = new Rectangulo(5, 2);
		int area = rec.obtenerArea();
		System.out.println(area);
				
	}

}
