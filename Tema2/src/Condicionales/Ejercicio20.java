package Condicionales;

	/*20.- Escribe un programa que pida la edad del usuario. 
	 * Si ésta es menor de 18 años, el valor de la variable mayorDeEdad
 	 *	será verdadero. Si no, será falso. Al final se mostrará este valor
	 */
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean mayorDeEdad;
		
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		
		mayorDeEdad = (edad>=18)?true:false;
		
		System.out.println(mayorDeEdad);
		
			}
}
