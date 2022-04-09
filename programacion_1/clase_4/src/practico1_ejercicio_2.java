import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico1_ejercicio_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese dos numeros por teclado: ");
			num1 = Integer.valueOf(entrada.readLine());
			num2 = Integer.valueOf(entrada.readLine());

			if (num1 > num2) {
				System.out.println("A");
			}else if (((num1 % 2) == 0) && ((num2 % 2) == 0)) { 
				System.out.println("B");

			}else {
				System.out.println("C");
			}

		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
