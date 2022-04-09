import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4 {

    public static final int MAX = 200;

    public static final int MIN = 1;


    public static void main(String[] args) {

        int num; 


        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero");

        try {
            num = Integer.valueOf(entrada.readLine());

            while (num != 0) {

                imprimer_suma(num);


                num = Integer.valueOf(entrada.readLine());

            }


        }
        catch (Exception exc) {
            System.out.println(exc);
        }

    }

    public static void imprimer_suma(int num) {

        int sumatotal = 1;

        for (int sumatoria = 1; sumatoria <= 200; sumatoria++) {

            sumatotal = sumatotal + sumatoria;

        }
        System.out.println("la sumatoria es:" + sumatotal);

    }
}