package Condicionales;
import java.util.Scanner;
public class Condicionales22 {

	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    /*
	     * Programa que pide un valor de compra y si este es menor de 100$, hara un 5% de descuento
	     * Si es mayor un 20% al final mostrara el valor de la compra ya rebajado.
	     */
		
	    System.out.println("Introduce el valor de la compra");
	    float valor = entrada.nextFloat();
	    
	   
	    
	    float valorrebajado = (float) (valor < 100 ? valor * 0.95 : valor * 0.80);
	    System.out.println("El precio total será: " + (valorrebajado));
	

	}

}
