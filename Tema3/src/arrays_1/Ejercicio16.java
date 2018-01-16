package arrays_1;
	
	//16.- Añade al programa anterior la función de calcular cuántas temperaturas ha habido por encima de 12ºC

import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double suma = 0;
		int i = 0;
		double temperatura[] = {15, 16.1 , 16, 15.4 , 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9,6};
		double calientes = 0;

	
	while(i < temperatura.length) {
		suma = suma + temperatura[i];
		i++;
	
	}
		i = 0;
		
		while(i < temperatura.length) {
			if(temperatura[i] > 12) {
				calientes = calientes + 1;
				
			}
			i++;
		}
	
		System.out.println("La media es = " + (suma/temperatura.length));
		System.out.println("Las temperaturas superiores a 12 grados son = " + calientes );
	}

}
