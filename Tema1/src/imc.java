import java.util.Scanner;


public class imc {

	public static void main(String[] args) {
		
	      Scanner entrada = new Scanner(System.in);
	      
	      
	        System.out.println("Introduce tu peso ");
	        int peso = entrada.nextInt();
	        
	        System.out.println("Introduce tu altura en cm ");
	        int altura = entrada.nextInt();
	      
	        
	        float imc = 10000 * peso / (altura * altura);
	        
	        System.out.println("Segun las estadisticas tu IMC es = " + imc);
	        
	        

		
	}

}
