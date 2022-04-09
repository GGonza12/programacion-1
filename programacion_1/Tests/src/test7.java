/*
 	Suponer que se tienen dos matrices A y B de secuencias (de enteros naturales separados por ceros) de tamanio MAXFIL x MAXCOL (cada fila empieza y termina con ceros), que estan precargadas, y ademas se tiene/n el/los siguiente/s metodo/s (se supone que existe/n y esta/n implementado/s):
 	un metodo que permite obtener el indice inicial de la secuencia previa a la secuencia central (central porque justo al medio del arreglo esta parte de esa secuencia) de un arreglo de secuencias (de enteros naturales separados por ceros) de tamanio MAXCOL (que empieza y termina con ceros).
	un metodo que retorna el indice inicial de la secuencia cuya cantidad de impares es la mayor de todas de un arreglo de secuencias (de enteros naturales separados por ceros) de tamanio MAXCOL (que empieza y termina con ceros).
    Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, ni realizar declaraciones explícitas de las matrices):
    _contenga la definicion de el/los encabezado/s de el/los metodo/s mencionado/s como preexistente/s que figura/n en el enunciado (excepto los de carga de datos en matrices, que solamente se invocan).
    _en cada fila de A intercambie la secuencia previa a la secuencia central de la fila por la secuencia con mas impares de dicha fila en B, si entre estas dos secuencias se cumple que la primera tiene menos numeros mayores que 100 que la segunda (la separacion previa entre secuencias debe mantenerse

 */
public class test7 {

	final public static int MAXCOL = 4;
	final public static int MAXFIL = 10;


	public static void main(String[] args) {

		int [][] matA;                                    
		int [][] matB;  

		matA = new int [MAXFIL][MAXCOL];           
		matB = new int [MAXFIL][MAXCOL];
		try {
			
			for (int fila=0 ; fila < MAXFIL; fila++){
				if(si_se_cumple_entre_dos_secuencias_la_primera_tiene_numeros_menos_a_100(matA,matB,obtener_el_indice_inicial_de_la_secuencia_previa_a_la_secuencia_central(matA,fila),retorna_el_indice_inicial_de_la_secuencia_cuya_cantidad_de_impares_es_la_mayor_de_todas_de_un_arreglo_de_secuencias(matB,fila),fila)==true){
					intercambiar(matA,matB,fila,obtener_el_indice_inicial_de_la_secuencia_previa_a_la_secuencia_central(matA,fila),retorna_el_indice_inicial_de_la_secuencia_cuya_cantidad_de_impares_es_la_mayor_de_todas_de_un_arreglo_de_secuencias(matB,fila));

				}

			}

		}		      

		catch (Exception exc) {

			System.out.println(exc);
		}	
	}


	
	public static void  intercambiar(int[][]matA, int[][]matB, int indiceCentral,int indiceCantidadImpares, int fila ) {


		while (matA[fila][indiceCentral] != ' ' && matB[fila][indiceCantidadImpares] != ' ') {

			int temporalA;
			int temporalB;
			temporalA = matA[fila][indiceCentral];
			temporalB = matB[fila] [indiceCantidadImpares];
			matA[fila][indiceCentral] = temporalB;
			matB[fila][indiceCantidadImpares] = temporalA;

			indiceCentral++;
			indiceCantidadImpares++;

		}
	}

	public static boolean si_se_cumple_entre_dos_secuencias_la_primera_tiene_numeros_menos_a_100(int[][]matA, int[][]matB, int indiceCentral,int indiceCantidadImpares, int fila) {
	
		int guardadCantidadmatA = 0;
		int guardadCantidadmatB = 0;
		
			while(matA[fila][indiceCentral] != 0 && matB[fila][indiceCantidadImpares] != 0) {
				
				
			
				if(matA[fila][indiceCentral] > 100) {
					guardadCantidadmatA++;
				}
			
					
				if (matB[fila][indiceCantidadImpares] > 100) {
					guardadCantidadmatB++;
				}
				
				indiceCentral++;
				indiceCantidadImpares++;
					
			}
			
			if( guardadCantidadmatA < guardadCantidadmatB ) {
				
				return true;
			}else {
				return false;
			}
			
	}
	
	
	public static int obtener_el_indice_inicial_de_la_secuencia_previa_a_la_secuencia_central(int[][]matA,int fila) {
		//retorna  el indice inicial de la secuencia previa a la secuencia central 
		int indice=0;
		return indice;
	}
	public static int retorna_el_indice_inicial_de_la_secuencia_cuya_cantidad_de_impares_es_la_mayor_de_todas_de_un_arreglo_de_secuencias(int[][]matB,int fila) {
		// retorna el indice inicial de la secuencia cuya cantidad de impares es la mayor de todas de un arreglo de secuencias
		return 0;

	}
}