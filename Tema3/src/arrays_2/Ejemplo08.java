package arrays_2;

	/*
	 * Ejercicio: Encuentra el mínimo y el máximo del siguiente array:
	 */
public class Ejemplo08 {

	public static void main(String[] args) {

		double pesos[] = {70.4, 76.5, 80, 67, 71, 73};
		int posMin = 0;
		int posMax = 0;
		
		for(int i = 0;i < pesos.length;i++) {
			
			if(pesos[i] < pesos[posMin]) {
				posMin = i;
			}
			
			if(pesos[i] > pesos[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("El peso minimo es: " + pesos[posMin]);
		System.out.println("El peso máximo es: " + pesos[posMax]);
	}

}
