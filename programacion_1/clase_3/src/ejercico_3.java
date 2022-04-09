import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercico_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		boolean resultado1, resultado2;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese dos numeros enteros");
            num1 = Integer.valueOf(entrada.readLine());
            num2 = Integer.valueOf(entrada.readLine());

            resultado1 = (num1 > num2);
            resultado2 = ((num1 % 2 ) == 0) && ((num2 % 2 ) == 0);

            System.out.println("El primer numero es mayor que el segundo? " + resultado1);
            System.out.println("Ambos son multiplos de dos? " + resultado2 );
		}
		 catch (Exception exc) {
	            System.out.println(exc);
	}
	}

}
