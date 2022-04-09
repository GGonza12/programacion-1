import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico10 {

    public static void main(String[] args) {

        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar un numero");
        try {
            num = Integer.valueOf(entrada.readLine());

            while ((num >= 1) && (num <= 12)){


            switch (num){case 1: {
                System.out.println("Enero tiene 31 dias");
                break;
            }
            case 2: {
                System.out.println("es febrero y tiene 28 dias.");
            }
            break;

            case 3: {
                System.out.println("marzo tiene 31 dias");
                break;
            }
            case 4: {
                System.out.println("abril tiene 30 dias");
                break;
            }
            case 5: {
                System.out.println("mayo tiene 31 dias");
                break;
            }
            case 6: {
                System.out.println("junio tiene 30 dias");
                break;
            }
            case 7: {
                System.out.println("julio tiene 31 dias");
                break;
            }
            case 8: {
                System.out.println("agosto tiene 31 dias");
                break;
            }
            case 9: {
                System.out.println("septiembre tiene 30 dias");
                break;
            }
            case 10: {
                System.out.println("octubre tiene 31 dias");
                break;
            }
            case 11: {
                System.out.println("noviembre tiene 30 dias");
                break;
            }
            case 12: {
                System.out.println("diciembre tiene 31 dias");
                break;
            }
            }
            num = Integer.valueOf(entrada.readLine());
        }
        }


        catch (Exception exc) {
            System.out.println(exc);
        }
    }

}