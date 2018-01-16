package Condicionales;
import java.util.Scanner;
public class Condicionales19 {

	public static void main(String[] args) {
		/*
		 * Programa que guarde en una constante un numero entre 1 y 10
		 * 
		 */
        Scanner entrada = new Scanner(System.in);
        final int NUM = 8;
        
        System.out.println("Adivinar un numero\n");
        System.out.println("Ingrese el numero:\n");
        
        if (entrada.hasNextInt() == false){
        	System.out.println("El dato ingresado es correcto (1-10)");
        		System.exit(0);
        }
	   
        int n2 = entrada.nextInt();
        if (n2 == NUM) {
        	System.out.println("Has acertado el numero es correcto");
        	
        } else {
        	System.out.println("Numero incorrecto");
        }
	
	}
	

}
