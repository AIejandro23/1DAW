package Condicionales;
import java.util.Scanner;
public class Ejercicio19 {
	
	/* Modifica el programa anterior para que si además el número introducido es el 3, 
	 * se informe al usuario de que lo ha acertado.
	*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int entero = 0;
		
		System.out.println("Introduce un numero entero");
		entero = entrada.nextInt();
		
		if(entrada.hasNextInt()) {
			System.out.println("Error, esto no es un numero entero");
		}
		else {
				System.out.println("Has acertado");
			}


		
	}

}
