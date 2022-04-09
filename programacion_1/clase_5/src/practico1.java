import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico1 {


    public static void main(String[] args) {
        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero");

            num = Integer.valueOf(entrada.readLine());

                while ((num < 10) && (num > 1)) {
                    if (((num % 2)== 0) && (( num % 3)==0)){
                    System.out.println(num + " es multimplo de 2 y 3.");
                    }
                    System.out.println("Ingrese un numero");
                    num = Integer.valueOf(entrada.readLine());
                }
    }
catch (Exception exc) {
    System.out.println(exc);
}
    }
}