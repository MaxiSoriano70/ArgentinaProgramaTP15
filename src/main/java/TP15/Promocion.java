package TP15;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Promocion {
	private Producto producto;
	private Descuento descuento;
	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;
	
	public Promocion() {
		
	}

	/*public Promocion(Producto producto, Descuento descuento, LocalDateTime fechaDesde, LocalDateTime fechaHasta) {
		super();
		this.producto = producto;
		this.descuento = descuento;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}*/
	
	
}
