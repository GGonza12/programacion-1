import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico2{

    public static void main(String[] args) {

        final int min = 0;

        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero entero");
        try {

            num = Integer.valueOf(entrada.readLine());
            do{ 
                System.out.println(num);
                num--;
            }

            while(num >= min); 

        }
        catch (Exception exc) {
            System.out.println(exc);
        }

    }
}