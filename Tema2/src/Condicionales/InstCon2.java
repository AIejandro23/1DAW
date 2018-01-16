package Condicionales;

		/*2.- Vamos a perfeccionar la aplicaci�n anterior pidiendo un nombre de usuario y una contrase�a
		 * para permitir el acceso al ordenador.El programa guardar� el nombre de usuario y la contrase�a 
		 * necesarias en las constantes NOMBRE_REQUERIDO, PASSWORD_REQUERIDO.
		 *	Si el nombre de usuario y la contrase�a introducidas coinciden con los de estas constantes,
		 *aparecer� el mensaje "Acceso permitido". En caso contrario se escribir� "Acceso denegado"
		 */
		 import java.util.Scanner;
public class InstCon2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final String NOMBRE_REQUERIDO;
		final String PASSWORD_REQUERIDO;
		
		System.out.println("REGISTRO");
		System.out.println("Introduce un nombre de usuario");
		NOMBRE_REQUERIDO = entrada.nextLine();
		
		System.out.println("Introduce una contrase�a");
		PASSWORD_REQUERIDO = entrada.nextLine();
		
		System.out.println("INICIA SESI�N");
		System.out.println("Introduzca su nombre de usuario");
		String nombre = entrada.nextLine();
		
		System.out.println("Introduzca su contrase�a");
		String contraseña = entrada.nextLine();
		
		if(nombre.equals(NOMBRE_REQUERIDO) && contraseña.equals(PASSWORD_REQUERIDO)) {
			System.out.println("Acceso permitido");
		}else {
			System.out.println("Acceso denegado");
		}
		
			}
}
