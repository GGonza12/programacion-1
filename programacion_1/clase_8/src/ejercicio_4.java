	import java.util.Random;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
public class ejercicio_4 {
	 public static final int MAXFILA = 5;
	    public static final int MAXCOLUMNA = 10;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1; 

	
		    public static void main(String[] args) {
		        int [][] matint;
		        int num1,num2,num3;
		        matint = new int [MAXFILA][MAXCOLUMNA];
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatoria_int(matint);
		        	imprimir_matriz(matint);
		        	System.out.println("Ingrese numero entero");
		        	num1 = Integer.valueOf(entrada.readLine());
		        	System.out.println("Ingrese numero entero");
		        	num2 = Integer.valueOf(entrada.readLine());
		        	System.out.println("Ingrese numero entero");
		        	num3 = Integer.valueOf(entrada.readLine());
		        	corrimiento_derecha_fila_y_agregar(matint,num1,num2,num3);
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
		    
		    public static void corrimiento_derecha_fila_y_agregar(int[][] mat, int fil, int num,int num3){
		        
		    	for (int col=MAXCOLUMNA-1;col>num;col--){
		    		mat[fil][col]=mat[fil][col-1];
		    	}
		    	mat[fil][num]=num3;
		    }   
		    

		  
}