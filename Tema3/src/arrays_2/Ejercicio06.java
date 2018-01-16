package arrays_2;

	/*
	 * 6.- Escribe una aplicación que vaya preguntando los votos de seis partidos políticos en unas 
		elecciones y guardándolos en un array. Al acabar, dirá cuál ha sido el menor número de votos y cuál
		el mayor, así como las posiciones del array que ocupan estos partidos
	 */
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int votos[] = new int[6];
		int posMin = 0;
		int posMax = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Cuantos votos ha sacado el partido nº " +  (i+1) + " ?");
			votos[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < votos.length; i++) {
			
			if(votos[i] < votos[posMin]) {
				posMin = i;
			}
			
			if(votos[i] > votos[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("El máximo de votos es: " + votos[posMax] + " y la posición es: " + posMax);
		System.out.println("El mínimo de votos es: " + votos[posMin] + " y la posición es: " + posMin);
	}

}
