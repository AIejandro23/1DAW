package Condicionales;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nota");
	    int nota = entrada.nextInt();
	    
	    switch(nota){
	    case 1:
	    	System.out.println("Suspendido");
	    	break;
	    case 2:
	    	System.out.println("Suspendido");
	    	break;
	    case 3:
	    	System.out.println("Suspendido");
	    	break;
	    case 4:
	    	System.out.println("Suspendido");
	    	break;
	    case 5:
	    	System.out.println("Suficiente");
	    	break;
	    case 6:
	    	System.out.println("Bien");
	    	break;
	    case 7:
	    	System.out.println("Notable");
	    	break;
	    case 8:
	    	System.out.println("Notable");
	    	break;
	    case 9:
	    	System.out.println("Excelente");
	    	break;
	    case 10:
	    	System.out.println("Excelente");
	    	break;
	    	default:
	    		System.out.println("Introduce un numero del 1 al 10");

	    	
	    }

	}

}
