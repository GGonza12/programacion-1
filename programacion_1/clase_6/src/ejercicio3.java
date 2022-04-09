import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3 {

    public static final int MIN = 0;

    public static final int MAX = 10;

    public static final int VALOR = 9;

    public static final int MAXMULTIPLICADOR = 10;



    public static void main(String[] args) {

        char caracter;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un caracter");

        try {
            caracter = entrada.readLine().charAt(0);

            while ((caracter >= 'a') && ((caracter <='z'))) {
                tabla_de_multiplicar_9();
                caracter = entrada.readLine().charAt(0);
            }


        }catch (Exception exc) {
            System.out.println(exc);
        }


    }
    public static void tabla_de_multiplicar_9() {

        for (int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {

            System.out.println(VALOR + " * " + multiplicador + " = " + (multiplicador * VALOR));

        }

    }


}