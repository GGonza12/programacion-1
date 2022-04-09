import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_2_ejercicio_3 {

    public static void main(String[] args) {

        char caracter;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter:");
            caracter = entrada.readLine().charAt(0);
            if ((caracter >= '0' ) && (caracter <= '9')){
                System.out.println("Es digito");
            }
            else if ((caracter >= 'a' ) && (caracter <= 'z')) {
                System.out.println("Es caracter minuscula");
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

            default:{
                System.out.println("Es consonante");
            }

            }
        }

    }catch (Exception exc) {
        System.out.println(exc);
        }
    }

}
