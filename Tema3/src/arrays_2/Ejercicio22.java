package arrays_2;
		/** @author Alejandro
		 *  22.- Escribe un programa que vaya preguntando y guardando en un array el nombre de un alumno y
				sus notas de exámenes, trabajos y actitud en un trimestre. Así para tres alumnos. A continuación
				mostrará una lista con el nombre de cada alumno y su nota de evaluación, que vendrá dada por la fórmula:
			
			N=50⋅E+40⋅T+10⋅A
					100	
		 **/
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String estudiantes[][] = new String[3][4];
		
		for(int i = 0 ; i < estudiantes.length;i++) {
			System.out.println("Introduce el nombre del alumno");
			estudiantes[i][0] = entrada.nextLine();
			
			System.out.println("Introduce la nota de exámenes");
			estudiantes[i][1] = entrada.nextLine();
			
			System.out.println("Introduce la nota de trabajos");
			estudiantes[i][2] = entrada.nextLine();
			
			System.out.println("Introduce la nota de actitud");
			estudiantes[i][3] = entrada.nextLine();
			
			
		}
			System.out.println("Introducción de notas");
			System.out.println("=====================");
			
			for(int i = 0; i < estudiantes.length;i++) {
				System.out.println("Nombre: " + estudiantes[i][0]);
				System.out.println("Exámenes: " + estudiantes[i][1]);
				System.out.println("Trabajos: " +  estudiantes[i][2]);
				System.out.println("Actitud " + estudiantes[i][3]);
				System.out.println("=====================");
			}
			
			System.out.println("Nota de evaluación");
			
			for(int i = 0; i < estudiantes.length;i++) {
				double nota = ((50 * Double.parseDouble(estudiantes[i][1]) + (40 * Double.parseDouble(estudiantes[i][2])) + (10 * Double.parseDouble(estudiantes[i][3]))) / 100);
				System.out.println(estudiantes[i][0] + ": " + nota);
				nota = 0;
			}
		
	}

}
