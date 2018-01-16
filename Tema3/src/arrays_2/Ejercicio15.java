package arrays_2;
		/*
		 * 15.- Añade al programa anterior otro bucle que recorra el array y encuentre el menor y el mayor 
precio.
		 */
public class Ejercicio15 {

	public static void main(String[] args) {

		String precios[][] = {
				{"Tablet Samsung","120"},
				{"Movil Sony", "115"},
				{"Ipad Mini", "290"},
				{"Movil HTC", "95"}	
		};
		float total = 0;
		int posMin = 0;
		int posMax = 0;
		float aux;
		
		System.out.println("Articulos");
		System.out.println("===================");
		for(int i = 0 ; i < precios.length;i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]) ;

			total = total + Float.parseFloat(precios[i][1]);
		}
		for(int  i = 0;i < precios[i][1].length();i++) {
			
			
			if(Float.parseFloat(precios[i][1]) < Float.parseFloat(precios[posMin][1])) {
				posMin = i;
			}
			if(Float.parseFloat(precios[i][1]) > Float.parseFloat(precios[posMax][1])) {
				posMax = i;
			}
			
		}
	
			
			System.out.println("===================");
			System.out.println("El precio total es = " + total);
			System.out.println("El precio mínimo es = " + precios[posMin][1]);
			System.out.println("El precio máximo es  = " + precios[posMax][1]);
	}

}
