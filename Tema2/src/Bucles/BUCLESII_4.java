package Bucles;
		/*
		 4.- Utiliza un bucle for
 		para preguntar 5 veces por un número entero, y al final devolver la frase "Has fallado".
		 */
import java.util.Scanner;
public class BUCLESII_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int RESULTADO = 5;
		
			for(int i = 1;i < 6; i++ ) {
				System.out.println("Introduce un numero entero");
				int entero = entrada.nextInt();
				if(entero == 5) {
					System.out.println("Has acertado");
				}else {
					
				
				
			
				System.out.println("Has fallado.");
				}
			}
	}
}