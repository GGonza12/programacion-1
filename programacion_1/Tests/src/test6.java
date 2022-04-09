/*
        Suponer que se tienen dos matrices A y B de secuencias (de caracteres letras minusculas separados por espacios) de tamaño MAXFIL x MAXCOL (cada fila empieza y termina con caracteres espacios), que están precargadas, y además se tiene/n el/los siguiente/s metodo/s (se supone que existe/n  y esta/n implementado/s):

        _un metodo que retorna el indice inicial de la secuencia que tiene más caracteres repetidos de un arreglo de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios).

        _un metodo que permite obtener el indice inicial de la secuencia que le sigue a la secuencia central (central porque justo al medio del arreglo esta parte de esa secuencia) de un arreglo de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios).

        Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, ni realizar declaraciones explícitas de las matrices):

        _contenga la definicion de el/los encabezado/s de el/los metodo/s mencionado/s como preexistente/s que figura/n en el enunciado (excepto los de carga de datos en matrices, que solamente se invocan).

        _para cada fila de A elimine la secuencia con mas caracteres repetidos de la fila, si la misma tiene cantidad par de vocales y ademas es igual a la secuencia que le sigue a la secuencia central de dicha fila en B.
 */
public class test6 {
	
	final public static int MAXCOL = 4;
	final public static int MAXFIL = 10;
	
	public static void main(String[] args) {
			char [][] matA;                                    
	        char [][] matB;   
	        
	        matA = new char [MAXFIL][MAXCOL];           
	        matB = new char [MAXFIL][MAXCOL];
	        
	        try {
	        	for (int fila=0 ; fila < MAXFIL; fila++){
	                if((cantidad_de_vocales(matA,fila) && comparar(matA,matB,fila,retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(matA,fila),obtener_el_indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(matB,fila)))==true){
	                	elimine_la_secuencia_con_mas_caracteres_repetidos_de_la_fila(matA,fila,retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(matA,fila));
	        	        
	                }
	        	

				
	            }

			}		      

			catch (Exception exc) {

				System.out.println(exc);
			}		       
	}
	
	public static boolean comparar (char matA[][], char matB[][], int fila, int indiceSecuenciaCentralMatB, int indiceConMasCaracteresRepetidosMat) {
		while ((matA[fila][indiceConMasCaracteresRepetidosMat] == matB[fila][indiceSecuenciaCentralMatB] && matA[fila][indiceConMasCaracteresRepetidosMat]!= ' ' && matB[fila][indiceConMasCaracteresRepetidosMat]!= ' ')) {
			indiceConMasCaracteresRepetidosMat++;
			indiceSecuenciaCentralMatB++;
				
	}
		if(matA[fila][indiceConMasCaracteresRepetidosMat] == matB[fila][indiceSecuenciaCentralMatB]) {
		
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void elimine_la_secuencia_con_mas_caracteres_repetidos_de_la_fila(char matA[][], int fila, int indiceConMasCaracteresRepetidosMat) {
		
		while(matA[fila][indiceConMasCaracteresRepetidosMat]!=' '){
			matA[fila][indiceConMasCaracteresRepetidosMat]='a';
			indiceConMasCaracteresRepetidosMat++;
	}
	
}
	
	public static boolean cantidad_de_vocales(char[][]matA,int fila) {
			int cantidadVocalesMatA = 0;
			int indiceConMasCaracteresRepetidosMat = retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(matA,fila);
		

			while (matA[fila][indiceConMasCaracteresRepetidosMat]!= ' ') {
				
				if( matA[fila][indiceConMasCaracteresRepetidosMat] == 'a' ||  matA[fila][indiceConMasCaracteresRepetidosMat] == 'e' ||matA[fila][indiceConMasCaracteresRepetidosMat] == 'i' || matA[fila][indiceConMasCaracteresRepetidosMat] == 'o' ||  matA[fila][indiceConMasCaracteresRepetidosMat] == 'u') {
					cantidadVocalesMatA++;
			}
				indiceConMasCaracteresRepetidosMat++;
			    
	        }
			
			if (cantidadVocalesMatA % 2 == 0) {
	        	return true ;
	        }
	        return false;
	}
	
	
	public static int retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(char[][]matA, int fila) {
		//retorna el indice inicial de la secuencia que tiene más caracteres repetidos de un arreglo de secuencias 
		return 0;
	}
	public static int obtener_el_indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(char[][]matB,int fila) {
		// obtener el indice inicial de la secuencia que le sigue a la secuencia central
		return 0;

}
}