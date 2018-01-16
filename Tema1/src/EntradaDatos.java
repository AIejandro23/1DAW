
import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido ¿Como te llamas? ");
		String nombre = entrada.nextLine();
		System.out.println("Hola " + nombre + "!");
		
		System.out.print("Edad: ");
		int edad = entrada.nextInt();
		System.out.print("Joder, estas en la flor de la vida con " + edad + " años");
		

		
	}

}
