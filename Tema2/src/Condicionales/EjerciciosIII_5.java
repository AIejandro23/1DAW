package Condicionales;

	/**5.- Haz un programa que te pida un número y te devuelva su tabla de multiplicar. Esto se repetirá 
		indefinidamente hasta que el usuario escriba 0. En ese caso se escribirá la tabla del cero y el
		programa terminará. Usa los bucles do-while y for
	
	@author Alejandro
	**/
import java.util.Scanner; 
public class EjerciciosIII_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
			System.out.println("TABLAS DE MULTIPLICAR");
			
			
			
			do {
				System.out.println("Introduce un número");
				numero = entrada.nextInt();
				for(int i=1;i<=10;i++) {
					System.out.println(numero + " x " + i + " = " + numero * i);
					
				}
			}while(numero != 0);
			
}
			}

