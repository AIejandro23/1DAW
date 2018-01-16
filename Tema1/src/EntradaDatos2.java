import java.util.Scanner;

public class EntradaDatos2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hola como te llamas? ");
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre + "!");
	    System.out.println("Introduce tu edad");
	    int edad = entrada.nextInt();
	    
	    System.out.println("Mmmm interesante así que " + nombre + " y tienes " + edad + " años.");
	    
		
		

	}

}
