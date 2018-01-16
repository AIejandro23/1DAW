package Bucles;

		/*2.- Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino que, al final, 
			simplemente se muestre la suma de todos ellos. Utiliza un bucle while
		 */
import java.util.Scanner;
public class BUCLESII_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			float i = 0;
			float suma = 0;
			
			while(i<=1000) {
				System.out.println(i);
				i=i+5;
				suma = suma + i;
			}
			System.out.println("Suma total: ");
			System.out.println(suma);

			
			}
}
