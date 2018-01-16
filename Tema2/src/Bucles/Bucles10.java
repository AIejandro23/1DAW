package Bucles;
import java.util.Scanner;
public class Bucles10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 5;
		
	while(numero < 1 || numero > 4) {
		System.out.println("�C�mo se escribe 30 en hexadecimal?");
		System.out.println("1) 1E");
		System.out.println("2) 2F");
		System.out.println("3) 33");
		System.out.println("4) Ninguno de los anteriores");
		numero = entrada.nextInt();
		
		}
		if(numero != 1) {
			System.out.println("Has fallado");
		}else{
			System.out.println("Enhorabuena has acertado");
		}
	}
	
	}

