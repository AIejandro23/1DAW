package Bucles;

	/*20.- Concurso. El programa preguntará continuamente el número secreto (que es 6, evidentemente). 
	 * En el momento en que el usuario acierte, se escribirá el mensaje "Felicidades" y terminará el programa. 
	 * Si el usuario agota sus 10 posibilidades, el mensaje que verá es "Has perdido"
	 */
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean adivina = false;
		int numero;
		int i = 1;
		
		do {
			System.out.println("Adivina el numero secreto!! ");
			numero = entrada.nextInt();
			if (numero == 6) {
				System.out.println("Felicidades XD");
				adivina = true;
				break; 
			}
			System.out.println("Te queda " + (10 - i) + " opurtunidades");
			i++;
		} while (adivina == false && i <= 10);

		if (numero != 6) {
			System.out.println("Has perdido :(");
		}

	}

}