package maquinasDeCafe;

public abstract class MaquinaDeCafe {
	
	private int gramosDeCafe;
	private static final int GRAMOS_POR_CAFE = 10;
	private final static int CANTIDAD_INICIAL_DE_CAFE = 1000;
	
	public MaquinaDeCafe() {
		gramosDeCafe = CANTIDAD_INICIAL_DE_CAFE;
	}
	
	public VasoDeCafe servirCafe() {
		if (this.puedeServir()) {
			this.restarCafe();
			return new VasoDeCafe(true);
		}
		return new VasoDeCafe(false);
	}
	
	protected void restarCafe() {
		gramosDeCafe -= GRAMOS_POR_CAFE;
	}
	
	protected boolean puedeServir() {
		return gramosDeCafe >= GRAMOS_POR_CAFE;
	}
	
	public int getGramosDeCafe() {
		return gramosDeCafe;
	}
}
