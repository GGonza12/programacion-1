import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Random;
public class ejercicio_16 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 20;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1;
	    public static final double probabilidad_letra = 0.4;

	
		    public static void main(String[] args) {
		    	
		        char [][] matchar;
		        char [][] matchar2;
		        matchar = new char [MAXFILA][MAXCOLUMNA];
		        matchar2 = new char [MAXFILA][MAXCOLUMNA];

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatorio_secuencias_char(matchar);
		        	cargar_matriz_aleatorio_secuencias_char(matchar2);
		        	imprimir_matriz_char(matchar);
		        	imprimir_matriz_char(matchar2);
		        	imprimir_matriz_mayor(matchar);
		        	
		        	eliminar_vocal_matriz(matchar, (corrimiento_izquierda(matchar)));


		        	System.out.println("Ingrese numero entero");
 	
		        }		       
		        catch (Exception exc) {
		            System.out.println(exc);
		        }		        
		    }
		    public static void agarrar_arreglo (char[][] arr) {

		    }

		    public static void cargar_matriz_aleatorio_secuencias_char(char
		    		[][] mat){
		    		for (int fila = 0; fila < MAXFILA; fila++){
		    		cargar_arreglo_aleatorio_secuencias_char(mat[fila]);
		    		}
		    		System.out.println("");
		    		}
		    public static void cargar_arreglo_aleatorio_secuencias_char(char
		    		[] arr){
		    		Random r = new Random();
		    		arr[0] = ' ';
		    		arr[MAXCOLUMNA-1] = ' ';
		    		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
		    		if (r.nextDouble()>probabilidad_letra){
		    		arr[pos]=(char)(r.nextInt(26) + 'a');
		    		}
		    		else{
		    		arr[pos]=' ';
		    		}
		    		}
		    		}
		    public static void eliminar_vocal_matriz(char [][] mat,int inicio) {
		    	for (int fila=0;fila<MAXFILA;fila++) {
		    		eliminar_vocal_arr(mat[fila],inicio);
		    	}
		    }
		    public static void eliminar_vocal_arr(char[] arr,int inicio) {
		    	inicio=obtener_inicio_secuencia(arr,inicio);
		    	
		    	for (int columna=0;columna<MAXCOLUMNA;columna++) {
		    		if ((arr[columna]=='a') || (arr[columna]=='e') || (arr[columna]=='i')|| (arr[columna]=='o')|| (arr[columna]=='u')){
		    			corrimiento_izquierda(arr,columna,inicio);
		    		}
		    	}
		    }
		    
		    public static void mayor_secuencia(char [] arr) {
		    	for (int i=0;i<MAXCOLUMNA;i++) {
		    		
		    	}
		    }
		    public static void imprimir_matriz_mayor(char [][] mat) {
		    	for (int fila=0;fila<MAXFILA;fila++) {
		    		imprimir_suma_mayor_secuencia(mat[fila]);
		    	}
		    }
		    public static int imprimir_suma_mayor_secuencia(char[] arr) {
				int inicio, fin, suma;
				inicio = 0;
				fin = -1;
				int mayorSuma = 0;
				int inicioMayor = 0;
				int finMayor = 0;
					while ((inicio < MAXCOLUMNA - 1)) {
				            inicio = obtener_inicio_secuencia(arr, fin + 1);
				            if (inicio < MAXCOLUMNA - 1) {
				                fin = obtener_fin_secuencia(arr, inicio);
				                suma = obtener_suma_secuencia(arr, inicio, fin);
				                if (suma > mayorSuma) {
				                    mayorSuma = suma;
				                    inicioMayor = inicio;
				                    finMayor = fin;
				                }
				            }
				        }
					return inicioMayor;
				}
		    public static int obtener_suma_secuencia(char[] arr, int inicio, int fin){
				int suma = 0;
				while (inicio <= fin){
					suma++;
					inicio++;
				}
				return suma;
				}
		    public static void imprimir_arreglo_secuencias_char(char [] arr){
		    	System.out.print("Arreglo de secuencias char\n|");
		    	for (int pos = 0; pos < MAXCOLUMNA; pos++){
		    		System.out.print(arr[pos]+"|");
		    	}
		    	System.out.print("\n");
		    }
		    public static void imprimir_matriz_char(char [][] mat){
		    	for (int fila = 0; fila < MAXFILA; fila++){
		    	imprimir_arreglo_secuencias_char(mat[fila]);
		    	System.out.println(""); 
		    	}
		    }
			public static void corrimiento_izquierda(char [] arrint, int inicio, int num){
				while (num > 0) {
		            for (int pos = inicio; pos < MAXCOLUMNA-1; pos++) {
		                arrint[pos] = arrint[pos + 1];
		            }
		            num--;
		        }
		    }
		    public static int obtener_inicio_secuencia(char[] arr, int inicio){
		    	while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=' ')){
		    		inicio--;
		    	}
		    	return inicio+1;
		    	}
		    
			public static int obtener_fin_secuencia(char[] arr, int inicio){
					while ((inicio < MAXCOLUMNA)&&(arr[inicio]!= ' ')){
						inicio++;	
					}
					return inicio-1;
					}		   
}

