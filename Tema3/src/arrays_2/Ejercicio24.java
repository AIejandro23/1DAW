package arrays_2;
		
		/*
		 * 24.- Crea un array llamado huecos para ser usado en el juego del tres en raya tridimensional (3x3x3 
			posiciones). Cada posición en el array guardará el color de la bola colocada allí. 
			•Rellena aleatoriamente cada posición del array con una bola de color rojo o azul.
			•Recorre todas las posiciones mediante un bucle y cuenta el número de bolas rojas y bolas azules.
		 */
public class Ejercicio24 {

	public static void main(String[] args) {
		
		int huecos[][][] = new int[3][3][3];
		int rojo = 0;
		int azul = 0;
		
		for (int i = 0; i < huecos.length; i++) {
			for (int j = 0; j < huecos.length; j++) {
				for (int k = 0; k < huecos.length; k++) {
					huecos[i][j][k] = (int) (Math.random()*2+1);
				}
			}
		}
		for (int i = 0; i < huecos.length; i++) {
			for (int j = 0; j < huecos.length; j++) {
				for (int k = 0; k < huecos.length; k++) {
					if(huecos[i][j][k] == 1){
						rojo++;
					}else{
						azul++;
					}
				}
			}
		}
		
		System.out.println("Hay " + rojo + " bolas rojas.");
		System.out.println("Hay " + azul + " bolas azules.");
	}

}
