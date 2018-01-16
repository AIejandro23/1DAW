package Bucles;
import java.util.Scanner;
public class Bucles12 {
	
	/* Ejemplo de uso de variable semáforo.
	 * Programa que solicita al usuario un número y si éste
	 * es 7 entonces le dice que ha acertado, y si no le vuelve
	 * a preguntar.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean adivinado = false;
		int numero;
		
		do {
		System.out.println("Adivina el número secreto!!!");
		numero = entrada.nextInt();
		
		if(numero == 7) {
			adivinado = true;
		}
			
		}while(adivinado == false);
		
		System.out.println("Felicidades!!!");

}
}