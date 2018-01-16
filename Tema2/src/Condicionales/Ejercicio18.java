package Condicionales;
import java.util.Scanner;
public class Ejercicio18 {
	
	/* Crea un programa que pida un número entero por teclado, entre 1 y 10. 
	 * Si el usuario escribe un número entero, se escribirá su valor en pantalla. 
	 * Si lo que escribe no es un entero, se mostará un mensaje de error.
	*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int entero = 0;
		
		System.out.println("Introduce un numero entero");
		entero = entrada.nextInt();
		
		if(entero < 10 && entero > 0) {
			System.out.println("Todo en orden");
		}
		else {
			System.out.println("Error, esto no es un numero entero");
		}
		
	}

}
