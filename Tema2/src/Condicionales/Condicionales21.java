package Condicionales;
import java.util.Scanner;
public class Condicionales21 {

	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    /*
	     * Programa que pide una nota y si es menor de 5 muestra
	     * la calificacion suspendida y si no aprobada
	     */
		
	   System.out.println("Introduce tu nota");
	   double nota = entrada.nextDouble();
	   
	   String resultado = nota < 5 ? "Suspendido" : "Aprobado";
	
	   System.out.println("Has " + resultado);
       
	   
	}

}
