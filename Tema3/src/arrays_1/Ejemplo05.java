package arrays_1;
	/*
	 * El programa va preguntando la temperatura de una serie de dias
	 * hasta que el usuario indica que hay no hay mas datos.
	 */
import java.util.Scanner;
public class Ejemplo05 {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int SALIR = 500;
		int i = 0;
		float temperaturas[] = new float[100];
		
		while(i < temperaturas.length) {
			System.out.println("Introduce una temperatura");
			temperaturas[i] = entrada.nextFloat();
			if(temperaturas[i] == SALIR) {
				System.out.println("Acabando...");
				break;
			}
			i++;
		}
			i = 0;
		
		while(i < temperaturas.length) {
			System.out.println("\nDato " + (i+1) + " : " + temperaturas[i]);
			i++;
		}
		System.out.println("FIN");
		
			}
}
