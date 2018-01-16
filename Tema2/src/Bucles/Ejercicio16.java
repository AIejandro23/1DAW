package Bucles;

	/*
	 * 16.- Crea un programa que muestre las diez primeras 
	 * 		potencias del número 2 (o sea, 2, 4, 8, 16, etc.).
	 */
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Potencias del número 2 :");

		int potencia = 2;
		for(int i = 2;i<=10;i++) {
			
			System.out.println(potencia);
			potencia = potencia * 2;
		}
		
			}
}
