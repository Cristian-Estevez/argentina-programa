package referencias;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		this.setRadio(radio);
	}

	public Circulo() {
		this(1.0);
	}
	
	public void setRadio(double r) {
		if (r <= 0) {
			throw new Error("No existen los radios negativos");
		}
		this.radio = r;
	}
	
	public void setDiamtro(double diametro) {
		setRadio(diametro/2);
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.getRadio() * 2;
	}
	
	public double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { //compara las referencias, alojadas en el stack
			return true;
		}
		if (obj == null) {
			return false; //si obj es null no es un objeto del tipo circulo por ende es false
		}
		if (this.getClass() != obj.getClass()) { // si los objetos son de clases diferentes dar false
			return false;
		}
		Circulo other = (Circulo) obj; // casteo el objeto porque a esta altura de los ifss ya se que es del tipo Circulo
		return (Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio));
	}
	
}
