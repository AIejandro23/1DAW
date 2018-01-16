package arrays_1;
	
	/*
	 * Programa que pide un número natural al usuario y le dice
	 * si es primo o no.
	 */
import java.util.Scanner;
public class Ejemplo08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean esPrimo = true;
		
		int numero = 0;
		int i = 2;
		
		System.out.println("Introduce un numero");
		numero = entrada.nextInt();

		while(i < numero) {
			
			// Si una division da distinto de cero, no es primo.
			if(numero % i == 0) {
				esPrimo = false;
				break;
			}
			
			i++;
		}
			if(esPrimo) {
				System.out.println("Es primo");
			}else {
				System.out.println("No es primo");
			}
		
			}
}
