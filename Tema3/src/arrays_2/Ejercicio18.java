package arrays_2;

public class Ejercicio18 {

	public static void main(String[] args) {

		String notas[][] = {
				{"Jose Luis Martínez","7"},
				{"Antonia Ruiz","9"},
				{"Marcos Ramirez","10"},
				{"Juana Herranz","4"},
				{"Alberto Lopez","7"}
		};
		double total = 0;
		int posMin = 0;
		int posMax = 0;
		double aux;
		
		System.out.println("Notas");
		
		for(int i = 0;i < notas.length;i++) {
			System.out.println(notas[i][0] + ": " + notas[i][1]);
			total = total + Double.parseDouble(notas[i][1]);
		}
		for(int i = 0; i < notas.length-1;i++) {
			for(int j = i-1;j < notas.length;j++) {
				if(Double.parseDouble(notas[i][1]) < Double.parseDouble(notas[posMin][1])) {
					posMin = i;
				}
				if(Double.parseDouble(notas[i][1]) > Double.parseDouble(notas[posMax][1])) {
					posMax = i;
				}

			}
		}
		
		System.out.println("========================");
		System.out.println("Media de las notas = " +  total / notas.length);
		System.out.println("El alumno llamado " + notas[posMin][0] + " tiene una nota de " + notas[posMin][1]);
		System.out.println("El alumno llamado " + notas[posMax][0] + " tiene una nota de " + notas[posMax][1]);
	}
      
}
