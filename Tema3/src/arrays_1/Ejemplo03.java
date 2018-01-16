package arrays_1;

public class Ejemplo03 {

	public static void main(String[] args) {
		
			// Ejemplos de mostrar los elementos de un array mediante bucle.
		
		float temperaturas[] = {20,22,20,19,17,17,15,15,16};

		String compañeros[] = {"Ramon","Benjamin","Pablo","Ankush"};

		
		for(int i = 0;i < temperaturas.length ; i++) {
			System.out.println("Temperatura nº " + (i+1) + ": " + temperaturas[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < compañeros.length ; i++) {
			System.out.println("Nombre nº " + (i+1) + ": " + compañeros[i]);
		}
	}

}
