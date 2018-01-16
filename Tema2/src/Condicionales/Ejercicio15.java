package Condicionales;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*  Crea un programa que pida un número de mes entre 1 y 12.
		 *  A continuación devolverá el número de días de ese mes.
		 *  Supón que no existen años bisiestos.
		 */
		
		System.out.println("Introduzca un numero de mes entre el 1 y el 12");
		int mes = entrada.nextInt();
		
		switch(mes) {
	
		case 1:
			System.out.println("31 días");
		break;
		case 2:
			System.out.println("28 días");
		break;
		case 3:
			System.out.println("31 días");
		break;
		case 4:
			System.out.println("30 días");
		break;
		case 5:
			System.out.println("31 días");
		break;
		case 6:
			System.out.println("30 días");
		break;
		case 7:
			System.out.println("31 días");
		break;
		case 8:
			System.out.println("31 días");
		break;
		case 9:
			System.out.println("30 días");
		break;
		case 10:
			System.out.println("31 días");
		break;
		case 11:
			System.out.println("30 días");
		break;
		case 12:
			System.out.println("31 días");
		break;
		default:
			System.out.println("Por favor introduce un numero del 1 al 12");
		}
		
		System.out.println("FIN");
	}

}
