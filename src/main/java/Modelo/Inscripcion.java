package Modelo;

import java.time.LocalDateTime;
import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Inscripcion {
	private Alumno alumno;
	private Materia materia;
	private LocalDateTime fecha;
	
	public Inscripcion(Alumno alumno, Materia materia) {
		this.alumno = alumno;
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@JsonIgnore
	public boolean isPosibleIncribirse() {
		Iterator<Materia> ite=this.getMateria().getCorrelativas().iterator();
		while(ite.hasNext()) {
			Materia materia=ite.next();
			if(!this.getAlumno().getAprobadas().contains(materia)) {
				return false;
			}
		}
		return true;
	}
}
