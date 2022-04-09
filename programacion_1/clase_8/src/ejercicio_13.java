	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Random;
public class ejercicio_13 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 20;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1;
	    public static final double probabilidad_numero = 0.4;

	
		    public static void main(String[] args) {
		    	
		        int [][] matint;
		        int num;
		        matint = new int [MAXFILA][MAXCOLUMNA];

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatorio_secuencias_int(matint);
		        	imprimir_matriz(matint);
		        	System.out.println("Ingrese numero entero");
		        	num = Integer.valueOf(entrada.readLine());
		        	eliminar_secuencias_matriz(matint,num);
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
			public static void corrimiento_izquierda(int [] arrint, int inicio, int num){
				while (num > 0) {
		            for (int pos = inicio; pos < MAXCOLUMNA-1; pos++) {
		                arrint[pos] = arrint[pos + 1];
		            }
		            num--;
		        }
		    }
			 public static void eliminar_secuencias_arreglo(int[] arrint, int num) {
				    int inicio, fin;
				    inicio = 0;
				    fin = -1;
				    while ((inicio < MAXCOLUMNA - 1)) {
			            inicio = obtener_inicio_secuencia(arrint, fin+1);
			            if (inicio < MAXCOLUMNA - 1) {
			                fin = obtener_fin_secuencia(arrint, inicio);
			                if ((fin - inicio + 1) == num) {
			                	corrimiento_izquierda(arrint,inicio, num);
			                }
			            }
					 
				    }   
				 }
			 public static void eliminar_secuencias_matriz(int[][] mat,int num) {
				 for (int fila=0;fila<MAXFILA;fila++) {
					 eliminar_secuencias_arreglo(mat[fila],num);
				 }
			 }


		    public static void imprimir_matriz(int[][] mat) {
		        System.out.println("-------------------");
		        for (int i = 0 ; i < MAXFILA; i++){
		            for (int j = 0 ; j < MAXCOLUMNA; j++)
		            System.out.print(" "+mat[i][j]);
		            System.out.println("");
		        }

		    }
		    
		    
}