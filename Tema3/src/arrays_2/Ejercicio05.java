package arrays_2;

	/*
	 * 5.- Escribe un programa que guarde las siguientes temperaturas en un array y busque su máximo y 
		mínimo. Además deberá indicar en qué posición del array están ese máximo y mínimo
	 */

public class Ejercicio05 {

	public static void main(String[] args) {

		double temperaturas[] = {15,16.1,16,15.4,15,14,10.2,11,11.5,10,10.1,9.8,9,6};
		int posMax = 0;
		int posMin = 0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			if(temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			}
			
			if(temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("El máximo es: " + temperaturas[posMax] + " y la posición es: " + posMax);
		System.out.println("El mínimo es: " + temperaturas[posMin] + " y la posición es: " + posMin);
	}

}
