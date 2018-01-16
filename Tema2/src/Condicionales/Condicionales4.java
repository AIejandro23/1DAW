package Condicionales;
import java.util.Scanner;


public class Condicionales4 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nota final ");
		double nota = entrada.nextDouble();
		
		if(nota >= 5){
			System.out.println("Has aprobado.");
			
		}
		else{
			System.out.println("Has suspendido.");
	
			
		}
		
	}

}
