
public class Caracteres {
	public static void main(String[] args) {
		
		//En el caracter2 escribo (char) delante de la suma porque al sumar el caracter + 1 me da un numero, entonces al ser char no se puede meter numeros, x 
		//eso especificamos la conversion de numero a (char).
		char caracter = 'a';
		char caracter2 = (char) (caracter + 1);
		
		System.out.println(caracter2);
		


}
	
}