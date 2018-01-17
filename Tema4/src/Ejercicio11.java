import java.util.Scanner;

/*
 * 11.- Crea un método que tome un array de Strings, y un String. Devolverá la posición del String
		dentro del array, ó -1 si no lo encuentra. Utiliza dos instrucciones return.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano",
				"Neptuno", "Plutón"};
		
		System.out.println("Introduce el planeta que quieres ver");
		String usuario = entrada.nextLine();
		
		buscador(planetas, usuario);
		
		
	}
	
	static int buscador(String planetas[], String usuario) {
		
		for (int i = 0; i < planetas.length; i++) {
			if(planetas[i].equals(usuario)) {
				System.out.println("La posición es " + i);
				return i;
				
			}
			for (int j = 0; j < planetas.length; j++) {
				if(!planetas[i].equals(usuario)) {
					System.out.println("La posición es -1");
					return -1;
				}
			}
			
			
			}
		
		return 0; 
		
	}

}
