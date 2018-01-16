package Bucles;

		/*
		 * 5.- Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo 
			adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario 
			adivina el número o falla tres veces, el programa termina. Utiliza un bucle do-while
			Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden 
				Math.random( )
. 			Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un número entre 1 y 10, ambos inclusive:
				(int) (Math.random()*10 + 1)
		 */
import java.util.Scanner;
public class BUCLESII_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int random = (int) (Math.random()*10+1);
		int i = 1;
		int respuesta = 0;

		while(i<=3 && respuesta != random) {
				System.out.println("Adivina el numero entre 1 y 10");
				respuesta = entrada.nextInt();
			
		
				if(respuesta == random) {
					System.out.println("Acertaste!");
					break;
				}else {
					i++;
					System.out.println("Has fallado");
					  }
			}
	
		System.out.println("Fin del juego!");
}
} 