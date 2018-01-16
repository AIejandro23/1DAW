package arrays_2;

import java.util.Scanner;

public class Ejemplo12Cadenas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		// Leemos una variable String x consola y la clase length nos dirá el tamaño del String
		

		System.out.println("Introduce una frase");
		String frase = entrada.nextLine();
		
		System.out.println("Tu frase tiene: " + frase.length());
		
		// Ejemplo con charAt, te indica la posicion de un caracter.
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(frase.charAt(i));

		}
	}

}
