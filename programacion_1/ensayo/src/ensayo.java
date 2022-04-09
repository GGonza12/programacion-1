import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ensayo {

	public static void main(String[] args) {
		int numero ;
		final int MAX = 50;
		
		
		try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero mayor que 0 y menor que 50");
            numero = Integer.valueOf(entrada.readLine());
            while (((numero>=0) && (numero<=50)) &&  ((numero%2)==0)) {
         
            	for(int suma = 1; suma<=MAX; suma++) {
            		
            		System.out.println(numero+suma);
            	}

            }
}
        catch (Exception exc) {
            System.out.println(exc);
}

	}

}
