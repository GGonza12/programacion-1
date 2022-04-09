package practico_primera_parte;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_9 {
	public static int MAX = 10;
	public static int MIN = 0;
	public static int MAXVALOR = 10;
	public static int MINVALOR = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pares;
		int todos=0;
		pares = new int [MAX];
			int [] arrint;  
			arrint = new int [MAX]; 
			arrint [0] = 1;
			arrint [1] = 4;
			arrint [2] = 3;
			arrint [3] = 9;
			arrint [4] = 2;
			arrint [5] = 8;
			arrint [6] = 0;
			arrint [7] = 6;
			arrint [8] = 7;
			arrint [9] = 10;

			int  num,num2;

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numero entero");

			try {
				imprimir_arreglo_int(arrint);
				num = Integer.valueOf(entrada.readLine());
				if(buscar_numero_igual_y_ordernar(arrint,num) != -1){
					corrimiento_derecha(arrint, buscar_numero_igual_y_ordernar (arrint,num)+1);
				}
				imprimir_arreglo_int(arrint);
				System.out.println("Ingrese numero entero");
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
			while (num < indice){
				arrint[indice] = arrint[indice-1];
				indice--;
			}
		}

		public static int buscar_numero_igual_y_ordernar(int []arrint, int num){
			for (int indice = 0; indice < arrint.length - 1; indice++) {
				if (arrint[indice] >= num) {
					arrint[indice]=num;
					
					
					return indice;

			}
				
			

		}
			
			return -1;
		}
		
	}