import java.util.Scanner;

/*
 * 12.- Desarrolla modularmente (usando tres métodos, además de main( )) un programa que solicite
por consola una lista de números enteros, los ordene y los muestre en pantalla.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[5];
		
		for(int i = 0 ; i < 5; i++) {
		System.out.println("Introduce los siguientes numeros enteros: " + (numeros.length-i));
		numeros[i] = entrada.nextInt();
		}
		
		bucle(numeros);
		devolucion(numeros);
		
		
		
	}
	static void bucle(int numeros[]) {
		
		for (int i = 0; i < numeros.length-1; i++) {
			for (int j = i+1; j < numeros.length; j++) {
				if(numeros[i] > numeros[j]) {
					int aux = numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]= aux;
				}
			}
		}
	}
	
	static void devolucion(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
}
