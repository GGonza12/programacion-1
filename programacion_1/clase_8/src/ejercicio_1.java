	import java.util.Random;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
public class ejercicio_1 {
	 public static final int MAXFILA = 5;
	    public static final int MAXCOLUMNA = 10;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1; 

	
		    public static void main(String[] args) {
		        int [][] matint;
		        
		        matint = new int [MAXFILA][MAXCOLUMNA];
		        cargar_matriz_aleatoria_int(matint);
		        imprimir_matriz(matint);
		        invertir_matriz(matint);
		        imprimir_matriz(matint);
		        
		    }


		    public static void cargar_matriz_aleatoria_int(int [][] mat ) {
		        Random r = new Random ();
		        for (int fila = 0; fila < MAXFILA; fila++) {
		            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
		                mat [fila] [columna] = (r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
		            }
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
		    public static void invertir_matriz(int [][] mat) {
		    	for (int fila = 0; fila <MAXFILA; fila++) {
		    		invertir(mat[fila]);
		    	}		    	
		    }

		    public static void invertir(int [] arr) {
		    	 for (int x = 0; x < arr.length/2; x++) {
		    		 int temporal;
		    	      // Guardar el actual
		    	      temporal = arr[x];
		    	   // El índice de la otra mitad
		    	      int indiceContrario = (arr.length-1) - x;
		    	   // El valor actual es el valor contrario, el de la otra mitad
		    	      arr[x] = arr[indiceContrario];
		    	      // Y el de la otra mitad, es el que había en el actual originalmente
		    	      arr[indiceContrario] = temporal;
		    	      
		    	    }
		    	
		    }
}
