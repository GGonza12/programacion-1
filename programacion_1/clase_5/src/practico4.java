import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico4 {

    public static void main(String[] args) {

        int numero;


        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero");

        try {
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {

                if (numero >= 1 ) {
                	System.out.println("Ingrese otro numero");
                    
                    numero = Integer.valueOf(entrada.readLine());
                    
                }

                
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }

    }
}