package arrays_2;
	/*
	 * 4.- Diseña un programa que a partir de la siguiente tabla de temperaturas, proveniente del registro
		de un termostato, indique la posición de la primera medida menor que cero. En caso de que no
		hubiera ninguna temperatura negativa, se indicaría un valor de posición de -1.

	 */
public class Practica4_04 {

	public static void main(String[] args) {

		double temperaturas[] = {3.2, 3.5, 7.2, 0.1, 1, -2.3, 5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6};
		final int NO_NEGATIVE = -1;
		
		for (int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i] < 0) {
				System.out.println("La posición de la primera temperatura negativa es " + (i+1));
				break;
			}else if(i == temperaturas.length-1 && temperaturas[i] > 0) {
				System.out.println("La posición de la primera temperatura negativa es " + NO_NEGATIVE);
			}
		}
	}

}
