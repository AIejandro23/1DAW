package arrays_2;
	/*
	 * Programa que lee 5 temperaturas de cada dia durante 7 días.
	 */
import java.util.Scanner;
public class Ejemplo11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float temperaturas[][] = new float[2][6];

		
		// Leemos cada fila de la tabla.
		for(int i = 0; i < temperaturas.length;i++) {
			System.out.println("Día " + i + ": ");
			
			//Leemos las 6 temperaturas de cada fila.
			for(int j = 0;j < temperaturas[0].length;j++) {
				System.out.println("Temperaturas " + j + ": ");
				temperaturas[i][j] = entrada.nextFloat();
				
			}
			
		}
		
		
		
	}

}
