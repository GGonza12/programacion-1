

public class examen3 {
	
	final public static int MAXCOL = 4;
	final public static int MAXFIL = 10;
	
	public static void main(String[] args) {
			char [][] matA;                                    
	        char [][] matB;   
	        
	        matA = new char [MAXFIL][MAXCOL];           
	        matB = new char [MAXFIL][MAXCOL];
	        
	        try {

				for (int fila=0 ; fila < MAXFIL; fila++){
	                if(impares(matA,fila,retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_vocales(matA,fila)) && comparar(matA,matB,fila)){
	                    eliminarSecuencia(matA,fila);
	                }
	            }

			}		      

			catch (Exception exc) {

				System.out.println(exc);
			}		       
	}
	
	public static void elimine_la_secuencia_con_mas_caracteres_repetidos_de_la_fila(char matA[][], int fila) {
        char posicionInicial = retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(matA[][],fila);
        while(matA[fila][posicionInicial]!=' '){
            matA[fila][posicionInicial]='a';
            posicionInicial++;
        
	}
	
}
	
	public static boolean cantidad_de_vocales(char[][]matA, char matB[][], int fila) {
		
			int indiceSecuenciaCentralMatB =  obtener_el_indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(matB,matA);
			int cantidadVocalesMatA = 0;
			int indiceConMasCaracteresRepetidosMat = retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(char matA[][]);
			int indiceconMasVocalesB = 0;
		

			while ((matA[fila][indiceConMasCaracteresRepetidosMat]!= ' ' && matA[fila][indiceconMasVocales]!= ' ' && matB[fila][indiceconMasVocales] && matB[fila][indiceConMasCaracteresRepetidosMat])) {
				
				if( matA[fila][indiceconMasVocales] == 'a' ||  matA[fila][indiceconMasVocales] == 'e' ||matA[fila][indiceconMasVocales] == 'i' || matA[fila][indiceconMasVocales] == 'o' ||  matA[fila][indiceconMasVocales] == 'u') {
					cantidadVocalesMatA++;
					indiceconMasVocales++;
			
			}
				if( matB[fila][indiceconMasVocales] == 'a' ||  matB[fila][indiceconMasVocales] == 'e' ||matB[fila][indiceconMasVocales] == 'i' || matB[fila][indiceconMasVocales] == 'o' ||  matB[fila][indiceconMasVocales] == 'u') {
					cantidadVocalesMatA++;
					indiceconMasVocales++;
			
			}
			    
	        }
			if (cantidadVocalesMatA % 2 == 1) {
	        	return true ;
	        }
	        return false;
	        
	
		
	public static int retorna_el_indice_inicial_de_la_secuencia_que_tiene_más_caracteres_repetidos_de_un_arreglo_de_secuencias(char[][]matA) {
		//retorna el indice inicial de la secuencia que tiene más caracteres repetidos de un arreglo de secuencias 
		return 0;
	}
	public static int obtener_el_indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(char[][]matB, char[][]matA) {
		// obtener el indice inicial de la secuencia que le sigue a la secuencia central
		return 0;

}
	}