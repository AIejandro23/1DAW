package Condicionales;

		/*4.- Un profesor quiere una aplicación que muestre las notas de un examen con diferente color según este esquema:
			• Nota < 4: Rojo.
			• 4 <= Nota < 5: Verde.
			• Nota >= 5: Azul.
		El programa pedirá una nota (puede tener decimales) y devolverá el nombre del color a usar. Utiliza
		las instrucciones if y else if. 
		 */
import java.util.Scanner;
public class InstCon4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Introduce una nota");
		float nota = entrada.nextFloat();
		
		if(nota < 4) {
			System.out.println("Rojo");
		}else if(nota <= 4 && nota < 5) {
			System.out.println("Verde");
		}else if(nota >= 5 && nota <= 10) {
			System.out.println("Azul");
		}else {
			System.out.println("Introduce una nota valida por favor.");
		}
		
		
			}
}
