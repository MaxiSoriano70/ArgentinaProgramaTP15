package Ejercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Modelo.Alumno;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String regex = "^(([a-zA-Z])+)\\,.* (([a-zA-Z]|[0-9])+\\@[a-zA-Z]+\\.[a-z]+).* ([0-9]+)$";

        final String string = "Maria, es docente, su email es marIa123@gmail.com y su DNI es 31605906";

        

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

        final Matcher matcher = pattern.matcher(string);

        

        while (matcher.find()) {

            System.out.println("Full match: " + matcher.group(0));

            Alumno alumno= new Alumno(matcher.group(1),Integer.parseInt(matcher.group(5)));
            System.out.println(alumno.getNombre()+" "+alumno.getLegajo());

            for (int i = 1; i <= matcher.groupCount(); i++) {

                System.out.println("Group " + i + ": " + matcher.group(i));

            }

        }
	}

}
