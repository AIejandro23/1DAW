package Condicionales;
	/*21.- Crea un programa que pregunte el nombre del usuario
	 *  y luego lo escriba. Ahora bien, si el usuario no introduce nada,
	 *   el nombre deberá quedar con el valor "Desconocido
	 */

import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String respuesta;
		
		System.out.println("Introduce tu nombre de usuario");
		String usuario = entrada.nextLine();
		
		//Esto significa que el usuario no haya escrito nada
		usuario = (usuario.equals("")) ? "Desconocido":usuario;
		
		System.out.println("Tú usuario és " + usuario);
			}
}
