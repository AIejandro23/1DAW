package arrays_2;

public class Ejemplo09Ordenar {

	public static void main(String[] args) {

		int notas[] = {5,2,6,7,5,1};
		
		// Vamos recorriendo el array desde el primer elemento
		// Hasta el penultimo (el ultimo ya no hará falta, sera el máximo)
		
		int posMin;
		int aux; // Tiene que ser del tipo de notas. En este caso int.
		for(int i = 0; i < notas.length-1;i++) {
			
			// La variable posMin guardará el mínimo de array entre i y el final.
			
			posMin = i;
			
			// Buscamos el elemento más pequeño entre i y el final del array.
			for(int j = i+1; j < notas.length;j++) {
				
				// Si encontramos un elemento más pequeño que el de posMin , ahora posMin valdra la nueva posición.
				
				if(notas[j] < notas[posMin]) {
					posMin = j;
				}
			}
				
				// Intercambiamos el elemento en posMin con el elemento en i.
				
				aux = notas[i];
				notas[i] = notas[posMin];
				notas[posMin] = aux;
			}
		
		
		for(int i = 0;i < notas.length;i++) {
			System.out.println(notas[i]);
		}
		
		
		
	}

}
