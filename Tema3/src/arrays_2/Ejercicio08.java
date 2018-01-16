package arrays_2;

	/*
	 * 8.- La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a lo largo de las 24 
		horas de un día. Crea un programa capaz de recorrer este array e indicar cuáles han sido las 
		humedades máxima y mínima del día, y a qué horas se han producido.
	 */
public class Ejercicio08 {

	public static void main(String[] args) {

		int humedades[] = {45,40,40,40,37,35,39,39,45,50,55,60,65,70,70,75,75,72,65,60,55,50,50,45};
		int posMax = 0;
		int posMin = 0;
		
		for(int i = 0;i < humedades.length;i++) {
			
			if(humedades[i] < humedades[posMin]) {
				posMin = i;
			}
			
			if(humedades[i] > humedades[posMax]) {
				posMax = i;
			}
			
		}
		
		System.out.println("La humedad máxima registrada fué: " + humedades[posMax] + " y fue a las " + posMax + " horas");
		System.out.println("La humedad mínima registrada fué: " + humedades[posMin] + " y fue a las " + posMin + " horas" );

	}

}
