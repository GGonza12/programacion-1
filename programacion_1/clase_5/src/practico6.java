/*
Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico6 {

    public static void main(String[] args) {


        final int MAX = 10;

        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese numero entero");

        try {
            num = Integer.valueOf(entrada.readLine());
            while ((num >= 1) && (num <= 10)){

                for ( int contador = 0; num <= MAX; contador++){
                    System.out.println("El contador es: " + contador);
                    num = Integer.valueOf(entrada.readLine());
                }
            }


        }
        catch (Exception exc) {
            System.out.println(exc);

        }
    }
}
