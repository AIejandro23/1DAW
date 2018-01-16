package Condicionales;
import java.util.Scanner;
public class Condicionales7 {

	public static void main(String[] args) {
		 
		/*
		 * Programa en el que un PIN Secreto está guardado en una constante.
		 * Se le pregunta al usuario ese PIN y si lo escribe correctamente se
		 * le permite el acceso. Si no, se le deniega.
		 */
		final int PIN = 4020;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el pin");
		int clave = entrada.nextInt();
		
		if(PIN == clave){
			
			System.out.println("Adelante!");
		}
		else{
			System.out.println("Error, prueba otra vez.");
		}
		
		
		
	}

}
