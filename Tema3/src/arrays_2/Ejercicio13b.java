package arrays_2;

		/*
		 * Arrays bidimensionales.
		 */
		
public class Ejercicio13b {

	public static void main(String[] args) {

		// Declaración de un array bidimensional de 4 filas x 3 columnas.
		double medidas[][] = {
				
				{8.5,1020,40},
				{14.2,1021,45},
				{11,1022,45},
				{7,1023,50}
		};
		
		// Mostramos las dimensiones del array.
		System.out.println("La tabla tiene " + medidas.length + " filas y " + medidas[0].length + " columnas");
		
		// Mostramos toda la tabla
		System.out.println("Registros metereologicos.");
		System.out.println("==========================");
		
		for(int i = 0;i < medidas.length;i++) {
			System.out.println(medidas[i][0] + "\t" + medidas[i][1] + "\t" + medidas[i][2]);
		}
		
		
	}

}
