package Bucles;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
		
		int i = 1;
		
				System.out.println("Introduzca una palabra");
		String caracter = entrada.next();
		
		        System.out.println("Cuantas veces quieres repetir el caracter?");
		        int repeat = entrada.nextInt();

		        while(i <= repeat){
			System.out.println(caracter);
			i = 1 + i;

		}

	}

}
