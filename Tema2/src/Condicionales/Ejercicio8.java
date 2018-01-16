package Condicionales;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
				
		System.out.println("Como se escribe ordenador en ingles? ");
		String ordenador = entrada.next();
		
		if(ordenador.equals("computer")){
			System.out.println("Correcto");
			
			
		}
		else{
			System.out.println("Error");
		}

	}

}
