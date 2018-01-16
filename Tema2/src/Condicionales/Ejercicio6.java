package Condicionales;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio del producto");
		float precio = entrada.nextFloat();
		
		System.out.println("Introduce el numero de unidades compradas");
		float unidades = entrada.nextFloat();
		
		float descuento1 = (15 * precio * unidades) / 100;
		float descuento2 = (5 * precio * unidades) / 100;
		
		if(precio >= 75){
			System.out.println("Le aplicaremos un descuento de un 15%.");
		
			System.out.println("El precio final sera de " + ((precio * unidades) - descuento1));
		}
		else{
			System.out.println("Le aplicaremos un descuento de un 5%.");
			
			System.out.println("El precio final sera de " + ((precio * unidades) - descuento2));
			
		}
		
	}

}
