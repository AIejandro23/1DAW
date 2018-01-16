package Condicionales;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int NUMERO = 6;
		
		System.out.println("Introduce un numero del 1 al 10 ");
		int numeroUsuario = entrada.nextInt();
		
		if(numeroUsuario == NUMERO){
			System.out.println("Enhorabuena has acertado");
		}
		else{
			System.out.println("Has fallado, prueba otra vez");
					
		}
		
		
	}

}
