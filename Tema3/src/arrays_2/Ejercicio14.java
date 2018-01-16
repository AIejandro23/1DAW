package arrays_2;

public class Ejercicio14 {

	public static void main(String[] args) {

		String precios[][] = {
				{"Tablet Samsung","120"},
				{"Movil Sony", "115"},
				{"Ipad Mini", "290"},
				{"Movil HTC", "95"}	
		};
		float total = 0;
		
		System.out.println("Articulos");
		System.out.println("===================");
		for(int i = 0 ; i < precios.length;i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]) ;

			total = total + Float.parseFloat(precios[i][1]);
		}
			System.out.println("===================");
			System.out.println("El precio total es = " + total);
	}

}
