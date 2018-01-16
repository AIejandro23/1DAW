package arrays_2;

/*
 * 4.- Escribe un programa que pida 10 precios de productos y los guarde en un array llamado productos. 
 * Después recorrerá el array hasta encontrar un precio menor que 0. Si lo encuentra 
	escribirá el mensaje "Se ha encontrado un valor no válido en la posición x. El programa terminará" 
	(x es la posición del array donde está ese dato). Si no lo encuentra, calculará la suma de todos los 
	precios y la mostrará. Utiliza una variable semáforo llamada preciosCorrectos,  que valdrá true si todos
	 los precios son mayores o iguales a cero, y false si se encuentra un número negativo
 */
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double productos[] = new double[10];
		int i = 0;
		boolean preciosCorrectos = true;
		double suma = 0;

		while (i < productos.length) {
			System.out
					.println("Introduce el precio del producto nº " + (i + 1));
			productos[i] = entrada.nextDouble();
			i++;
		}

		i = 0;

		while (i < productos.length) {
			if (productos[i] < 0) {
				System.out
						.println("Se ha encontrado un valor no válido en la posición "
								+ (i + 1) + ". El programa terminará.");
				preciosCorrectos = false;
				break;
			}

			i++;
		}

		i = 0;
		if (preciosCorrectos) {
			while (i < productos.length) {
				suma = suma + productos[i];
				i++;
			}
			System.out.println("La suma total es = " + suma);

		}
	
	}
}
