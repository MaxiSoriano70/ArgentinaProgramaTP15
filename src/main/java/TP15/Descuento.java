package TP15;

import lombok.Data;

@Data
public class Descuento {
	private String tipo;
	private double cantidad;
	private double tope;
	
	
	public Descuento() {
		
	}
	/*public Descuento(String tipo, double cantidad, double tope) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.tope = tope;
	}*/
	
}
