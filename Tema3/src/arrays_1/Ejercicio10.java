package arrays_1;
	/**10.- Crea un programa que lea los precios de hasta cien productos y los guarde en un array llamado compra
	 *  Mientras los precios se van pidiendo al usuario, si éste introduce el valor 0, el programa 
	 *	entenderá que se ha terminado la compra, y mostrará todos los precios introducidos hasta el 
	 *	momento (no las posiciones vacías)
	 * 
	 */
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int SALIR = 0;
		int i = 0;
		double precios[] = new double[100];
		
		while(i < precios.length) {
			System.out.println("Introduce el precio");
			precios[i] = entrada.nextDouble();
			if(precios[i] == SALIR) {
				System.out.println("Fin");
				break;
			}
			i++;
		}
			i = 0;
			
			while(i < precios.length && precios[i] != 0 ) {
				System.out.println("Precio " + i + ": " + precios[i]);
				i++;
			}
		
			}
}
