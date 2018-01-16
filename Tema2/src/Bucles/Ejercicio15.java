package Bucles;

	/*
	 * 15.- Crea un programa que solicite al usuario los precios de
	 * 		cuatro objetos y devuelva el precio total.
	 */
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precio;
		double total = 0;

		
		for(int i = 1;i<5;i++) {
			System.out.println(i + "º " + "Precio:");
			precio = entrada.nextDouble();
			total = precio + total;

			
		}
		
		System.out.println("EL precio total es de " + total + "$");

			}
}
