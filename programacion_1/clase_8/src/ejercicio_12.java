	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Random;
public class ejercicio_12 {
	 public static final int MAXFILA = 4;
	    public static final int MAXCOLUMNA = 20;
	    public static final int MAXVALOR = 10;
	    public static final int MINVALOR = 1;
	    public static final double probabilidad_letra = 0.4;
	    public static final int MIN = 0;
	
		    public static void main(String[] args) {
		    	
		        char [][] matchar;
		        matchar = new char [MAXFILA][MAXCOLUMNA];

		        
		        
		        
		        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        
		        try {
		        	cargar_matriz_aleatorio_secuencias_char(matchar);
		        	imprimir_matriz_char(matchar);
		        	matriz_anteultima(matchar);
		        	anteultima_secuencia_matriz_char(matchar);
		        	System.out.println("Ingrese numero entero");
		        	
		        	
		        	
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
		    
		    public static void anteultima_secuencia_matriz_char (char[][]mat) {
		    	for (int fila = 0; fila <MAXFILA; fila++) {
		    		encontrar_anteultima_secuencia_fila(mat[fila]);
		    	}
		    	
		    }
		    public static void encontrar_anteultima_secuencia_fila(char[] arr) {
		        int fin = MAXCOLUMNA;
		        int inicio = MAXCOLUMNA - 1;
		        int i = 0;
		        while ((0 <= inicio)&&(i<MAXCOLUMNA)) {
		            inicio = obtener_inicio_secuencia(arr, fin - 1);
		            if (inicio >= 0) {
		                fin = obtener_fin_secuencia(arr, inicio);
		                i++;
		            }
		        }
		        System.out.println("Inicio anteultima secuencia: [" + inicio + "]");
		        System.out.println("Fin anteultima secuencia: [" + fin + "]");
		    }
	//		public static void buscar_anteultimasecuencua (char [] arrint) {
				
	//			int anteult = 0;
		//		int ejem=0;
			//	int anteultimo = 0;	
				
			//	for (int fin = MAXCOLUMNA-1; fin > MIN; fin--) {
				
//		            if (arrint[fin] == ' '){
	//	                anteult = fin-1;
		//                fin = MIN;
		  //              for (int sec = anteult; sec > MIN; sec--) {
		    //                if (arrint[sec]== ' ') {
		      //                  ejem = sec-1;
		        //                anteult = sec;
		          //              sec = MIN;
		            //            for (int o = ejem; o > MIN; o--) {
		              //              if (arrint[o]== ' ') {
		            //                    anteultimo = o;
		              //                  o = MIN;
		                //                System.out.println("la anteultima secuencia es " + anteult + " " + anteultimo );
		                  //          }
		                        
		                                        
		                 //   }
		               // }

	//	           }

		//       }
			//	}
				
				// }
		//	public static void matriz_anteultima(char[][] mat) {
			//	for (int fila=0;fila<MAXFILA;fila++) {
				//	buscar_anteultimasecuencua(mat[fila]);
	//			}
		//	} 

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