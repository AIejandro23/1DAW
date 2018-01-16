import java.util.Scanner;

/*
 * 3.- Escribe un método que pida al usuario su nombre y devuelva la cadena introducida.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(nombre());
	}
		public static String nombre() {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Introduce tu nombre");
			String nombre = entrada.next();
			
			return nombre;
				}
		
		
	}


