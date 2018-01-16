
public class SalidaDatos {

	public static void main(String[] args) {
		
		System.out.print("El lenguaje ");
        System.out.println("Java es de alto nivel");
        
        //Ejemplo concatenaciones.
        int altura = 170;
        float peso = 70.5f;
        
        float imc = 10000 * peso / (altura * altura);
        
        System.out.println("Mides = " + altura + " cm" + ",pesas = " + peso + " kg" + " y tu IMC es = " + imc + ".");
      
        //Ejemplos de caracteres de control.
        System.out.println("Vamos a escribir \nun salto de linea");
        
        System.out.println("\nFactura");
        System.out.println("--------------------------");
        System.out.println("Cod. \t Unid. \t Pund. \t Ptot");
        System.out.println("92DA \t 2 \t 15.2 \t 30.4");
        System.out.println("23UY \t 3 \t 8.5 \t 34");
        
        //Comillas
        System.out.println("Y entonces me dijo: \"adios\".");
        
        System.out.println("\nVes al siguiente directorio C:\\users\\alejandro\\documentos\\");

}
}