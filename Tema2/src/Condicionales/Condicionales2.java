package Condicionales;
import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("EScribe el total de la compra:");
		float total = entrada.nextFloat();
		
		if(total > 200) {
			
			System.out.println("Tiene derecho a descuento");
		}
	
		System.out.println("Gracias por la compra");
	}

}
