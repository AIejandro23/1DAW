import java.util.Scanner;

/*
 * 9.- Crea un método que tome como parámetro un entero representando un año, y devuelva true o
		false indicando si es bisiesto o no.
 */
public class Ejercicio9 {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

		
	System.out.println("Introduce un año");
	int año = entrada.nextInt();
	
	bisiesto(año);
	
	}

	static boolean bisiesto(int año) {
		if(año % 4 == 0 && año % 100 != 0) {
			System.out.println("Es un año bisiesto");
			return true;
		}else {
			System.out.println("Es un año no bisiesto.");
			return false;
		}
	}
}
