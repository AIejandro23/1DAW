package Condicionales;

	/*22.- Crea un programa que calcule la hora de cierre de una tienda.
	 *  Esta hora depende del valor de una variable de tipo String llamada 
	 *	dia. Si su valor es "entre semana", la hora de cierre de la tienda 
	 *	será "20:00". En otro caso, la hora de cierre será "14:00"
	 */

import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String respuesta;
		
		System.out.println("HORA DE CIERRE");
		System.out.println("1) Entre Semana");
		System.out.println("2) Fin de semana");
		int numero = entrada.nextInt();
		
		respuesta = (numero == 1) ? "La hora de cierre de la tienda será a las 20:00":"La hora de cierre será a las 14:00";
		
		System.out.println(respuesta);
		
			}
}
