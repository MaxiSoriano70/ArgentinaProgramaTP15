package Ejercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Modelo.Alumno;

public class Tp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("src\\main\\java\\Archivo\\expresionesTP14.txt");
        try {
        	final String regex = "^(([a-zA-Z])+)\\,.* (([a-zA-Z]|[0-9])+\\@[a-zA-Z]+\\.[a-z]+).* ([0-9]+)$";
            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                final Matcher matcher = pattern.matcher(linea);
                while (matcher.find()) {
                    System.out.println("Full match: " + matcher.group(0));
                    Alumno alumno= new Alumno(matcher.group(1),Integer.parseInt(matcher.group(5)));
                    System.out.println(alumno.getNombre()+" "+alumno.getLegajo());
                    for (int i = 1; i <= matcher.groupCount(); i++) {
                        System.out.println("Group " + i + ": " + matcher.group(i));
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }        
	}
}
