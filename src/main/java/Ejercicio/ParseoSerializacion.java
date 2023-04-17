package Ejercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;

public class ParseoSerializacion {
	public static void main(String[] args) {

		// SERIEALIZACION COMUN
		ObjectMapper objectMapper = new ObjectMapper();
		// Serializacion
		/*Materia mat = new Materia();
		mat.setNombre("Lab1");
		mat.setCodigo(1);
		try {
			String jsonText;
			jsonText = objectMapper.writeValueAsString(mat);
			System.out.println(jsonText);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// Parseo
		/*String json = "{\"nombre\":\"Lab2\",\"codigo\":2,\"correlativas\":[]}";
		try {
			Materia materia2 = objectMapper.readValue(json, Materia.class);
			System.out.println(materia2);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// Parseo a Map
		/*String json2 = "{\"nombre\":\"Lab1\",\"codigo\":1,\"correlativas\":[]}";
		try {
			Map<String, Object> map = objectMapper.readValue(json2, new TypeReference<Map<String, Object>>() {
			});
			System.out.println(map);
			System.out.println(map.size());
			System.out.println(map.get("nombre"));
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Serializacion compleja
		Alumno alumno = new Alumno();
		alumno.setNombre("Soledad");
		alumno.setLegajo(1615);
		Materia mat = new Materia();
		mat.setNombre("Lab1");
		mat.setCodigo(1);
		Inscripcion inc = new Inscripcion(alumno, mat);
		try {
			String jsonText = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inc);
			System.out.println(jsonText);
			//ESCRIBIMOS EN UN JSON
			try {
				Files.writeString(Paths.get("src\\main\\java\\Archivo\\pruebaSerializacionII.json"), jsonText);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Desde la lectura de un archivo
		/*String path = "src\\main\\java\\Archivo\\pruebaSerializacion.json";
		File reader = new File(path);
		try {
			Materia materia2 = objectMapper.readValue(reader, Materia.class);
			System.out.println(materia2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
}
