package Modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class IncripcionesTest {

	@Test
	public void testFalseIsPosibleInscribirsePorMateriaCorrelativa() {
		Alumno alumno1=new Alumno("Celste Severich",1615);
		Materia mat1=new Materia("Programacion I",1);
		Materia mat2=new Materia("Programacion II",2);
		mat2.getCorrelativas().add(mat1);
		Inscripcion inc=new Inscripcion(alumno1,mat2);
		
		boolean resultado=inc.isPosibleIncribirse();
		
		assertFalse(resultado);
	}
	
	@Test
	public void testTrueIsPosibleInscribirsePorMateriaCorrelativa() {
		Alumno alumno1=new Alumno("Celste Severich",1615);
		Materia mat1=new Materia("Programacion I",1);
		Materia mat2=new Materia("Programacion II",2);
		mat2.getCorrelativas().add(mat1);
		Inscripcion inc=new Inscripcion(alumno1,mat1);
		
		boolean resultado=inc.isPosibleIncribirse();
		
		assertTrue(resultado);
	}
	
	@Test
	public void testFalseIsPosibleInscribirse() {
		Alumno alumno1=new Alumno("Celste Severich",1615);
		
		Materia mat1=new Materia("Programacion I",1);
		Materia mat2=new Materia("Programacion II",2);
		mat2.getCorrelativas().add(mat1);
		Materia mat3=new Materia("Programacion III",3);
		mat3.getCorrelativas().add(mat2);
		alumno1.getAprobadas().add(mat1);
		Inscripcion inc=new Inscripcion(alumno1,mat3);
		
		boolean resultado=inc.isPosibleIncribirse();
		
		assertFalse(resultado);
	}

}
