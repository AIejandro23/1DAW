package Condicionales;

		/*5.- Diseña una aplicación donde un usuario pueda elegir el idioma de una frase de saludo. En primer
			lugar se mostrará un menú:
				(1) Francés
				(2) Inglés
				(3) Alemán
				(4) Italiano
			El usuario escribirá un número entero entre 1 y 4 para señalar qué opción quiere y, a continuación,
			aparecerá la frase "Buenos días" en el idioma que corresponda (puedes usar Google translator). Si
			escribe otro número, el mensaje se mostrará en español.
			Utiliza la instrucción switch.
		 */
import java.util.Scanner;
public class InstCon5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige el idioma de saludo");
		System.out.println("1) Francés");
		System.out.println("2) Inglés");
		System.out.println("3) Alemán");
		System.out.println("4) Italiano");
		
		int numero = entrada.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Bonjour");
		break;
		case 2:
			System.out.println("Hello");
		break;
		case 3:
			System.out.println("Hallo");
		break;
		case 4:
			System.out.println("Ciao");
		break;
		default:
			System.out.println("Hola");
			
		}
		
			}
}
