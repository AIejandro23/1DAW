package arrays_1;
		/*
		 * 12.- Escribe una aplicación que cree un array de 100 posiciones llamado matriculas y rellene todas 
				las posiciones con el valor por defecto "sinmatricula". Haz que después se muestren todos los 
				valores mediante un bucle for.
		 */
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		String matriculas[] = new String[100];
		
		while(i < matriculas.length) {
			matriculas[i] = "sinmatricula";
			i++;
		}
		
			i = 0;
			while(i < matriculas.length) {
				System.out.println((i+1) + " " + matriculas[i]);
				i++;
			}
		
			}
}
