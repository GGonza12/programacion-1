import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico3 {

    public static void main(String[] args) {

        char caracter;


        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un caracter");

        try {
            caracter = entrada.readLine().charAt(0);
            while (caracter != '*') {

                if ((caracter >= '0') && ((caracter <='9' ))) {
                    System.out.println("es caracter digito");
                    caracter = entrada.readLine().charAt(0);
                }

                else {
                    switch (caracter) {


                    case 'a': { System.out.println("Es vocal a");


                    break;
                    }

                    case 'e': { System.out.println("Es vocal e");


                    break;
                    }
                    case 'i': { System.out.println("Es vocal i");


                    break;
                    }
                    case 'o': { System.out.println("Es vocal o");


                    break;
                    }

                    case 'u': { System.out.println("Es vocal u");

                    break;
                    }

                    }

                    caracter = entrada.readLine().charAt(0);
                    
                }
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }

    }
}