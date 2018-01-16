package arrays_2;
	/*
	 * 2.- Crea una aplicación que vaya leyendo y guardando en un array las estaturas de 10 personas. A  
		continuación, recorrerá el array y nos informará de si alguna de estas estaturas es mayor de 1'90 m
	 */
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double estaturas[] = new double[10];
		int i = 0;
		int mayores = 0;
		
		while(i < estaturas.length) {
			System.out.println("Introduce la estatura nº " + (i+1) );
			estaturas[i] = entrada.nextDouble();
			if(estaturas[i] > 1.90) {
				mayores++;
			}
			i++;
		}
		
		System.out.println("Hay " + mayores + " estaturas mayores de 1,90 ");
	}

}
