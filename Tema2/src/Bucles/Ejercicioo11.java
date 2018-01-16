package Bucles;
import java.util.Scanner;
public class Ejercicioo11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numero;
		
		do {
			System.out.println("Introduce un número entre el 1 y 20");
			numero = entrada.nextFloat();
		}while(numero < 0 || numero > 20);
		
		System.out.println("Su numero es: " + numero);
		
			}
}
