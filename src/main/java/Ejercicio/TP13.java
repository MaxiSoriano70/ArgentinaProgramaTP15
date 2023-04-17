package Ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TP13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
			
			/*Class.forName("com.mysql.jdbc.Driver");*/
			//Class.forName("com.mysql.cj.jdbc.driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022","root","");
			Statement stmt=con.createStatement(); 
			
			//USO DE LA DB

			System.out.println("conecto");
			
			  
			/*INSERTAR*/
			/*int insertarEmpleado=stmt.executeUpdate("INSERT INTO empleados (`dni`, `nombre`, `apellido`, `nacionalidad`, `idDepartamento`) VALUES (24961478, 'Yesica', 'Sulca', 'Peru', 4)");
			System.out.println(insertarEmpleado + " records affected");*/
			/*TRAER TODOS LOS EMPLEADOS*/
			/*ResultSet tEmpleados=stmt.executeQuery("SELECT dni,nombre,apellido FROM empleados");  
			while(tEmpleados.next())  
			System.out.println(tEmpleados.getInt(1)+"  "+tEmpleados.getString(2)+"  "+tEmpleados.getString(3));*/
			 
			/*ACTUALIZAR*/
			/*int updateEmpleado=stmt.executeUpdate("UPDATE empleados SET nombre = 'Jesica' WHERE idEmpleado = 4");
			System.out.println(updateEmpleado + " records affected");  */
			/*MOSTRAR EMPLEADOS*/
			/*ResultSet tEmpleados=stmt.executeQuery("SELECT dni,nombre,apellido FROM empleados");  
			while(tEmpleados.next())  
			System.out.println(tEmpleados.getInt(1)+"  "+tEmpleados.getString(2)+"  "+tEmpleados.getString(3));*/
			
			/*TRAER DEPARTAMENTOS*/
			/*ResultSet tDepartamentos=stmt.executeQuery("SELECT * FROM departamentos");  
			while(tDepartamentos.next()) {
				if(tDepartamentos.getRow()>0) {
					System.out.println(tDepartamentos.getInt(1)+"  "+tDepartamentos.getString(2)); 
				}
			}*/
			
			/*DELETE*/
			/*int deleteDepartamento=stmt.executeUpdate("DELETE FROM departamentos WHERE idDepartamento=5");
			System.out.println(deleteDepartamento + " records affected");
			ResultSet tDepartamentos=stmt.executeQuery("SELECT * FROM departamentos");  
			while(tDepartamentos.next()) {
				if(tDepartamentos.getRow()>0) {
					System.out.println(tDepartamentos.getInt(1)+"  "+tDepartamentos.getString(2)); 
				}
			}*/
			
			/*EMPLEADOS DE LOGISTICA*/
			/*ResultSet tEmpleadosLogistica=stmt.executeQuery("SELECT e.dni,e.nombre,e.apellido FROM empleados AS e INNER JOIN departamentos AS d ON e.idDepartamento=d.idDepartamento WHERE d.nombre='Logistica'");  
			while(tEmpleadosLogistica.next())  
			System.out.println(tEmpleadosLogistica.getInt(1)+"  "+tEmpleadosLogistica.getString(2)+"  "+tEmpleadosLogistica.getString(3));*/
			
			/*EMPLEADOS ORDENADOS*/
			ResultSet tEmpleadosOrdenados=stmt.executeQuery("SELECT dni,nombre,apellido FROM empleados ORDER BY nombre");  
			while(tEmpleadosOrdenados.next())  
			System.out.println(tEmpleadosOrdenados.getInt(1)+"  "+tEmpleadosOrdenados.getString(2)+"  "+tEmpleadosOrdenados.getString(3));
			
			
			con.close();  

			} catch(Exception e){ System.out.println(e);}  
	}

}
