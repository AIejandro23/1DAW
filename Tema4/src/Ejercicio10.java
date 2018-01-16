import java.util.Scanner;

/*
 * 10.- Escribe un método que escriba en pantalla el nombre de un mes a partir de su número. En caso 
		de que el número proporcionado no esté entre 1 y 12, deberá terminar inmediatamente
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero de mes");
		int mes = entrada.nextInt();
		
		System.out.println(nombreMes(mes));
		
	}
		static String nombreMes(int mes){
			
			String nombres[] = {"Enero","Febrero","Marzo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
			
			if(mes < 1 || mes > 12){
				return "ERROR 404";
			}
			
			return nombres[mes-1];
			
			
			
			
		}
	}


