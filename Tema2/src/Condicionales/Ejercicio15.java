package Condicionales;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*  Crea un programa que pida un n�mero de mes entre 1 y 12.
		 *  A continuaci�n devolver� el n�mero de d�as de ese mes.
		 *  Sup�n que no existen a�os bisiestos.
		 */
		
		System.out.println("Introduzca un numero de mes entre el 1 y el 12");
		int mes = entrada.nextInt();
		
		switch(mes) {
	
		case 1:
			System.out.println("31 d�as");
		break;
		case 2:
			System.out.println("28 d�as");
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
