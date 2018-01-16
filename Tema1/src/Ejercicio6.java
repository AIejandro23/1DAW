import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del producto ");
		String nombre = entrada.next();
		
		System.out.println("Introduce el numero de unidades vendidas ");
		int numero = entrada.nextInt();
		
	    System.out.println("El coste total es de " + numero * 25 + "$");

	}

}
