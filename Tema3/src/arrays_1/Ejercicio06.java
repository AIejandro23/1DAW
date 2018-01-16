package arrays_1;

		/*
		 * 6.- Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.
			Haz que después se muestren todos los valores mediante un bucle for.
		 */
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			float precios[] = new float[10];
			
			for(int i = 0; i < precios.length;i++) {
				System.out.println("Precio nº " + (i+1) + ": ");
				precios[i] = entrada.nextFloat();
			}
		
			for(int i = 0; i < precios.length; i++) {
				System.out.println("Precio nº " + (i+1) + " = " + precios[i]);
			}
			}
}
