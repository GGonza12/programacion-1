package practico_primera_parte;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_13 {
	public static final int MAX = 20;
	public static final int MIN = 0;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
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
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Ingrese numero entero");
	
		try {
			imprimir_arreglo_int(arrint);
            num = Integer.valueOf(entrada.readLine());
            eliminar_secuencias(arrint,num);
            imprimir_arreglo_int(arrint);
            
            
            
		}
		
		catch (Exception exc) {
            System.out.println(exc);
        }
	}
		public static void imprimir_arreglo_int(int [] arr){
	        for (int pos = 0; pos < MAX; pos++){
	            System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
	        }
	    }
		public static void corrimiento_izquierda(int [] arrint, int inicio, int num){
			while (num > 0) {
	            for (int pos = inicio; pos < MAX-1; pos++) {
	                arrint[pos] = arrint[pos + 1];
	            }
	            num--;
	        }
	    }
		public static int obtener_inicio_secuencia(int[] arrint, int pos) {
	        while ((arrint[pos] == 0) && (pos < MAX - 1)) {
	            pos++;
	        }
	        return pos;
		}
		 public static int obtener_fin_secuencia(int[] arrint, int pos) {
		        while ((arrint[pos] != 0) && (pos < MAX - 1)) {
		            pos++;
		        }
		        return pos - 1;
		    }
		 public static void eliminar_secuencias(int[] arrint, int num) {
		    int inicio, fin;
		    inicio = 0;
		    fin = -1;
		    while ((inicio < MAX - 1)) {
	            inicio = obtener_inicio_secuencia(arrint, fin+1);
	            if (inicio < MAX - 1) {
	                fin = obtener_fin_secuencia(arrint, inicio);
	                if ((fin - inicio + 1) == num) {
	                	corrimiento_izquierda(arrint,inicio, num);
	                }
	            }
			 
		    }   
		 } 
}
