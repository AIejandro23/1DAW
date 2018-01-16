package Bucles;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		
		System.out.println("De que color és el caballo blanco de Santiago?");
		System.out.println("1) Marrón");
		System.out.println("2) Negro");
		System.out.println("3) Blanco");
		System.out.println("4) Verde");
		
		do {
			System.out.println("Introduce tu respuesta");
			respuesta = entrada.nextInt();
		}while(respuesta < 1 || respuesta > 4);
	
		if(respuesta == 3) {
			System.out.println("Enhorabuena respuesta correcta!");
		}else {
			System.out.println("Error, respuesta incorrecta");
		}
		
	}
}
