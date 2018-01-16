package Bucles;
import java.util.*;
public class Bucles11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // Bucle infinito
        
        while(true) {
        System.out.println("Que deseas hacer?");
        System.out.println("1) una suma");
        System.out.println("2) una resta");
        System.out.println("3) una multiplicacion");
        System.out.println("4) una division");

        int operacion =scan.nextInt();
       
        // Si el codigo de operación es 0, terminamos el bucle.
        if(operacion == 0) {
        	break;
        }
        
        while(operacion>4||operacion<1){
            System.out.println("ese numero es incorrecto, introduce otro");
            operacion = scan.nextInt();
        }
        
        
        System.out.println("Ahora dime un numero:");
        int num1 = scan.nextInt();
        System.out.println("Ahora dime otro para hacer la operacion:");
        int num2 = scan.nextInt();
            
        //Ejemplo de continue
        
        switch(operacion){
        case 1:
            System.out.println(num1+num2);
            break;
        case 2:
            System.out.println(num1-num2);
            break;
        case 3:
            System.out.println(num1*num2);
            break;
        case 4:
            if(num2==0){
                System.out.println("ERROR!! No se puede dividir entre 0...");
            }else{
            System.out.println(num1/num2);
            }
            break;
        }
       
        
        
        
        
        
        }
    }        

}
