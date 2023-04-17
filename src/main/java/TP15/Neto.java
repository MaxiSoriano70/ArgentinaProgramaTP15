package TP15;

import lombok.Data;

@Data
public class Neto {
	private double valor;
	private String tipoMedida;
	
	public Neto() {
		
	}
	
	/*public Neto(double valor, String tipoMedida) {
		super();
		this.valor = valor;
		this.tipoMedida = tipoMedida;
	}*/
}
