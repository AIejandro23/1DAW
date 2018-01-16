import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre ");
		String nombre = entrada.next();
		
		System.out.println("Introduce la nota de tu primera evaluacion ");
		int nota1 = entrada.nextInt();
		
		System.out.println("Introduce la nota de tu segunda evaluacion ");
		int nota2 = entrada.nextInt();
		
		System.out.println("Introduce la nota de tu tercera evaluacion ");
		int nota3 = entrada.nextInt();
		
		System.out.println(nombre + ", tu nota media final es un " + (nota1 + nota2 + nota3) / 3);
	
	

	}

}
