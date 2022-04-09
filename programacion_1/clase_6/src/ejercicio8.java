import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio8 {

    public static final int MAX = 10;

    public static final int MIN = 1;

    public static void main(String[] args) {

        char caracter;

        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un caracter");

        try {
            caracter = entrada.readLine().charAt(0);

            while ((caracter >= 'a') && ((caracter <='z'))) {

                System.out.println("Ingresar numero");

                num = Integer.valueOf(entrada.readLine());

                imprimir_tabla_de_multiplicar_de_dicho_numero(num);
            }

        }catch (Exception exc) {
            System.out.println(exc);
        }

    }

    public static void imprimir_tabla_de_multiplicar_de_dicho_numero(int num) {

        for (int multiplicador = 1; multiplicador <= MAX; multiplicador++) {

            System.out.println(num + " * " + multiplicador + " = " + (multiplicador * num));
        }
    }
}
