package Ejercicio;

import java.sql.*;

public class BaseDeDatos {
	public static void main(String[] args) {

		try{  

			/*Class.forName("com.mysql.jdbc.Driver");*/
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022","root","");  
			Statement stmt=con.createStatement(); 
			
			//USO DE LA DB  

			System.out.println("conecto");  
			
			

 
			/*TRAER TODOS LOS EMPLEADOS*/
			//ResultSet rs=stmt.executeQuery("SELECT dni,nombre,apellido FROM empleados where nombre like '%a%'");  
			//while(rs.next())  
			//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

 

			//int result=stmt.executeUpdate("INSERT INTO departamentos (`nombre`) VALUES ('Inforamtica')");
			
			//int result=stmt.executeUpdate("UPDATE departamentos SET nombre = 'Informatica' WHERE idDepartamento = 5");

			//System.out.println(result + " records affected");  
			
			/*TRAER DEPARTAMENTOS*/
			ResultSet rs=stmt.executeQuery("SELECT * FROM departamentos");  
			while(rs.next()) {
				if(rs.getRow()>0) {
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
				}
			}
			
			/*ResultSet rs=stmt.executeQuery("SELECT * FROM departamentos");
			ResultSetMetaData rsmd=rs.getMetaData();
			/*SABER LA CANTIDAD DE CULUMNAS*/
			/*System.out.println(rsmd.getColumnCount());*/
			

 

			con.close();  

			} catch(Exception e){ System.out.println(e);}  

 

	}
}
