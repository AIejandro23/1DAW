package Bucles;

/*
 * Programa que pida un número al usuario y lo vaya dividiendo
 * entre -5, luego -4 hasta llegar a 5.
 * Ejemplo: Si el usuario escribe el número 10 se mostraría:
 * 
 * 10 : -5 = -2
 * 10 : -4 = -2.5
 * 10 : -3 = -3.3333
 * 10 : -2 = -5
 * .......
 * 10 : 5 = 2
 */

import java.util.Scanner;
public class Bucless11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int i = -5;
		
		System.out.println("Introduce un número");
		numero = entrada.nextInt();
		
		// En este ejercicio hacemos uso de la funcion "continue" para saltar el bucle cuando llega a "0" porque dividir entre 0 no tiene solución y da error.
		while(i<=5) {
			if(i == 0) {
				i++; // Importante poner el i++ antes del continue.
				continue;
			}
			System.out.println(numero + ":" + i + "=" + numero/i);
			i++;

		}

		}
		
		
			}

