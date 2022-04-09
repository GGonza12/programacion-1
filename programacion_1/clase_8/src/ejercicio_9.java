	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Random;
public class ejercicio_9 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 5;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1; 

	
		    public static void main(String[] args) {
		    	
		        int [][] matint;
		        int colum1,colum2,numfila;
		        matint = new int [MAXFILA][MAXCOLUMNA];

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatoria_int(matint);
		        	imprimir_matriz(matint);
		        	System.out.println("Ingrese numero entero");
		        	numfila = Integer.valueOf(entrada.readLine());
		        	System.out.println("Ingrese numero entero");
		        	colum1 = Integer.valueOf(entrada.readLine());
		        	System.out.println("Ingrese numero entero");
		        	colum2 = Integer.valueOf(entrada.readLine());
		        	buscar_numero_y_ordenar(matint,numfila,colum1,colum2);
		        	imprimir_matriz(matint);
		        }		       
		        catch (Exception exc) {
		            System.out.println(exc);
		        }		        
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
		    public static void corrimiento_izq_fila(int[][] mat, int fil, int num){
		    	for (int col=num;col<MAXCOLUMNA-1;col++){
		    		mat[fil][col]=mat[fil][col+1];
		    	}
		    }  
		    public static void buscar_numero_y_ordenar(int[][]mat,int fila,int colum1,int colum2) {
		    	int temp=0;	    		
		    	for(int i = colum1+1;i < colum2;i++){
		    		for (int j = colum1 ; j < colum2; j++){
		    			if (mat[fila][j] > mat[fila][j+1]){
		    				temp = mat[fila][j];
		    				mat[fila][j] = mat[fila][j+1];
		    				mat[fila][j+1] = temp;
		    			}
		    		}
		    	} 
		    	
		    }
		    
}