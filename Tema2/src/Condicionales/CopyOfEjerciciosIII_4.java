package Condicionales;
		/**@author Alejandro 
		 * 3.- Crea una aplicación para probar la capacidad de cálculo mental de los usuarios. Se calcularán
				dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A continuación el usuario deberá
				escribir el resultado de la suma de ambos números y se le indicará si ha acertado o no.
				Estas acciones se repetirán indefinidamente mediante un bucle while.
		 */
import java.util.Scanner;
public class CopyOfEjerciciosIII_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			long random1 = (long) (Math.random()*100+1);
			long random2 = (long) (Math.random()*100+1);
			long resultado = random1 + random2;
			long usuario;
			boolean bucle = true;
			
			System.out.println("CALCULO MENTAL");
			
			do {
			System.out.println(random1 + "+" + random2);
			
			usuario = entrada.nextLong();
			
			if(usuario == resultado) {
				System.out.println("Has acertado!");

			}else {
				System.out.println("Has fallado prueba otra vez");
			}
			
	
			}while(bucle = true);
			
			
			
			
			
	}
}