package arrays_2;
	/*
	 * 23.- Un edificio dispone de 3x3x3 oficinas (3x3 oficinas en cada una de sus 3 plantas), formando uncubo. 
		•Crea un array con estas dimensiones llamado temperaturas que permita almacenar, en un instante dado,
		 la temperatura de cada oficina. 
		•Invéntate 5 valores de temperatura y guárdalos en el array. 
		•Calcula la suma de todas las temperaturas del array (las que no has introducido son cero).
		•Calcula la temperatura media de las 5 habitaciones.
	 */
public class Ejercicio23 {

	public static void main(String[] args) {
		
		double temperaturas[][][] = new double[3][3][3];
		double suma = 0;
		int divisorMedia = 0;
		
		temperaturas[0][0][0] = 20;
		temperaturas[0][1][0] = 15.5;
		temperaturas[0][2][0] = 21;
		temperaturas[2][0][0] = 18.2;
		temperaturas[2][1][1] = 15.3;
		
		
		// Damos valores a la primera coordenada del array.
		for(int i = 0; i < temperaturas.length;i++){
			
			// Damos valores a la segunda coordenada del array.
			for (int j = 0; j < temperaturas[0].length; j++) {
				
				// Damos valores a la tercera coordenada del array.
				for (int k = 0; k < temperaturas[0][0].length; k++) {
					suma = suma + temperaturas[i][j][k];
					System.out.println("(" + i + ", " + j + "," + k + ") -> " + temperaturas[i][j][k]);
					
					if(temperaturas[i][j][k] != 0){
						divisorMedia++;
					}
					
				}
			}
		}
		System.out.println("La suma total es " + suma);
		System.out.println("La media es " + suma/divisorMedia);
	}

}
