import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del producto ");
		String nombre = entrada.next();
		
		System.out.println("Introduce su precio ");
		int precio = entrada.nextInt();
		
		System.out.println("Introduce el descuento que se le debe hacer ");
	    int descuento = entrada.nextInt();
		
		float preciofinal = ((descuento*precio) / 100);
		
		System.out.println("Se llama " + nombre + " su precio es de " + precio + "$, le aplicamos un descuento del " + descuento + "% y en total cuesta " +  (precio - preciofinal) + "$");
	

	}

}
