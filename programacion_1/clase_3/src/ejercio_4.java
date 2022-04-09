import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercio_4 {

    public static void main(String[] args) {

        int num;
        double cociente;
        boolean resultado1, resultado2, resultado3;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese numero entero");
            num = Integer.valueOf(entrada.readLine());
            resultado1 = ((num % 6) == 0) && ((num % 7) == 0);
            resultado2 = ((num > 30) && ((num % 2) == 0)) || (num <= 30);
            cociente = (num / 5);
            resultado3 = (cociente > 10);
            System.out.println ("El primero es multiplo de 6 y 7? " + resultado1);
            System.out.println ("es mayor a 30 y multiplo de 2, o es menor igual  a 30? " + resultado2);
            System.out.println ("el cociente de la division de dicho numero con 5 es mayor a 10 " + resultado3);

        }
        catch (Exception exc) {
            System.out.println(exc);
        }

    }

}