package practico_primera_parte;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_11 {
	public static int MAX = 20;
	public static int MIN = 0;
	public static int MAXVALOR = 20;
	public static int MINVALOR = 1;
	public static void main(String[] args) {

		int [] arrint = new int [MAX];
		arrint [0] = 0;
		arrint [1] = 1;
		arrint [2] = 2;
		arrint [3] = 3;
		arrint [4] = 0;
		arrint [5] = 5;
		arrint [6] = 6;
		arrint [7] = 7;
		arrint [8] = 8;
		arrint [9] = 9;
		arrint [10] = 0;
		arrint [11] = 1;
		arrint [12] = 2;
		arrint [13] = 0;
		arrint [14] = 4;
		arrint [15] = 5;
		arrint [16] = 6;
		arrint [17] = 0;
		arrint [18] = 8;
		arrint [19] = 0;

		int num,posfinal,posinicio,suma_total,primero=0,pablito=0,sum1=1,segundo=0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese numero entero");

		try {
			imprimir_arreglo_int(arrint);
			num = Integer.valueOf(entrada.readLine());
			buscar_numero(arrint,num);
			if ((num >= 0) && (num <= 20)) {
				
				suma_mayor(arrint,pablito,primero,sum1,segundo);
			
			}
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public static void imprimir_arreglo_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static int buscar_numero(int[] arrint,int num) {

		for (int indice = 0; indice < arrint.length - 1; indice++) {
			if (num == arrint[indice]) {
				return indice;
			}
		}
		return -1;
	}
	public static void buscar_posicion_de_inicio(int [] arrint, int num){
		int posinicio;
		for(int inicio = num; inicio >= MIN; inicio--) {
			if( arrint[inicio] == 0) {
				posinicio = inicio;
				System.out.println(posinicio + " Es la posicion de inicio");
				inicio = MIN;
			}
		}
	}
	public static void buscar_posicion_de_final(int [] arrint, int num){
		int posfinal;
		for (int fin = num; fin <= MAX; fin++){
			if(arrint[fin] == 0) {
				posfinal = fin;
				System.out.println( posfinal + " Es la posicion final");
				fin = MAX;
			}
		}
	}
	public static void getStartingPositionSequenceArray(int [] arrint) {
		for(int startingPosition = 0; startingPosition <= MAX; startingPosition++) {
        while (arrint[startingPosition] != 0) {
            startingPosition--;
        }
        
        return startingPosition;
		}
    }
	public static int getFinalPositionSequenceArray(int [] array, int startingPosition) {
        while (array[startingPosition] != 0) {
            startingPosition++;
        }
        int finalPosition = startingPosition - 1;
        return finalPosition;
    }

    public static void getSumSequenceArray(int [] array) {
        int higherSum = 0;
        int start = 0;
        int fin = 0;
        int position = 0;
        int startingPosition = getStartingPositionSequenceArray(array,position);
        while (startingPosition < MAX) {
            int finalPosition = getFinalPositionSequenceArray(array,startingPosition);
            int sum = 0;
            for (int i = startingPosition; i <= finalPosition; i++){
                sum+= array[i];
            }
            if (sum > higherSum) {
                higherSum = sum;
                start = startingPosition;
                fin = finalPosition;
            }
            System.out.println("La suma de la secuencia de " + startingPosition + " hasta " + finalPosition + " es: " + sum);
            position = finalPosition + 1;
            if (position < MAX - 1) {
                startingPosition = getStartingPositionSequenceArray(array,position);
            } else {
                break;
            }
        }
        System.out.println("La suma de los valores de la secuencia entre posiciones " + start + " y " + fin + " es la más grande.");
    } 
}