package Bucles;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Programa que pida un numero, si se acierta el numero se finaliaz si no, se inicia un bucle.

		final int CORRECTO = 3;
		System.out.println("Introduce un numero entre el 1 y el 5");
		int numero = entrada.nextInt();
		
	
		while(numero != CORRECTO){
			System.out.println("Has fallado prueba otra vez.");
			numero = entrada.nextInt();
		}
		while(numero == CORRECTO){
			System.out.println("Has acertado!");
			break;//Escribo break para que el programa pare y no pueda escribir nada mas.
		}
	}

}
