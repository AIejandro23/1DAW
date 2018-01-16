package Bucles;
import java.util.Scanner;
public class Bucles7 {
	/*
	 * Ejemplo en que pedimos al usuario un dato continuamente
	 * hasta que el dato sea del tipo correcto
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un numero entero");
		//Queremos leer un entero
		while(entrada.hasNextInt() == false) {
			System.out.println("Dato incorrecto");
			entrada.nextLine();//Vaciamos el dato de entrada y por tanto podemos volver a escribir la respuesta
		}
			
		
		
			}
}
