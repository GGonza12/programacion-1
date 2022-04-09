import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico11 {

    public static void main(String[] args) {

        final int MAX= 10;

        int  num;

        char caracter;


        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar un caracter");

        try {
            caracter = entrada.readLine().charAt(0);

            if (( caracter >= 'a') && (caracter <= 'z')){
                System.out.println("Ingresar un numero");
                num = Integer.valueOf(entrada.readLine());

                while ((num >= 0) && (num <= 5)) {

                    for (int multiplicador=1; multiplicador <=MAX; multiplicador++) {

                        System.out.println(multiplicador +" * "+num+" = "+(multiplicador *num));
                    }
                    num = Integer.valueOf(entrada.readLine());

                }

            }


        }catch (Exception exc) {
            System.out.println(exc);
        }

    }
}