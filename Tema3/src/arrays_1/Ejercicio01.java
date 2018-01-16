package arrays_1;

		/*
		 * 1.- Crea un array de Strings llamado estaciones
 		 * 		cuyos valores sean los nombres de las cuatro 
		 *		estaciones del año. Haz que después se muestren todos los valores mediante un bucle for.
		 */

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String estaciones[] = {"Invierno","Otoño","Verano","Primavera"};
		
		for(int i = 0; i < estaciones.length ; i++) {
			System.out.println( (i+1) + " " + estaciones[i]);
			
			
		}
		
	}

}
