package arrays_2;
	/*
	 * Ordenar una array de 10 elementos enteros.
	 */
public class Ejemplo10 {
	public static void main(String[] args) {
		
		int edades[] = {20,55,10,33,90,120,16,22,26,30};
		
		int posMin;
		int aux;
		
		for(int i = 0;i < edades.length-1;i++) {
			
			posMin = i;
			
			for(int j = i+1;j < edades.length;j++) {
				
				if(edades[j] < edades[posMin]) {
					posMin = j;
				}
			}
				
				aux = edades[i];
				edades[i] = edades[posMin];
				edades[posMin] = aux;
				
		}		
		
		for(int i = 0;i < edades.length;i++) {
			System.out.println(edades[i]);
		}
		
	}

}
