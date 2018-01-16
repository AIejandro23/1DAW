package arrays_2;
	
	/*
	 * Encontrar el minimo y el máximo de un array.
	 */

public class Ejemplo07 {

	public static void main(String[] args) {

		// Vamos a encontar el mínimo y el máximo del array.
		
		int notas[] = {7,5,10,8,3,1};
		
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			//Si el elemento i es mas pequeño que el de posMin
			// ahora posMin valdrá i.
			
			if(notas[i] < notas[posMin]) {
				posMin = i;
			}
			// SI es el elemento i es más grande que el de posMax
			// ahora posMax valdrá i.
			
			if(notas[i] > notas[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("La posición donde está el maximo es: " + posMax);
		System.out.println("La nota máxima es: " + notas[posMax]);
 		System.out.println("--------------------------------------");
		System.out.println("La posicion donde está el minimo es: " + posMin);
		System.out.println("La nota minima es: " + notas[posMin]);
	}

}
