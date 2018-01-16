package Bucles;
import java.util.Scanner;
public class Bucles9 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		int dividendo = 27;
		int divisor = 5;
		int resto = dividendo - divisor;
		
		while(resto > divisor) {
			System.out.println(dividendo + "-" + divisor + "=" + resto);
			dividendo = resto;
			resto = resto - divisor;
		}
		System.out.println(dividendo + "-" + divisor + "=" + resto);
		System.out.println("\nResto " + resto);
		System.out.println("Fin");
	}

}
