package arrays_2;
	/*
	 * 1.- En una biblioteca pública necesitan un programa para ir rellenando las fichas de los libros. Los 
		datos a guardar de cada libro son: ISBN, título, autor y editorial.
		Crea un programa que pida por consola 5 registros con los datos anteriores y los guarde en un array
		llamado libros. Después de introducidos, deberá listar en pantalla los datos con el formato:
		
		ISBN Título Autor Editorial

	 */
import java.util.Scanner;
public class Practica4_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String libros[][] = new String[5][4];
	
		for (int i = 0; i < libros.length; i++) {
			System.out.println("Introduce el ISBN");
			libros[i][0] = entrada.nextLine();
			
			System.out.println("Introduce el título");
			libros[i][1] = entrada.nextLine();
			
			System.out.println("Introduce el autor");
			libros[i][2] = entrada.nextLine();
			
			System.out.println("Introduce el editorial");
			libros[i][3] = entrada.nextLine();
		}
		
		for (int i = 0; i < libros.length; i++) {
			System.out.println("ISBN\t TITULO\t AUTOR\t EDITORIAL");
			System.out.println(libros[i][0] + "\t" + libros[i][1] + "\t" + libros[i][2]  + "\t" + libros[i][3] );

		}
		
	}

}
