package arrays_2;

public class Ejercicio16 {

	public static void main(String[] args) {

		String notas[][] = {
				{"Jose Luis Martínez","7"},
				{"Antonia Ruiz","9"},
				{"Marcos Ramirez","10"},
				{"Juana Herranz","4"},
				{"Alberto Lopez","7"}
		};
		double total = 0;
		double aux;
		
		System.out.println("Notas");
		
		for(int i = 0;i < notas.length;i++) {
			System.out.println(notas[i][0] + ": " + notas[i][1]);
			total = total + Double.parseDouble(notas[i][1]);
		}
		
		
		System.out.println("========================");
		System.out.println("Media de las notas = " +  total / notas.length);
	}
      
}
