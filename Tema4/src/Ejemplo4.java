import java.util.Scanner;


public class Ejemplo4 {

	public static void main(String[] args) {
		
		
	
		datos();
	}
		
		static String datos() {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce tu nombre");
			String nombre = entrada.nextLine();

			return nombre;
		}
	

}
