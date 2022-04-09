	import java.io.BufferedReader;
	import java.io.InputStreamReader;
public class ejercicio_7 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 5;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1; 

	
		    public static void main(String[] args) {
		    	
		        int [][] matint = { {0, 3, 5, 7, 9},{ 2, 4, 6, 8, 10},{2, 4, 6, 8, 10}, {1, 3, 6, 8,10} };
		        int num,numfila;

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {

		        	imprimir_matriz(matint);
		        	System.out.println("Ingrese numero entero");
		        	num = Integer.valueOf(entrada.readLine());
		        	System.out.println("Ingrese numero entero");
		        	numfila = Integer.valueOf(entrada.readLine());
		        	buscar_numero(matint,numfila,num);
		        	imprimir_matriz(matint);
		        }		       
		        catch (Exception exc) {
		            System.out.println(exc);
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
		    public static void corrimiento_derecha_fila(int[][] mat, int fil, int num){
                for (int col=MAXCOLUMNA-1;col>num;col--){
                    mat[fil][col]=mat[fil][col-1];
                }
            }  
		    public static void buscar_numero(int[][]mat,int fila,int num) {
		    		    		
		    	for	(int columna = 0 ; columna < MAXCOLUMNA; columna++){
		    		if (num < mat[fila][columna]) {

		    			corrimiento_derecha_fila(mat,fila,columna);
		    			mat[fila][columna]= num;
		    			columna=MAXCOLUMNA;
		    			
		    		}
		    	}
		    	
		    }
		    
}