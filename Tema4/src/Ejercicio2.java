import java.util.Scanner;
	/*
	 * 2.- Modifica el programa anterior para que en lugar de escribir nada en pantalla, devuelva el String
			"Hola, nombre, no parece que tengas edad años".
	 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Como te llamas?");
		String nombre = entrada.nextLine();
		
		System.out.println("Y que edad tienes?");
		int edad = entrada.nextInt();
		
		System.out.println(nombreEdad(nombre,edad));
	}
	
		 static String nombreEdad(String nombre, int edad) {
	
		String nombreEdad = "Hola " + nombre + " no parece que tengas " + edad +  " tantos años.";
		
		return (nombreEdad);

	}

}
