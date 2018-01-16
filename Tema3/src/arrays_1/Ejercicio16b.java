package arrays_1;
	
	//16.b- Usar solo un bucle for.

import java.util.Scanner;
public class Ejercicio16b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double suma = 0;
		double temperatura[] = {15, 16.1 , 16, 15.4 , 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9,6};
		int calientes = 0;

	
		for(int i = 0 ; i < temperatura.length; i++) {
			suma = suma + temperatura[i];
			if(temperatura[i] > 12) {
				calientes = calientes + 1;
			}
		}
		System.out.println("La media total es = " + suma/temperatura.length);
		System.out.println("Las temperaturas superiores a 12 grados son = " + calientes);
	}

}
