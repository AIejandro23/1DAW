package arrays_1;
	/*
	 * 9.- Escribe un programa que lea desde la consola el enunciado de una pregunta y las cuatro posibles
		respuestas, guardando los cinco valores en un array llamado test. A continuación los mostrará cómo
		si fuera una pregunta de tipo test. Por ejemplo:
			¿Quién creó el Altair 8800, el primer ordenador personal?
			a) Bill Gates
			b) Steve Jobs
			c) Ed Roberts
			d) Gary Kildall

	 */
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String test[] = new String[5];
		
		System.out.println("EScriba una pregunta y sus cuatro respuestas.");
		
		for(int i = 0; i < test.length ; i++) {
			test[i] = entrada.nextLine();
		}
		
		System.out.println(test[0]);
		
		char letra = 'a';
		
		for(int i = 1; i < test.length ; i++) {
			System.out.println(letra + ") " + test[i]);
			letra++;
		}

			
	}

}
