package arrays_1;
import java.util.Scanner;
public class Ejemplo04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			// Declaramos un array de Strings con 5 posiciones.
			String nombres[] = new String[5];
			
			// Lo vamos recorriendo y rellenando cada posición
			// con un nombre escrito por el usuario.
			
			for(int i = 0; i < nombres.length; i++) {
				System.out.println("Nombre " + (i+1) + " : ");
				nombres[i] = entrada.nextLine();
			}
		
			for(int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre "+ (i+1) + ": " + nombres[i]);;
			}
			}
}
