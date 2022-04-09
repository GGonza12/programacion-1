public class test4 {

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
	
	


	public static boolean impares(char matA[][], int fila, int inicio) {
		  

		int indiceconMasVocales = inicio;
		int cantidadVocalesMatA = 0;
	
		
		while (matA[fila][indiceconMasVocales]!= ' ') {
			
			if( matA[fila][indiceconMasVocales] == 'a' ||  matA[fila][indiceconMasVocales] == 'e' ||matA[fila][indiceconMasVocales] == 'i' || matA[fila][indiceconMasVocales] == 'o' ||  matA[fila][indiceconMasVocales] == 'u') {
				cantidadVocalesMatA++;
			indiceconMasVocales++;
		
		}
		

            

        }
		if (cantidadVocalesMatA % 2 == 1) {
        	return true ;
        }
        return false;
        
    } 
	
	
		public static boolean comparar (char matA[][], char matB[][],int fila) {
			char inicioPrimerSecuencia = retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_vocales(matA,fila); //inicio primer secuencia
	        char inicioSegundaSecuencia = indice_inicial_de_la_secuencia_que_mas_repite(matB,fila); //inicio segunda secuancia       
			while(matA[fila][inicioPrimerSecuencia] == matB[fila][inicioSegundaSecuencia] && matA[fila][inicioPrimerSecuencia] != ' ' && matB[fila][inicioSegundaSecuencia] != ' '){
	            //COMPARO QUE SEAN IGUALES Y QUE NINGUNO SEA 0 (PORQUE SI ES 0 TERMINARIA LA SECUENCIA)
	            inicioPrimerSecuencia++;
	            inicioSegundaSecuencia++;
	        }
	        

	        if(matA[fila][inicioPrimerSecuencia] == matB[fila][inicioSegundaSecuencia]){
	            return true;
	        }else {
	            return false;
	        }
	        
		}
	    public static void eliminarSecuencia (char [][] mat , int fila ) {
	        char posicionInicial = retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_vocales(mat,fila);
	        while(mat[fila][posicionInicial]!=' '){
	            mat[fila][posicionInicial]='a';
	            posicionInicial++;
	        }
	    }
	
	public static char indice_inicial_de_la_secuencia_que_mas_repite(char matB [][], int fila) {
		//retorna el indice  de la secuencia que le sigue a la secuencia central.
		return indiceinicial;
	}
	public static char retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_vocales(char matA[][],int fila) {
		//retorna el indice de la secuencia que tiene mas caracteres.
		return indicemayor;
	}


}
