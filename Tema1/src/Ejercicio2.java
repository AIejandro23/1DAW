import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero1 = entrada.nextInt();
		
		System.out.println("Introduce otro numero ");
		int numero2 = entrada.nextInt();
		
		System.out.println("El resto de su division es = " + numero1 % numero2);
		
			

		
	}

}
