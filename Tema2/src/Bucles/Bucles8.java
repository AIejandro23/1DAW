package Bucles;
import java.util.Scanner;
		
	/*
	 * Programa que pide 5 notas entre 1 y 10
	 * Si el dato introducido no esta entre 1 y 10 o no es
	 * un numero entero, vuelve a solicitarlo.
	 */


public class Bucles8 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		int nota;
		int i = 1;
		
		System.out.println("Introduzca una nota entera entre 0 y 10");
		//Comprobamos que el dato introducido es un numero entero
		while(i <= 5) {
			System.out.println("Nota" + i + ":");
			

		
			while(entrada.hasNextInt() == false) {
				System.out.println("Nota incorrecta");
				System.out.println("Vuelva a intentarlo");

				entrada.next();
		}
			nota = entrada.nextInt();
			//Comprobamos que el numero esta entre 0 y 10.
			
			while(nota <0 || nota > 10) {
				System.out.println("Nota incorrecta");
				System.out.println("Vuelva a intentarlo");
				
				nota = entrada.nextInt();
			
		
			}
			entrada.nextLine();
			i++;
		}

}
}

