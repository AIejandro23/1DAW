package Condicionales;

		/*3.- Queremos dise�ar un programa que solicite un n�mero al usuario y le responda "Es impar" o
			  "No es impar". Utiliza para ello la notaci�n ? en lugar de if asignando a una variable de tipo String
			   el resultado y mostrando despu�s esta variable. 
		 */
import java.util.Scanner;
public class InstCon3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String resultado;
		
		System.out.println("Introduzca un n�mero");
		int numero = entrada.nextInt();
		
		resultado = (numero%2==0)? "No es impar":"Es impar";
		
		System.out.println(resultado);
			}
}
