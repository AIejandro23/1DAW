package arrays_1;
import java.util.Scanner;

		/*
		 *4.- Crea un array llamado companyeros
 			con 4 posiciones y ve asignando a cada una de ellas el 
			nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que después se muestren 
			todos los valores mediante un bucle for.
		 */
public class Ejercicio04 {

	public static void main(String[] args) {

		String companyeros[] = new String[4];
		
		companyeros[0] = "Ramón";
		companyeros[1] = "Benjamín";
		companyeros[2] = "Pablo";
		companyeros[3] = "Ankush";
		
		for(int i = 0 ; i < companyeros.length ; i++ ) {
			System.out.println((i+1) + " " + companyeros[i]);
		}
		
	}

}
