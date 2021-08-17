package cuentasbancarias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Registro {

	private double monto;
	private Motivo motivo;
	private Date fechaYHora;
	
	public Registro(double monto, Motivo motivo) {
		this.motivo = motivo;
		this.monto = monto;
		fechaYHora = new Date(System.currentTimeMillis());		
	}
	
	public String getDetallesTransaccion() {
		final SimpleDateFormat formatter = new SimpleDateFormat
				("dd-MM-yyyy '; Hora: 'HH:mm:ss z");
		return ("Transacción realizada: " + 
				this.motivo + "; " + this.monto + 
				"; Fecha: " + (formatter.format(this.fechaYHora)));
	}
}
