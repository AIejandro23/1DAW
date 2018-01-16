public class Operaciones {

	public static void main(String[] args) {
		//Ejemplos de operaciones aritmeticas

		double num1 = 230.52;
		double num2 = 500.31;

		System.out.println("Suma = " + (num1 + num2));
        
	    System.out.println("Resta =" + (num1 - num2));
        System.out.println();
		
        System.out.println("Multiplicación =" + (num1 * num2));
        System.out.println("División =" + (num1 / num2));

        System.out.println("Resto = " + (num2 % num1));
        
        
        System.out.println("--------------------------------");
        
        //Ejemplos de operadores relacionales
        
        int a = 10;
        int b = 15;
        
        System.out.println("Son iguales a y b? " + (a==b));
        System.out.println("SOn diferentes a de b? " + (a!=b));
        System.out.println("Es a menor o igual que b? " + (a<=b));
        System.out.println("ES a mayor o igual que b " + (a>=b));
        System.out.println("Es a mayor que b? " + (a>b));
        
       
	//EJemplo de comparacion de caracteres
        System.out.println("La letra x es menor que y? " + ('x'<'y'));
        
      }

}
