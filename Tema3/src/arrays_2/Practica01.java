package arrays_2;
import java.util.Scanner;
public class Practica01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	
		int user;
		boolean bucle = true;
		
		System.out.println("Piedra,papel y tijera!!!");
		
		do {
			
		int random = (int) (Math.random()*3+1);	
		
		System.out.println("----------------------");
		System.out.println("1) Piedra");
		System.out.println("2) Papel");
		System.out.println("3) Tijera");
		System.out.println("----------------------");
		System.out.println("99) Salir");
		user = entrada.nextInt();
		
			if(user == 1 && random == 3) {
				System.out.println("Enhorabuena, ganaste!");
				System.out.println("La máquina saco tijeras.");
			}else if(user == 1 && random == 2) {
				System.out.println("Já, perdiste!");
				System.out.println("La máquina sacó papel.");
			}else if(user == 1 && random == 1) {
				System.out.println("Empate!");
				System.out.println("La máquina sacó piedra.");
			}else if(user == 2 && random == 3) {
				System.out.println("Já, perdiste!");
				System.out.println("La máquina sacó tijeras.");
			}else if(user == 2 && random == 2) {
				System.out.println("Empate!");
				System.out.println("La máquina sacó papel.");
			}else if(user == 2 && random == 1) {
				System.out.println("Enhorabuena, ganaste!");
				System.out.println("La máquina saco piedra.");
			}else if(user == 3 && random == 3) {
				System.out.println("Empate!");
				System.out.println("La máquina saco tijeras.");
			}else if(user == 3 && random == 2) {
				System.out.println("Enhorabuena, ganaste!");
				System.out.println("La máquina sacó papel.");
			}else if(user == 3 && random == 1) {
				System.out.println("Já, perdiste!");
				System.out.println("La máquina sacó piedra.");
			}else if(user == 99) {
				break;
			}else if(user < 1 || user > 3) {
				System.out.println("Por favor, escribe un número valido.");
			}
			
		}while(bucle = true);
		
		
		System.out.println("FIN DEL JUEGO.");
		
		
		
}
}