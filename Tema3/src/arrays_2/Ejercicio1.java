package arrays_2;

public class Ejercicio1 {

	public static void main(String[] args) {

		int edades[] = {20,25,30,28,39,42,30,29,28,21,60,55,20,19};
		boolean edadEncontrada = false;
		int i = 0;
		
		while(i < edades.length) {
			if(edades[i] == 35) {
					edadEncontrada = true;
					break;
			}
			i++;
		}
		
		if(edadEncontrada) {
			System.out.println("Localizada persona de 35 años.");
		}else {
			System.out.println("No se ha localizado ninguna persona de 35 años.");
		}
	}

}
