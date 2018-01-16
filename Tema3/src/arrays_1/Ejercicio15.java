package arrays_1;
	/*
	 * 15.- Crea un programa que declare un array con las siguientes temperaturas de las últimas dos 
		semanas y devuelva la temperatura media:

	 */
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double suma = 0;
		int i = 0;
		double temperatura[] = {15, 16.1 , 16, 15.4 , 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9,6};
		

	
	while(i < temperatura.length) {
		suma = suma + temperatura[i];
		i++;
	
	}
	
		System.out.println("La media es = " + (suma/temperatura.length));
	}

}
