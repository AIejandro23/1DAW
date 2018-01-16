package arrays_1;

public class Ejemplo01 {

	public static void main(String[] args) {

			//Declarar un array de temperaturas
		
		float temperaturas[] = {20,22,20,19,17,17,15,15,16};
		
		// Los corchetes se pueden poner justo después del tipo
		
		float[] temperaturas2 = {20,22,20,19,17,17,15,15,16};
	
		// Otro ejemplo con Strings.
		
		String compañeros[] = {"Ramon","Benjamin","Pablo","Ankush"};
		
		// El tamaño se indica con (nombre de la array).length
		
		System.out.println("El array temperaturas tiene el tamaño: " + temperaturas.length);
		
		System.out.println("El array compañeros tiene el tamaño: " + compañeros.length);
		
		// Mostramos los valores de algunas posiciones de estos arrays.
		
		System.out.println("El primer elemento del array temperaturas es : " + temperaturas[0]);
		
		System.out.println("El ultimo elemento del array temperaturas es : " + temperaturas[8]);
		
		System.out.println("El primer elemento del array compañeros es : " + compañeros[0]);
		
		System.out.println("El ultimo elemento del array compañeros es : " + compañeros[3]);
	}

}
