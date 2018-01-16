public class Ejercicio5 {

	static int[] numeros = { 2, 6, 1, 8, 5, 4, 7, 11 };

	public static void main(String[] args) {

		ordenar(numeros);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	static int[] ordenar(int numeros[]) {
		int aux = 0;
		for (int i = 0; i < numeros.length; i++) {
			int posMin = i;
			for (int j = i; j < numeros.length; j++) {
				if (numeros[posMin] > numeros[j]) {
					posMin = j;
				}
			}
			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}
		return numeros;
	}
}