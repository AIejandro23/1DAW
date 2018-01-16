package arrays_2;

		/*
		 * Arrays bidimensionales.
		 */
		
public class Ejercicio13 {

	public static void main(String[] args) {

		// Declaración de un array bidimensional de 4 filas x 3 columnas.
		double medidas[][] = new double[4][3]; 		
		
		// Valores de la primera columna.
		medidas[0][0] = 8.5;
		medidas[1][0] = 14.2;
		medidas[2][0] = 11;
		medidas[3][0] = 7;
		
		// Valores de la segunda columna.
		medidas[0][1] = 1020;
		medidas[1][1] = 1021;
		medidas[2][1] = 1022;
		medidas[3][1] = 1023;
		
		// Valores de la tercera columna.
		
		medidas[0][2] = 40;
		medidas[1][2] = 35;
		medidas[2][2] = 45;
		medidas[3][2] = 50;
		
		// Mostramos toda la tabla
		System.out.println("Registros metereologicos.");
		System.out.println("==========================");
		
		for(int i = 0;i < 4;i++) {
			System.out.println(medidas[i][0] + "\t" + medidas[i][1] + "\t" + medidas[i][2]);
		}
		
		
	}

}
