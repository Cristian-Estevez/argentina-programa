package maquinasDeCafe;

public class MaquinaEstafadora extends MaquinaPremium{

	private boolean yaEstafe = true;
	
	@Override
	public VasoDeCafe servirCafe() {
		if (yaEstafe) {
			yaEstafe = false;
			return super.servirCafe();
		} else {
			yaEstafe = true;
			return new VasoDeCafe(false);
		}
	}
}
