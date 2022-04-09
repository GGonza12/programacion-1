import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico7 {

    public static void main(String[] args) {


        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese numero entero");

        try {
            num = Integer.valueOf(entrada.readLine());
            int sumatotal = 0;
            int cantsumas= 0;
            while ((num >= 1) && (num <= 10)) {
                cantsumas= cantsumas +1;
                sumatotal= sumatotal + num;
                System.out.println("Ingrese un numero entero");
                num= Integer.valueOf(entrada.readLine());
            }

            System.out.println("Se realizaron " + cantsumas+" sumas");
            System.out.println("La suma total es: " + sumatotal);
            System.out.println("promedio es " + sumatotal/cantsumas);


        }catch (Exception exc) {
            System.out.println(exc);

        }

    }
}

