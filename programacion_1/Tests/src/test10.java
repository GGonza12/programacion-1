/*
 Suponer que se tienen dos matrices A y B de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXFIL x MAXCOL (cada fila empieza y termina con caracteres espacios), que estan precargadas, y ademas se tiene/n el/los siguiente/s metodo/s (se supone que existe/n y esta/n implementado/s):
 _un metodo que retorna el indice inicial de la secuencia que tiene mas caracteres repetidos de un arreglo de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios).
 _un metodo que permite obtener el indice inicial de la secuencia que le sigue a la secuencia central (central porque justo al medio del arreglo esta parte de esa secuencia) de un arreglo de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios).
 Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, ni realizar declaraciones explícitas de las matrices):
  _contenga la definicion de el/los encabezado/s de el/los metodo/s mencionado/s como preexistente/s que figura/n en el enunciado (excepto los de carga de datos en matrices, que solamente se invocan).
 _en cada fila de A intercambie la secuencia con mas caracteres repetidos de la fila por la secuencia que le sigue a la secuencia central de dicha fila en B, si entre estas dos secuencias se cumple que la primera tiene mas consonantes que la segunda (la separacion previa entre secuencias debe mantenerse).
 */

public class test10 {

	final public static int MAXCOL = 4;
	final public static int MAXFIL = 10;
	final public static char FINALDESECUENCIA = ' ';

	public static void main(String[] args) {
        char [][] matA;                                    
        char [][] matB;   
        
        matA = new char [MAXFIL][MAXCOL];           
        matB = new char [MAXFIL][MAXCOL];
        
		try {
			for(int fila = 0; fila < MAXFIL; fila++) {
				if((tiene_mas_consonantes(matA, matB,fila,indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(matB[fila]),retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_caracteres(matA[fila])))==true) {
					intercambiar(matA,matB,fila,indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(matB,fila),retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_caracteres(matA,fila));
					
				}
			}
		}		      

		catch (Exception exc) {

			System.out.println(exc);
		}		       
	}
	
	
public static void intercambiar(char[][]matA, char[][]matB, int fila, int indiceCentral, int indiceCantidadImpares) {

	while (matA[fila][indiceCentral] != FINALDESECUENCIA  && matB[fila][indiceCantidadImpares] != FINALDESECUENCIA ) {

		char temporalA;
		char temporalB;
		temporalA = matA[fila][indiceCentral];
		temporalB = matB[fila] [indiceCantidadImpares];
		matA[fila][indiceCentral] =  temporalB;
		matB[fila][indiceCantidadImpares] = temporalA;

		indiceCentral++;
		indiceCantidadImpares++;

	}
}
	
	public static boolean tiene_mas_consonantes(char matA[][], char matB[][], int fila, int indiceSecuenciacentral, int indiceconMasCaracteres) {
	   
        int inicioA = indiceconMasCaracteres;
        int inicioB = indiceSecuenciacentral;
        int cantidadConsonantesMatB = 0;
        int cantidadConsonantesMatA = 0;

        while ((matA[fila][indiceconMasCaracteres]!= FINALDESECUENCIA  && matB[fila][indiceSecuenciacentral ] != FINALDESECUENCIA )) {

            if( matA[fila][indiceconMasCaracteres] != 'a' ||  matA[fila][indiceconMasCaracteres] != 'e' || matA[fila][indiceconMasCaracteres] != 'i' || matA[fila][indiceconMasCaracteres] != 'o' ||matA[fila][indiceconMasCaracteres] != 'u') {
                cantidadConsonantesMatA++;

            }
            if( matB[fila][indiceSecuenciacentral] != 'a' || matB[fila][indiceSecuenciacentral] != 'e'|| matB[fila][indiceSecuenciacentral] != 'i' || matB[fila][indiceSecuenciacentral] != 'o' || matB[fila][indiceSecuenciacentral] != 'u') {
                cantidadConsonantesMatB++;

            }
            indiceconMasCaracteres++;
            indiceSecuenciacentral++;
        }
 
        
        if (cantidadConsonantesMatA > cantidadConsonantesMatB) {
          
            return true;
        } else {
        return false;
        }
	}


	
	public static int indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(char[]matB) {
		//retorna el indice  de la secuencia que le sigue a la secuencia central.
		return 0;
	}
	public static int retorna_el_indice_inicial_de_la_secuencia_que_tiene_mas_caracteres(char[]matA) {
		//retorna el indice de la secuencia que tiene mas caracteres.
		return 0;
	}


}