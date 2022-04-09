import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio11 {

	public static final int MAX = 10;
	public static final int MIN = 1;


	public static void main(String[] args) {
		int num;
		char caracter;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un numero: ");

		try {
			num = Integer.valueOf(entrada.readLine());
			while ((num >=1 )&& (num <= 10)){

				if ((num % 3) == 0){

					System.out.println("Ingrese un caracter: ");
					caracter = entrada.readLine().charAt(0);
					imprimir_informacion(caracter, num);
				} else if ((num % 5)== 0) {
					imprimir_tabla_de_multiplitacar(num);
					caracter = entrada.readLine().charAt(0);
				}
			}
			caracter = entrada.readLine().charAt(0);

		}catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void imprimir_informacion(char caracter,  int num) {

		if ((caracter >= 'a') && ((caracter <='z'))) {
			System.out.println("caracter minuscula del abecedario: " + caracter);

		}
		else if ((caracter >= 'A') && ((caracter <='Z'))){
			System.out.println("caracter  mayuscula del abecedario: " + caracter);
		}
		else if((caracter >= '0') && ((caracter <='9'))){
			System.out.println("es caracter digito: " + caracter);
			
		}else  {
			System.out.println("otro: " + caracter);
		}
		
	}
	public static void imprimir_tabla_de_multiplitacar(int num) {

		for (int multiplicador = 1; multiplicador <= MAX; multiplicador++) {

			System.out.println(num + " * " + multiplicador + " = " + (multiplicador * num));
		}
	}
}