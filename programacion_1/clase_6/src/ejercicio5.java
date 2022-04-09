import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio5 {

    public static void main(String[] args) {

        char caracter;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un caracter");

        try {
            caracter = entrada.readLine().charAt(0);

            while (caracter != '*') {

                mostrar_si_es_caracter_digito_o_caracter_letra_minuscula_y_mostrar_si_es_vocal_y_consonante(caracter);
                caracter = entrada.readLine().charAt(0);
            }

        }
        catch (Exception exc) {
            System.out.println(exc);
        }

    }public static void mostrar_si_es_caracter_digito_o_caracter_letra_minuscula_y_mostrar_si_es_vocal_y_consonante(char caracter) {

        if (((caracter >= '0') && ((caracter <= '9' ))) || ((caracter >= 'a') && ((caracter <='z')))) {

            if(((caracter >= '0') && ((caracter <= '9' )))) {
                System.out.println("es caracter digito");
            }

            else if ((caracter >= 'a') && ((caracter <='z'))){
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

                default: {
                    System.out.println("es consonante");
                    break;
                }

                }

            }
        }

    }
}
