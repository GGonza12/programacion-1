import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico8 {

    public static void main(String[] args) {

        char caracter;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese un caracter");

        try {

            int cantidadvocales = 0;

            caracter = entrada.readLine().charAt(0);
            while( ((caracter >= 'a') && ((caracter <='z')))) {
                switch (caracter) {

                case 'a': { 
                    cantidadvocales= cantidadvocales +1;
                    break;
                }

                case 'e': { 
                    cantidadvocales= cantidadvocales +1;
                    break;
                }
                case 'i': { 
                    cantidadvocales= cantidadvocales +1;
                    break;
                }
                case 'o': { 
                    cantidadvocales= cantidadvocales +1;
                    break;
                }

                case 'u': { 
                    cantidadvocales= cantidadvocales +1;
                    break;
                }

                default: {
                    System.out.println("No es vocal");
                    break;
                }

                }
                caracter = entrada.readLine().charAt(0);

            }
            System.out.println(" Cantidad de vocales " + cantidadvocales);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}