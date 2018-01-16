package arrays_1;
		/*
		 * 14.- Escribe un programa que rellene un array llamado primos con los 100 primeros números 3
			primos. Recuerda que un número entero es primo si no puede dividirse por ninguno que no sea 1 o 
			él mismo. Los primeros números primos son:  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, .
		 */
public class Ejercicio14 {

	public static void main(String[] args) {
		int numPrimos = 0; // Número de primos
		int candidato = 2; // Candidato a ser nº primo
		int i = 2; // Contador de nºs por los que
					// vamos dividiendo.
		boolean esPrimo = true;

		while (numPrimos < 100) {

			System.out.println("candidato = " + candidato);
			System.out.println("Comprobamos si es primo...");
			// Para cada valor de candidato compruebo si es primo.
			i = 2;
			esPrimo = true;
			while (i < candidato) {
				if (candidato % i == 0) {
					System.out
							.println("No es primo porque se puede dividr por "
									+ i);
					esPrimo = false;
					break;
				}

				i++;
			}

			// Si candidato es primo lo mostramos en pantalla y
			// aumentamos el contador numPrimos.
			if (esPrimo) {

				System.out.println(candidato);
				numPrimos++;
				System.out.println("Es primo. Ya llevamos " + numPrimos
						+ " primos.");
			}

			// Aumentamos candidato en 1.
			candidato++;

}
		
	
		

	}

}
