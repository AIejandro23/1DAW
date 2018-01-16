package arrays_1;
	/*
	 * 17.- Escribe una aplicación que pida al usuario diez precios de productos. Después devolverá el 
	 * 		precio total a pagar y el número de productos cuyo precio sea mayor de 10 euros.
	 */
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double precios[] = new double[10];
		int i = 0;
		int caros = 0;
		double suma = 0;
		
		while(i < precios.length) {
			System.out.println("Introduce el precio del producto nº" + (i+1));
			precios[i] = entrada.nextDouble();
			i++;
		}
			i = 0;
		while(i < precios.length) {
			if(precios[i] > 10) {
				caros++;
			}
			suma = suma + precios[i];
			i++;
		}
		
		System.out.println("El precio total a pagar es = " + suma);
		System.out.println("Los productos cuyo precio es mayor a 10 euros son " + caros);
	}

}
