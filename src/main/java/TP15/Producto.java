package TP15;

import lombok.Data;

@Data
public class Producto {
	private String nombre;
	private Neto valor;
	private double precio;
	
	public Producto() {
		
	}
	
	/*public Producto(String nombre, Neto valor, double precio) {
		super();
		this.nombre = nombre;
		this.valor = valor;
		this.precio = precio;
	}*/
}
