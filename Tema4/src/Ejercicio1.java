import java.util.Scanner;
	/*
	 * 1.- Escribe un método que reciba dos parámetros: el nombre de una persona y su edad. Deberá
	mostrar por pantalla la frase "Hola, nombre, no parece que tengas edad años".
	 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Como te llamas?");
		String nombre = entrada.nextLine();
		System.out.println("Y que edad tienes?");
		int edad = entrada.nextInt();
		
		
		nombreEdad(nombre,edad);
	}
	
		 static void nombreEdad(String nombre, int edad) {
	
		System.out.println("Hola " + nombre + " no parece que tengas " + edad +  " tantos años.");

	}

}
