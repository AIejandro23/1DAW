package Bucles;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		/*  Ampl�a la aplicaci�n anterior para que a medida que se van introduciendo las notas se vayan sumando
		 *  (en una variable llamada suma). Al final, devolver� la nota media de esas notas.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		float nota = 0;
		float suma = 0;
		float media;

		int i = 1; //Contador de n� de pregunta.
		while(i <= 5) {
			System.out.println("Ingresa tu nota numero " + i);
			nota = entrada.nextFloat();
			
			while(nota <0 || nota > 10) {
				System.out.println("Has ingresado  mal una nota");
				nota = entrada.nextFloat();

				
			}
			i++;
			suma = suma + nota; //Pones una nota y se le suma a la variable 0 y se guarda en suma, y asi continuamente con las siguientes notas.
				
		}
		media = suma/5;
		System.out.println("Tus notas son correctas");
		System.out.println("Tu media es de: " + media);

	}

}
