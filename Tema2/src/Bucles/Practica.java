package Bucles;
import java.util.Scanner;
public class Practica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 1;
		do {
			System.out.println("Introduce un numero");
			int numero = entrada.nextInt();		
			
				if(numero == 0) {
					while(i < 11) {
						System.out.println(i * 0);
						i++;
					}
					break;
					
				}else {
					while(i < 11) {
						System.out.println(numero * i);
						i++;
					}
				}
		
		}while(true);
	
		
		}
} 

	