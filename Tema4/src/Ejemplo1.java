import java.util.Scanner;


public class Ejemplo1 {

	public static void main(String[] args) {

		mayordomo();
		tabla();
	}
	
	static void mayordomo(){
		System.out.println("¿Qué desea señor mío?");
		
	}
	
	static void elevar(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero que quieres elevar");
		double numero = entrada.nextDouble();
		
		System.out.println("Tu numero al cuadrado es " + numero*numero);
	}
	
	static void tabla(){
		for (int i = 0; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + 5 * i);
		}
	}
}
