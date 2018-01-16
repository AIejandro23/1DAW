package Condicionales;
import java.util.Scanner;
public class Condicionales16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		/*Programa que pide el numero de mes y devuelve
		 * el numero de dias de ese mes.
		 */
		System.out.println("Introduce el numero de un mes ");
		int mes = entrada.nextInt();
		
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:	
		case 10:
		case 12:	
			System.out.println("31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 dias");
			break;
		case 2:
			System.out.println("28 dias");
			break;
		default:
			System.out.println("Introduce un numero del 1 al 12");
		
		}

	}

}
