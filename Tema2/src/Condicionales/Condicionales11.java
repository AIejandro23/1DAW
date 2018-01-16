package Condicionales;
import java.util.Scanner;
public class Condicionales11 {

	public static void main(String[] args) {
		/* Modifica el programa anterior para que acepte una nota con decimales
		 *  (por ejemplo, si la nota es menor que 5, la calificaci�n ser� de Insuficiente)
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nota ");
		float nota = entrada.nextFloat();
		
		if(nota < 5) {
			System.out.println("Suspendido");
		}else if(nota < 5) {
			System.out.println("Suficiente");
		}
		
		else if(nota < 6) {
				System.out.println("Bien");
			}
		else if(nota < 9) {
			System.out.println("Notable");
		}
		else if(nota <=10) {
			System.out.println("Excelente");
		}
		}
		
		
		
	}


