package Bucles;
import java.util.Scanner;
public class Bucles18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		
		int i = 1; //Contador de nº de pregunta.
		while(i <= 5) {
			System.out.println("Ingresa tu nota numero " + i);
			nota = entrada.nextInt();
			
			while(nota <0 || nota > 10) {
				System.out.println("Has ingresado  mal una nota");
				nota = entrada.nextInt();
			}
			i++;
		}
		System.out.println("Tus notas son correctas");
	}
}
