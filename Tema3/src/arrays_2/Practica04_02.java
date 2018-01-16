package arrays_2;
	/*
	 * Diseña un programa que calcule el mínimo y el máximo de los valores mencionados. Utiliza un
		array de nombre cotizaciones. Introduce los datos directamente en el código del programa.
	 */
public class Practica04_02 {

	public static void main(String[] args) {

		double valores[] = {47.5, 47.8,48,48.1,47.7,47.3,46,47.9,48.05,48.7};
		
		int posMin = 0;
		int posMax = 0;
		
			for (int j = 0; j < valores.length; j++) {
				if(valores[j] < valores[posMin]) {
					posMin = j; 
				}
				if(valores[j] > valores[posMax]) {
					posMax = j;
				}
				

			
		}
		System.out.println("El mínimo es " + valores[posMin] + " y el máximo es " + valores[posMax]);
		
	}

}
