import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_2_ejercicio_4 {


	public static void main(String[] args) {

		int num, anio;

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numero del mes: ");
			num = Integer.valueOf(entrada.readLine());



			switch(num){

			case 1: {
				System.out.println("Enero tiene 31 dias");
				break;
			}
			case 2: {
				System.out.println("Inserte numero de anio");
				anio = Integer.valueOf(entrada.readLine());
				if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
					System.out.println("es bisiesto, y tiene 29 dias.");
				}else {
					System.out.println("no es bisiesto y tiene 28 dias.");
				}
				break;
			}
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

        }catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
