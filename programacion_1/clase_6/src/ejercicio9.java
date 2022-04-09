import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {

    public static void main(String[] args){

        int num1;
        int num2;
        char caracter;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un caracter y numeros: ");

        try {
            num1 = Integer.valueOf(entrada.readLine());
            num2 = Integer.valueOf(entrada.readLine());
            caracter = entrada.readLine().charAt(0);
            imprimir_resultado_operacion_matematica(caracter, num1, num2);

        }catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void imprimir_resultado_operacion_matematica(char caracter, int num1, int num2){

        int suma = 0, resta = 0, division = 0, mulitiplicacion = 0;

        if( caracter == 'a') {
            suma = num1 + num2;
            System.out.println("La suma es: " + suma);
        }else if (caracter == 'b'){
            resta = num1 - num2;
            System.out.println("La resta es: " + resta);
        }else if (caracter == 'c') {
            mulitiplicacion = num1*num2;
            System.out.println("La multiplicacion es: " + mulitiplicacion);
        }else if (caracter == 'd') {
            division = num1/num2;
            System.out.println("La division es: " + division);
        }

    }
}