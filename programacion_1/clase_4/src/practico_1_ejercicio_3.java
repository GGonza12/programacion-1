import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_1_ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
		try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese 1 numero :");
            num1 = Integer.valueOf(entrada.readLine());
            if (((num1 % 6) == 0) && ((num1 % 7) == 0)) {
            	System.out.println(num1 + "Es multiplo de 6 y 7");
            	
            }
            else if ((num1 >=30) && ((num1 % 2)==0)) {
            	System.out.println(num1 + "es mayor a 30 y multiplo de 2");
            }
            if ((num1 / 5) > 10) {
                System.out.println("la división de " + num1 + " con 5 da un resultado mayor a 10");
            } else {
                System.out.println("No se cumple nada");
            }
		}
        catch (Exception exc) {
            System.out.println(exc);
}
	}

}
