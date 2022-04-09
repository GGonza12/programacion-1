	import java.util.Random;
public class ejercicio_2 {
	 public static final int MAXFILA = 5;
	    public static final int MAXCOLUMNA = 10;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1; 

	
		    public static void main(String[] args) {
		        int [][] matint;
		        
		        matint = new int [MAXFILA][MAXCOLUMNA];
		        cargar_matriz_aleatoria_int(matint);
		        imprimir_matriz(matint);
		        pares_en_matriz(matint);

		        
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
		    public static void pares_en_matriz(int[][] mat) {
		    	int cantidad=0;
		    	for (int filas=0; filas < MAXFILA; filas++) {
		    		cantidad += cantidad_de_pares(mat[filas]);
		    		
		    	}
		    	System.out.println(cantidad);
		    }
		    public static int cantidad_de_pares(int[] mat) {
		    	int pares=0;		    	
		    	for (int columna=0;columna <MAXCOLUMNA; columna++)	 {
		    		if ((mat[columna] % 2)==0) {
		    			pares++;
		    			
		    		}
		    		
		    	
		    
		    }
		    	return pares;
		    }

		  
}