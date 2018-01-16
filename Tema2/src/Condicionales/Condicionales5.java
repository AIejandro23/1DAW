package Condicionales;
import java.util.Scanner;

public class Condicionales5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		
		if(edad >= 18){
			System.out.println("Adelante puedes pasar a ver porno.");
	
		}
		else{
			System.out.println("Tienes prohibidio pasar.");
			
		}

	}

}
