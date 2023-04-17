package Modelo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Materia {
	private String nombre;
	private int codigo;
	@JsonIgnore
	private List<Materia> correlativas;
	
	public Materia() {
	}

	public Materia(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.correlativas = new ArrayList<Materia>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(List<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	
	public boolean poseeCorrelativas() {
		if(this.getCorrelativas().size()>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", correlativas=" + correlativas + "]";
	}
	
	
	
}
