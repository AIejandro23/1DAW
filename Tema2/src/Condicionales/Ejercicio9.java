package Condicionales;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del producto");
		float precio = entrada.nextFloat();
		
		System.out.println("Introduzca el numero de unidades compradas");
		float unidades = entrada.nextFloat();
		
		float preciototal = precio * unidades;
		
		if(preciototal < 100){
			System.out.println("El precio total sera de " + preciototal);
		}
		
		if(preciototal > 200){
		   System.out.println("El precio total sera de " + preciototal * 0.85);
		}
		else{
			System.out.println("El precio total sera de " + preciototal *0.90);
			
		}
		System.out.println("Gracias por su compra.");
	}

}
