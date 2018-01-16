package arrays_2;

public class Ejercicio12 {

	public static void main(String[] args) {

        int numeros[] = {8,2,10,20,12,71,15,23};
         
        int posMin = 0;
        int posMax = 0;
        int auxiliar = 0;
         
        for (int i = 0; i < numeros.length -1; i++) {
            posMin = i;
             
            for (int j = i + 1; j < numeros.length; j++) {
                if(numeros[j] < numeros[posMin]) {
                    posMin = j;
                }
            }
             
            auxiliar = numeros[i];
            numeros[i] = numeros[posMin] ;
            numeros[posMin] = auxiliar;
             
             
        }
         
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
         
         
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < numeros[posMin] ) {
                posMin = i;
            }
             
            if(numeros[i] > numeros[posMax]) {
                posMax = i;
            }
        }
        System.out.println("==============================================================================");
        System.out.println("El número atómico mas pequeño es: " + numeros[posMin]);
        System.out.println("El número atómico mas grande es: " + numeros[posMax]);
    }
 
}