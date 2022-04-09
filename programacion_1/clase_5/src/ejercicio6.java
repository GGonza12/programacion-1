import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio6{

    public static void main(String[] args) {

        int num; 


        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero");
        try {
            num = Integer.valueOf(entrada.readLine());

            while (num > 0) {

                imprimir_sumatoria(num);
                num = Integer.valueOf(entrada.readLine());
            }


        }catch (Exception exc) {
            System.out.println(exc);
        }

    }

    public static void imprimir_sumatoria(int num) {

        int sumatotal = 1;

        for (int sumatoria = 1; sumatoria <= num; sumatoria++) {

            sumatotal = sumatotal + sumatoria;

        }

        System.out.println("la sumatoria es: " + sumatotal);

    }
}