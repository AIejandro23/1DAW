package Bucles;
import java.util.Scanner;
public class EjemploBucles9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float nota;
		
		do {
			System.out.println("Nota?");
			nota = entrada.nextFloat();
		}while(nota < 0 || nota > 10);
		
	
		System.out.println("Nota correcta");
	}
}
		
//		float nota = -1;		
//		
//		while(nota < 0 || nota >10) {
//		System.out.println("Introduce tu nota");
//		nota = entrada.nextFloat();
//		}
//			System.out.println("Nota correcta");
//		}
//		
//			}

