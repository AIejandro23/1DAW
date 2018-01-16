package Condicionales;
import java.util.Scanner;
public class Ejercicio17 {
	/*Calculadora. Crea un programa que pregunte dos números al usuario. A continuación mostrará un menú similar a éste:
	1)Suma
	2)Resta
	3)Multiplicación
	4)División
	El usuario escribirá el número correspondiente a la operación que desea. Entonces se mostrará el resultado.
	 */
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce un número");
			double numero1 = entrada.nextDouble();
			
			System.out.println("Introduce otro número");
			double numero2 = entrada.nextDouble();
			
			System.out.println("1) Suma");
			System.out.println("2) Resta");
			System.out.println("3) Multiplicación");
			System.out.println("4) División");
			
			int operacion = entrada.nextInt();
			
			switch(operacion) {
			case 1: 
				System.out.println(numero1 + "+" + numero2 + "=" + (numero1+numero2));
			break;
			case 2:
				System.out.println(numero1 + "-" + numero2 + "=" + (numero1-numero2));
			break;
			case 3:
				System.out.println(numero1 + "x" + numero2 + "=" + (numero1*numero2));
			break;
			case 4:
				System.out.println(numero1 + "/" + numero2 + "=" + (numero1/numero2));
			break;
			default:
				System.out.println("Por favor introduce un numero entre el 1 y el 4");
			break;
			}
	}
	

}
