package arrays_1;
	/*
	 * 5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de
			un examen que hayas hecho este curso (no sólo de programación). Haz que después se muestren
			todos los valores mediante un bucle while.
	 */
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float notas[] = new float[5];
		int i = 0;
		
		while(i < notas.length) {
			System.out.println("Introduce la nota numero " + (i+1));
			notas[i] = entrada.nextFloat();
			i++;
		}
		i = 0;
		while(i < notas.length) {
			System.out.println("Nota nº" + (i+1) + " = " + notas[i]);
			i++;
		}
		

	}

}
