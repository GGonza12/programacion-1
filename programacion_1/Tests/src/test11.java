public class test11 {

    final public static int MAXCOL = 12;
    final public static int MAXFIL = 30;
    final public static char FINALDESECUENCIA = ' ';
    
    public static void main(String[] args) {
        char [][] matA;
        matA = new char [MAXFIL][MAXCOL];
        

        try {
            for (int fila=0 ; fila < MAXFIL; fila++){
                if( cantidad_vocales(mat,fila))

            }


        }

        catch (Exception exc) {

            System.out.println(exc);
        }
    }

    public static void insertar (int[][]matA, int[][]matB,int inicio, int fila, int ultima) {
        while (matB[fila][inicio]!=0) {
            matA[fila][ultima]=matB[fila][inicio];
            inicio++;
            ultima++;
        }
    }

    public static int secuencia_tamaño_igual(char [][]matA, int fila) {

        int secuencia = 0;

        while( matA[fila][secuencia] == FINALDESECUENCIA) {

            matA[fila][secuencia] =

        }

        return 0;
    }
    public static boolean cantidad_de_vocales(char[][]matA,int fila, int inicio, int fin) {
        int vocalRepetida = 0;

        while (matA[fila][inicio]!= fin ) {

            if( matA[fila][vocalRepetida] == 'a'   matA[fila][vocalRepetida] == 'e' matA[fila][vocalRepetida] == 'i'  matA[fila][vocalRepetida] == 'o'   matA[fila][vocalRepetida] == 'u') {
            }
            vocalRepetida++;
        }

        if (matA[fila] == vocalRepetida) {
            return true ;
        }
        return false;

    }
    public static boolean comparar (char matA[][],  int fila, ) {

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
    public static int obtener_inicio_secuencia(char[][]matA, int fila){
    	int central=MAXCOL%2;
        while((central<MAXCOL)&&(matA[fila][central]==' ')){
            central--;
        }
        return central;
    }

    public static int obtener_fin_secuencia(char[][]matA ,int fila){
    	int central=MAXCOL%2;
        while((central<MAXCOL)&&(matA[fila][central]!=' ')){
            central++;
        }
        return central-1;
}
}