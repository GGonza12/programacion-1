package practico_primera_parte;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio10 {
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

		int num;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese numero entero");

		try {
			imprimir_arreglo_int(arrint);
			num = Integer.valueOf(entrada.readLine());
			buscar_numero(arrint,num);
			if ((num >= 0) && (num <= 20)) {
				buscar_posicion_de_inicio(arrint,num);
				buscar_posicion_de_final(arrint,num);
			
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
		for(int pos = num; pos >= MIN; pos--) {
			if( arrint[pos] == 0) {
				System.out.println(pos + " Es la posicion de inicio");
				pos = MIN;
			}
		}

	}

	public static void buscar_posicion_de_final(int [] arrint, int num){
		for (int pos = num; pos <= MAX; pos++){
			if(arrint[pos] == 0) {
				System.out.println( pos + " Es la posicion final");
				pos = MAX;
			}

		}
	}

}