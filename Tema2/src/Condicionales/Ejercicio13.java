package Condicionales;
	/*13.- Modifica el programa anterior para sólo haga el proceso 
	 * si el número de mes que se ha introducido está entre 1 y 4
	 */
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un numero de mes del 1 al 4");
		int num = entrada.nextInt();
		
		if (num < 0 || num > 4) {
			System.out.println("NUmero de mes incorrecto");
		} else {
				if(num == 1) {
					System.out.println("Enero");
				}else if (num == 2) {
					System.out.println("Febrero");
				}else if (num == 3) {
					System.out.println("Marzo");
					}else if (num == 4) {
						System.out.println("Abril");
					}
		}
		
		
		
			}
}
