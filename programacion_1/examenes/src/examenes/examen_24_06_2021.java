package examenes;

/*Se tiene una matriz MAT de enteros precargada (que no tiene igual cantidad de filas y columnas). 
 * Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, 
 * ni realizar declaraciones explicitas del/los arreglo/s y la/s matriz/ces): _no contenga metodos de carga e 
 * impresion de datos de las estructuras. _cargue en un arreglo ordenado INDICESENT (el cual esta inicializado con -1)
 *  los indices de las columnas de MAT que tienen como valor mas repetido el numero 28.
 *   El arreglo INDICESENT debe estar ordenado en todo momento de forma ascendente por la cantidad de 
 *   valores que no cumplen la condicion anterior asociadas/os a los indices que contiene. El tamanio del arreglo esta
 *    condicionado por los posibles indices de la matriz que puede mantener. Si el arreglo tiene uno o mas -1 deben quedar al final
 *     del mismo.*/
public class examen_24_06_2021 {
    public static final int MAXFIL = 25;
    public static final int MAXCOL = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] MAT;
		int [] INDICESENT;
		MAT = new int[MAXFIL][MAXCOL];
		INDICESENT = new int[MAXFIL*MAXCOL];
		
		
		ejecutar(MAT,INDICESENT);
		
	}
	public static void ejecutar (int [][] MAT,int [] arr) {
for (int colum=0;colum<MAXCOL;colum++) {
	insertar_indicice_matriz_en_arreglo(MAT,arr,colum,buscar_indice_mas_repetido_columna(MAT,colum));
		}
ordenar_arreglo_con_indice_matriz(arr);

	}
	
	public static int buscar_indice_mas_repetido_columna(int [][]MAT,int colum) {
		int mayorrep=0;
		for (int fila=0;fila<MAXFIL;fila++) {
		 	if((MAT[fila][colum]==28) && MAT[fila][colum]>mayorrep) {
		 		mayorrep = colum;
		 	}
		}
		return mayorrep;
    
    }
	
	public static void insertar_indicice_matriz_en_arreglo(int[][] matriz,int []arr, int colum, int repetida) {
   //indice_original para que mueve esas indices al final del arreglo y luego el metodo de ordenar no ordena esos -1
		int indice_original=-1;
		int final_arreglo=MAXFIL*MAXCOL;
		for (int i=0;i<(MAXFIL*MAXCOL);i++) {
			if (arr[i]==indice_original) {
				arr[final_arreglo]=indice_original;
				final_arreglo--;
			}
			arr[i]=repetida;
		}				
		}

	
	public static void ordenar_arreglo_con_indice_matriz(int[]arr) {
		int temporal=0;
		for (int i = 0;i < (MAXFIL*MAXCOL) ; i++) {
				for (int j = 0 ; j < (MAXFIL*MAXCOL - 1); j++){
					if ((arr[j] > arr[j+1]) && (arr[j]!=-1)){  /* para que no ordene los -1 */
						temporal = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temporal;
						
					}
				}
			}
		}
	
	
	
	}
	



