import java.util.Scanner;

	/*
	 * .- Crea un método int max(int x, int y) que devuelva el mayor de los números x e y. Análogamente, 
	 *	crea el método int min(int x, int y)
	 *
	 */
public class Ejercicio8 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce otro numero por favor.");
		int num2 = entrada.nextInt();
		
		System.out.println("El minimo es " + min(num1,num2));
		System.out.println("El máximo es " + max(num1,num2));
	}
	
	static int min(int x, int y){
		
		int minimo;
		
		if(x < y){
			minimo = x;
		}
		else{
			minimo = y;
	}
		return minimo;
	
}
	
	static int max(int x, int y){
		
		if(x > y){
			return x;
		}else{
			return y;
		}
	}
}
