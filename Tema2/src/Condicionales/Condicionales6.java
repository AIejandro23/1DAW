package Condicionales;
import java.util.Scanner;
public class Condicionales6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el total de la compra");
		float total = entrada.nextFloat();
		
		if(total > 200){
			System.out.println("EL cliente tiene derecho a descuento");
		}
		else{
			System.out.println("No tiene descuento");
			
		}

	}

}
