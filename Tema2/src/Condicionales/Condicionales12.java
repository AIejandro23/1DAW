package Condicionales;
import java.util.Scanner;
public class Condicionales12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Valor de la compra: ");
	
		float compra = entrada.nextFloat();
		
		float precioFinal;
		
		if (compra > 100) {
			
			
			
			if (compra > 500) {
				System.out.println("Habra 20% de descuento.");
				precioFinal = compra * 0.8F;
				
			} else {
				System.out.println("Habra 10% de descuento");
				precioFinal = compra * 0.9F;
				
			}
			
		} else {
			System.out.println("No hay descuento");
			precioFinal = compra;
			
		}
	
		System.out.println("\nA Cobrar: " + precioFinal + " $");
		

	}

}
