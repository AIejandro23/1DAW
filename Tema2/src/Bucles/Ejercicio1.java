package Bucles;

import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 1;
		
				System.out.println("Introduzca una palabra");
		String palabra = entrada.next();
		
		while(i <=100){
			System.out.println(palabra);
			i = 1 + i;

		}

	}

}
