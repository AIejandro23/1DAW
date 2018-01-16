package arrays_1;
		/*
		 * 2.- Crea un array de Strings llamado meses
 			cuyos valores sean los nombres de los doce meses del año. 
 			Haz que después se muestren todos los valores mediante un bucle while.
		 */

public class Ejercicio02 {

	public static void main(String[] args) {
			int i = 0;
		
			String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
			
			while(i < meses.length) {
				System.out.println((i+1) + " " + meses[i]);
				i++;
			}
	}

}
