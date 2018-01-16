package Bucles;

		/*3.- Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que en 
			  cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-while
		 */
import java.util.Scanner;
public class BUCLESII_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			int potencia;
			int i=0;
			
			do {
				
				potencia = (int) Math.pow(3,i);
				if(potencia < 12000) {
				System.out.println("3 elevado a " + i + "=" + potencia);
			}
				i++;
				
			}while(potencia < 12000);
		
			}
}
