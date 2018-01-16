package Bucles;
import java.util.Scanner;
public class dowhileejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 1;
		int numPares = 0;
			do {
				numPares = numPares + 2;
				System.out.println(numPares);
				i = 1 + i;
			}while(i<=25);
			}
}
