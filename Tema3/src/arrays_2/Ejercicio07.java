package arrays_2;

	/*
	 * 7.- La siguiente tabla guarda el número de espectadores que vieron La 2
 		a las 23:00 horas, cada día de la semana. Escribe un programa que busque
 		el máximo y el mínimo de audiencia en esta semana
	 */
public class Ejercicio07 {

	public static void main(String[] args) {
		
		long espectadores[] = {2000000,2500000,3100000,3000000,1200000,1800000,2050000};
		int posMax = 0;
		int posMin = 0;
		
		for(int i = 0; i < espectadores.length;i++) {
			
			if(espectadores[i] < espectadores[posMin]) {
				posMin = i;
			}
			
			if(espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("El máximo de audiencia de esta semana fué " + espectadores[posMax]);
		System.out.println("El mínimo de audiencia de esta semana fué " + espectadores[posMin]);
		
	}

}
