package Bucles;
import java.util.Scanner;
public class Bucles5 {

	public static void main(String[] args) {
		/*
		 * Programa que muestra las tablas de multiplicar de un
		 * numero indicado por el usuario.
		 */
		Scanner entrada = new Scanner(System.in);
		int i = 1;
		
		System.out.println("Introduce un numero del 1 al 10");
		int numero = entrada.nextInt();
		
		while(i <= 10){
			System.out.println(numero + " x " + i + " = " + (i * numero));
			i = 1 + i;
		}
				
	}

}
