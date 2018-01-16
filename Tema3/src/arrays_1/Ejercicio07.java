package arrays_1;
		/*
		 * 7.- Crea un array de 10 elementos de tipo double llamado notas 
		 * 		Ve leyendo las diez notas desde la consola, mediante un bucle while
				y guardándolas en el array. A continuación, muestra las diez notas.
		 */
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double notas[] = new double[10];
		
		int i = 0;
		
		
		while(i < notas.length) {
			System.out.println("Introduce la nota nº " + (i+1));
			notas[i] = entrada.nextDouble();		
			i++;
		}
		
		i = 0;
		
		while(i < notas.length) {
			System.out.println("Nota nº " + (i+1) + " = " + notas[i]);
			i++;
		}
		
			}
}
