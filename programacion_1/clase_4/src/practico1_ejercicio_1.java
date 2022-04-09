import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico1_ejercicio_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char caracter;
		try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese caracter digito: ");
            caracter = entrada.readLine().charAt(0);
            if ((caracter >= '0') && (caracter <= '9'))
            		{
            	System.out.println("el caracter es digito " + caracter);
            	}
            else {
            	System.out.println("el caracter no es un digito");
            }
}
        catch (Exception exc) {
            System.out.println(exc);
}
	}

}
