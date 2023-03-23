package sistemático;
import java.util.Scanner;
public class Sistematico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String usuario = "hola";
String password = "hello lalola";

int i = 0;

Scanner teclado = new Scanner(System.in);

while (i < 3) {
	System.out.println("Ingrese su nombre de usuario");
	String ussername = teclado.nextLine();
	
	System.out.println("Ingrese su contraseña");
	String contra = teclado.nextLine();
	
	if (ussername.equals(usuario)&&contra.equals(password)) {
	
		System.out.println("Inicio de sesión exitoso");
		return;
	} else {
		i++;
		System.out.println("Nombre se usuario o contraseña incorrectos. Intento " + i + "de 3.");
	}
}
	

System.out.println("Ha alcanzado el límite de intentos. Vuelva a intentarlo más tarde.");


teclado.close();
	}

}
