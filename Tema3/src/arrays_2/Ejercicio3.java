package arrays_2;
	/*
	 * 3.- Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por 
			consola y los vaya guardando en un array llamado nombres. 
			La aplicación terminará de pedir palabras cuando el usuario escriba "nadie".
			A continuación revisará el array y averiguará si se ha introducido el nombre "Calderón". Si es así 
			escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". Utiliza una variable semáforo llamándola nombreEncontrado

	 */
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		String nombres[] = new String[10];
		boolean nombreEncontrado = false;
		
		while(i <= 9) {
			System.out.println("Introduce un nombre " + (10-i));
			nombres[i] = entrada.nextLine(); 
				if(nombres[i].equals("nadie")) {
					break;
				}
			i++;
		}
		i = 0;
		while(i < nombres.length) {
			if(nombres.equals("Calderón")) {
				nombreEncontrado = true;
				break;
			}
			i++;

		}
		if(nombreEncontrado) {
			System.out.println("Calderón...de la Barca");
		}else {
			System.out.println("Nombre no encontrado.");
		}
	}

}
