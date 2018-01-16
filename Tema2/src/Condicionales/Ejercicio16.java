package Condicionales;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		/* Modifica el programa anterior para que pida el a�o en curso y el n�mero de mes.
		 *  Y devuelva e ln�mero de d�as de ese mes (ahora s� debes tener en cuenta el asunto de los a�os bisiestos).
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el a�o actual");
		int año = entrada.nextInt();
		
		System.out.println("Introduce el numero de mes actual");
		int mes = entrada.nextInt();
		
		switch(mes) {
		
		case 1:
			System.out.println("31 d�as");
		break;
		case 2:
			switch(año) {
			case 2020:
				System.out.println("29 d�as");
				break;
			case 2024:
				System.out.println("29 d�as");
				break;
			case 2028:
				System.out.println("29 d�as");
				break;
			case 2032:
				System.out.println("29 d�as");
			default:
			System.out.println("28 d�as");
			break;
			}
			break;
			case 3:
				System.out.println("31 d�as");
			break;
			case 4:
				System.out.println("30 d�as");
			break;
			case 5:
				System.out.println("31 d�as");
			break;
			case 6:
				System.out.println("30 d�as");
			break;
			case 7:
				System.out.println("31 d�as");
			break;
			case 8:
				System.out.println("31 d�as");
			break;
			case 9:
				System.out.println("30 d�as");
			break;
			case 10:
				System.out.println("31 d�as");
			break;
			case 11:
				System.out.println("30 d�as");
			break;
			case 12:
				System.out.println("31 d�as");
			break;
			default:
			System.out.println("Por favor introduce un numero del 1 al 12");
		}
		
		System.out.println("FIN");
	}

}
