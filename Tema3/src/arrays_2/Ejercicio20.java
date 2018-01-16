package arrays_2; 

	/*
	 * 19.- Crea un programa que vaya pidiendo por la terminal los apellidos, el nombre y el sueldo de 
		cuatro empleados de una empresa, y guardándolo como filas en un array bidimensional llamado nominas. 
		A continuación muestra los datos por la pantalla en forma de tabla y calcula el salario total
		que paga la empresa cada mes.
	 */
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String usuario[][] = new String[4][3];
		double salario = 0;
		int posMin = 0;
		
		for(int i = 0;i < usuario.length;i++) {
			
			System.out.println("Introduce el nombre");
			usuario[i][0] = entrada.nextLine();
			System.out.println("Introduce el apellido");
			usuario[i][1] = entrada.nextLine();
			System.out.println("Introduce el salario");
			usuario[i][2] = entrada.nextLine();
		}
		
		for(int i = 0;i < usuario.length;i++) {
			for(int j = 2; j < usuario[0].length; j++) {
				if(Double.parseDouble(usuario[j][2]) < Double.parseDouble(usuario[posMin][2])) {
					posMin = i;
				}
			}
		}
			for(int i = 0;i < usuario.length;i++) {
				salario = salario + Double.parseDouble(usuario[i][2]);
			}
		for(int i = 0; i < usuario.length;i++) {
			System.out.println("Nombre: " + usuario[i][0]);
			System.out.println("Apellidos: " + usuario[i][1]);
			System.out.println("Salario : " + usuario[i][2]);
			System.out.println("==========================");
		}
		System.out.println("El salario total que paga la empresa mensualmente es  = " + salario);
		System.out.println("El empleado que menos cobra es " + usuario[posMin][0] + usuario[posMin][1]  + " y cobra " + usuario[posMin][2]); 
	}

}
