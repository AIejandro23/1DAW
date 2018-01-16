package Condicionales;
		/**@author Alejandro
		 * 3.- Crea una aplicación para probar la capacidad de cálculo mental de los usuarios. Se calcularán
				dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A continuación el usuario deberá
				escribir el resultado de la suma de ambos números y se le indicará si ha acertado o no.
				Estas acciones se repetirán indefinidamente mediante un bucle while.
		 */
import java.util.Scanner;
public class EjerciciosIII_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			
			long usuario;
			char letra = 0;
			
				System.out.println("CÁLCULO MENTAL");
		
			while(letra == 's') {
				long random1 = (long) (Math.random()*100+1);
				long random2 = (long) (Math.random()*100+1);
				long resultado = random1 + random2;
				
				System.out.println("Suma estos dos números " + random1 + " y " + random2);
				usuario = entrada.nextLong();
				if(usuario == resultado) {
					System.out.println("Has acertado!");
								
								
				}else {
					System.out.println("Has fallado prueba otra vez.");
				}
			}
		
			System.out.println("¿Quieres continuar?");
			letra = entrada.next().toLowerCase().charAt(0);

			
		System.out.println("Fin de la prueba!");
			}
}
