package Bucles;

public class Bucles6 {

	public static void main(String[] args) {
		
		int i = 1; //Numero del que vamos a calcular la tabla
		int j;
		while(i<=10){
			i++;
			//Mostramos la tabla del numero "i"
			j = 1;	
			while(j<=10){
				System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			System.out.println();
		}
			}
}
