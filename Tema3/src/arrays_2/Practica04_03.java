package arrays_2;
	/*
	 * 3.- Crea un programa que tome los mismos datos que el anterior y los ordene de menor a mayor (sin
		calcular mínimo ni máximo).
	 */
public class Practica04_03 {

	public static void main(String[] args) {
		
		double valores[] = {47.5, 47.8,48,48.1,47.7,47.3,46,47.9,48.05,48.7};
		int posMin;
        double aux;
        
        for(int i = 0 ; i < valores.length ; i++){
            
            posMin = i;
            
            for (int j = i+1; j < valores.length; j++) {
                if(valores[j]<valores[posMin]){
                    posMin = j;
                }
            }
            aux = valores[i];
            valores[i] = valores[posMin];
            valores[posMin] = aux;
        
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }    
        
    }        
}