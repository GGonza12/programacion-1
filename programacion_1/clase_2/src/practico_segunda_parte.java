import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_segunda_parte {

	public static void main(String[] args) {
		double altura;
		int edad; 
		try {
		String nombre, apellido, ocupacion, direccion;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su nombre:");
			nombre = entrada.readLine();
			System.out.println ("ingrese su apellido:");
			apellido = entrada.readLine();
			System.out.println("Ingrese su ocupacion:");
			ocupacion = entrada.readLine();
			System.out.println("Ingrese su direccion:");
			direccion = entrada.readLine();
			System.out.println("Ingrese su altura:");
			 altura = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese su edad");
			 edad = Integer.valueOf(entrada.readLine());
			System.out.println("El texto es: " + nombre + " " + apellido + " " + ocupacion + " " + direccion + " " + altura + " " + edad);

		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}
}