package Bucles;

	/* 13 - Crea un programa que pida un número y escriba
	 *  la tabla de multiplicar de ese número.
	 */

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		double numero = entrada.nextDouble();
		
		for(int i=1;i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		
		
			}
}
