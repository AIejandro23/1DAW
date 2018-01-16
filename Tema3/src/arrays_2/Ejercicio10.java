package arrays_2;
		/*
		 * 10.- Escribe un programa que pregunte las temperaturas de las últimas ocho horas y las muestre 
			ordenadas de menor a mayor, usando el método de selección. Al final también indicará la 
			temperatura menor y la mayor.
		 */
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double temperaturas[] = new double[8];
		int posMin;
		double aux;
		
		for(int i = 0; i < temperaturas.length;i++) {
			System.out.println("Introduce la temperatura de la " + (i+1) + " hora");
			temperaturas[i] = entrada.nextDouble();
			
		}
		
		for(int i  = 0; i < temperaturas.length-1;i++) {
			
			posMin = i;
			
			for(int j = i+1;j < temperaturas.length;j++) {
				if(temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}
			}
			
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;
			
		}
		
		for(int i  = 0;i < temperaturas.length;i++) {
			System.out.println(temperaturas[i]);

			
		}
		System.out.println("La temperatura menor es = " + temperaturas[0]);
		System.out.println("La temperatura mayor es = " + temperaturas[7]);
	}

}
