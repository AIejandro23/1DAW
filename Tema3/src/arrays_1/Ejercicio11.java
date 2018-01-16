package arrays_1;

		/*
		 * 11.- Crea un programa que almacene las órdenes que debe seguir un robot en un array de 1000 
			elementos. Las órdenes son palabras escritas por el usuario en la consola como:
						•izquierda
						•derecha
						•arriba
						•abajo
						•matar
			El programa parará de pedir órdenes cuando el usuario escriba "ejecutar". Entonces mostrará la lista
			de comandos que debe seguir el robot.
		 */
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		String robot[] = new String[1000];
		
		while(i < robot.length) {
		System.out.println("Introduce las ordenes");
		robot[i] = entrada.nextLine(); 
		if(robot[i].equals("ejecutar")) {
			System.out.println("Mostrando lista de comandos...");
			break;
		}
		i++;

		}
		
		i = 0;
		
		while(i < robot.length && robot[i] != null) {
			System.out.println("Comando " + i + ": " + robot[i]);
			i++;
		}
		}
		
			}

