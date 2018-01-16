package arrays_1;
		/**13.- Crea un programa que rellene un array llamado potencias
 				con las primeras 20 potencias de 2. Haz que después se muestren 
 				todos los valores mediante un bucle while.**/
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int j = 1;
		int i = 0;
		int potencias[] = new int[20];
		
		while(i < potencias.length) {
			 potencias[i] = (int) Math.pow(2 , j);
			 i++;
			 j++;
		}
			 i = 0;
		while(i < potencias.length) {
			System.out.println((i+1) + "-" + potencias[i]);
			i++;
		}
		
			}
}
