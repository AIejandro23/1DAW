package Condicionales;

		/*5.- Dise�a una aplicaci�n donde un usuario pueda elegir el idioma de una frase de saludo. En primer
			lugar se mostrar� un men�:
				(1) Franc�s
				(2) Ingl�s
				(3) Alem�n
				(4) Italiano
			El usuario escribir� un n�mero entero entre 1 y 4 para se�alar qu� opci�n quiere y, a continuaci�n,
			aparecer� la frase "Buenos d�as" en el idioma que corresponda (puedes usar Google translator). Si
			escribe otro n�mero, el mensaje se mostrar� en espa�ol.
			Utiliza la instrucci�n switch.
		 */
import java.util.Scanner;
public class InstCon5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige el idioma de saludo");
		System.out.println("1) Franc�s");
		System.out.println("2) Ingl�s");
		System.out.println("3) Alem�n");
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
