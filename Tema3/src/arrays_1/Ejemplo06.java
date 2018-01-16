package arrays_1;
import java.util.Scanner;
public class Ejemplo06 {

	public static void main(String[] args) {		

		Scanner entrada = new Scanner(System.in);

		System.out.println("Número? ");
		int candidato = entrada.nextInt();

		/*
		 * Iremos dividiendo el número entre todos los enteros entre 2 y él
		 * mismo menos 1.
		 */
		
		boolean esPrimo = true;
		
		int i = 2;
		while (i < candidato) {

			// Si una división da distinto de cero, no es primo.
			if (candidato % i == 0) {
				esPrimo = false;
				break;
			}

			i++;

		}

		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		
			}
}
