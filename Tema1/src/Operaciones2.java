
public class Operaciones2 {

	public static void main(String[] args) {
		// Ejemplos de operaciones lógicas
         boolean a = true;
         boolean b = true;
         boolean c = false;
         
         //Operador AND
         System.out.println("a y b = " + (a&&b));
         
         //Operador OR
         System.out.println("a o b = " + (a||b));
         
         //Operador NOT
         System.out.println("NO a = " + (!a));
     
         //Ejemplos de orden de precedencia de los operadores
         boolean condicion1 = 2<3 && 7<8;
         System.out.println("Condición 1 = " + condicion1);
         //ES IMPORTANTE LOS PARENTESIS PORQUE AL PROGRAMAR EL CODIGO SIGUE UN ORDEN ESTABLECIDO SI NO LE PONEMOS PARENTESIS.
         boolean condicion2 = !(5<7);
         System.out.println("Condicion2 = " + condicion2);
         
         boolean condicion3 = (4<=5) || !(5>=4) == false;
         System.out.println("Condicion 3 = " + condicion3);
     
         
	}

}
