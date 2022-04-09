import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Random;
public class ejercicio_15 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 20;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1;
	    public static final double probabilidad_letra = 0.4;

	
		    public static void main(String[] args) {
		    	
		        char [][] matchar;
		        matchar = new char [MAXFILA][MAXCOLUMNA];

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatorio_secuencias_char(matchar);
		        	imprimir_matriz_char(matchar);
		        	eliminar_secuencias_descendentes_matriz(matchar);
		        	
		        	
		        	
		        }		       
		        catch (Exception exc) {
		            System.out.println(exc);
		        }		        
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
			public static void eliminar_secuencias_descendentes_matriz(char[][]matchar) {
				for(int i=0;i<MAXFILA;i++) {
					buscar_eliminar_secuencias(matchar[i]);
				}
				System.out.println("Descentes eliminadas");
				imprimir_matriz_char(matchar);
			}	
		    public static void buscar_eliminar_secuencias(char[]arr) {
				int inicio=0;
				int fin=-1;
				while(inicio<MAXCOLUMNA){
					inicio=obtener_inicio_secuencia(arr,fin+1);
					if(inicio<MAXCOLUMNA)
						fin=obtener_fin_secuencia(arr,inicio);
					if(sonDescendentes(arr,inicio,fin)&&(inicio<fin)) {
						corrimiento_izquierda(arr,inicio,fin);
						fin=inicio;
					}
				}
			}
			public static boolean sonDescendentes(char[]arr,int inicio,int fin) {
				int indice=inicio;
				while((indice<fin)&&(arr[indice]>arr[indice+1])) {
					indice++;
				}
					if(indice==fin) 
						return true;
					else
						return false;
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
