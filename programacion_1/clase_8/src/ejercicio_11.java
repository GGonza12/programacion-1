	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Random;
public class ejercicio_11 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 20;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1;
	    public static final double probabilidad_numero = 0.4;

	
		    public static void main(String[] args) {
		    	
		        int [][] matint;
		        int num,numfila;
		        matint = new int [MAXFILA][MAXCOLUMNA];

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatorio_secuencias_int(matint);
		        	imprimir_matriz(matint);
		        	System.out.println("Ingrese numero entero");
		        	numfila = Integer.valueOf(entrada.readLine());
		        	imprimir_suma_mayor_secuencia(matint[numfila]);
		        	imprimir_matriz(matint);
		        }		       
		        catch (Exception exc) {
		            System.out.println(exc);
		        }		        
		    }
		    public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
		    	for (int fila = 0; fila < MAXFILA; fila++){
		    		cargar_arreglo_aleatorio_secuencias_int(mat[fila]);
		    	}
		    	System.out.println("");
		    }
	
		    public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
		    	Random r = new Random();
				arr[0] = 0;
				arr[MAXCOLUMNA-1] = 0;
				for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
					if (r.nextDouble()>probabilidad_numero){
						arr[pos]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR); 
					}
					else{
						arr[pos]=0;				
					}
				}
			}
		    public static int obtener_inicio_secuencia(int[] arr, int inicio){
		    	while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=0)){
		    		inicio--;
		    	}
		    	return inicio+1;
		    	}
		    
			public static int obtener_fin_secuencia(int[] arr, int inicio){
					while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=0)){
						inicio++;	
					}
					return inicio-1;
					}
			public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
				int suma = 0;
				while (inicio <= fin){
					suma+=arr[inicio];
					inicio++;
				}
				return suma;
				}
			public static void imprimir_suma_mayor_secuencia(int[] arr) {
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
					System.out.println("La mayor suma de la secuencia de " + inicioMayor + " a " + finMayor + " es " + mayorSuma);
				}

		    public static void imprimir_matriz(int[][] mat) {
		        System.out.println("-------------------");
		        for (int i = 0 ; i < MAXFILA; i++){
		            for (int j = 0 ; j < MAXCOLUMNA; j++)
		            System.out.print(" "+mat[i][j]);
		            System.out.println("");
		        }

		    }
		    public static void secuencia_matriz(int[][] mat,int fila,int num) {
		    	int inicio=0;
		    	int fin=0;
		    	inicio=obtener_inicio_secuencia(mat[fila],num);
		    	fin= obtener_fin_secuencia(mat[fila],num);
		    	System.out.println("La posicion de inicio es: " +inicio+ "y la posicion final es: " +fin);
		    	
		    }
}