import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico9 {

    public static void main(String[] args) {

        final char MIN = 'a';

        final char  MAX = 'z';

        char caracter;

        char menor = MAX;

        char mayor = MIN;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un caracter");

        try {
            caracter = entrada.readLine().charAt(0);

            while ((caracter >= 'a') && ((caracter <='z'))){

                if ( caracter < menor) {

                    menor = caracter;



                } else if ( caracter > mayor) {
                    mayor = caracter;
                }
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
            }

        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        if ( menor != MAX) {
            System.out.println("El menor ingresado es: " + menor);
            System.out.println("El mayor ingresado es: " + mayor);
        }
    }

}
