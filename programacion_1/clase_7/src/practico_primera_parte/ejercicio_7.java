package practico_primera_parte;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_7 {

	public static int MAX = 10;
	public static int MIN = 0;
	public static int MAXVALOR = 10;
	public static int MINVALOR = 1;

	public static void main(String[] args) {
		int [] arrint;  
		arrint = new int [MAX]; 
		arrint [0] = 1;
		arrint [1] = 2;
		arrint [2] = 3;
		arrint [3] = 4;
		arrint [4] = 5;
		arrint [5] = 6;
		arrint [6] = 7;
		arrint [7] = 8;
		arrint [8] = 9;
		arrint [9] = 10;
		
		int  num;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese numero entero");

		try {
			imprimir_arreglo_int(arrint);
			num = Integer.valueOf(entrada.readLine());
			if(buscar_numero_igual_y_ordernar(arrint,num) != -1){
				corrimiento_derecha(arrint, buscar_numero_igual_y_ordernar (arrint,num)+1);
			}
			imprimir_arreglo_int(arrint);
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

	public static void corrimiento_derecha(int [] arrint, int num){
		int indice = arrint.length-1;
		if (indice == arrint.length-1) {
			indice--;
		}
		while (indice >= num){
			arrint[indice+1] = arrint[indice];
			indice--;
		}
	}
	
	public static int buscar_numero_igual_y_ordernar(int []arrint, int num){
		for (int indice = 0; indice < arrint.length - 1; indice++) {
			if (arrint[indice] >= num) {
				indice--;
				return indice;
				
				}
	
		}
		return -1;
	}
}