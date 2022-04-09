/*
        Suponer que se tienen dos matrices A y B de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXFIL x MAXCOL (cada fila empieza y termina con caracteres espacios), que estan precargadas, y ademas se tiene/n el/los siguiente/s metodo/s (se supone que existe/n y esta/n implementado/s):
        _un metodo que permite obtener el indice inicial de la secuencia que le sigue a la secuencia central (central porque justo al medio del arreglo esta parte de esa secuencia) de un arreglo de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios).

        Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, ni realizar declaraciones explícitas de las matrices):
        _contenga la definicion de el/los encabezado/s de el/los metodo/s mencionado/s como preexistente/s que figura/n en el enunciado (excepto los de carga de datos en matrices, que solamente se invocan).
        _para cada fila de A elimine de cada secuencia de la fila los primeros 3 caracteres que esten incluidos en la secuencia que le sigue a la secuencia central que se encuentra de dicha fila en B.
 */

public class test8 {

    final public static int MAXCOL = 4;
    final public static int MAXFIL = 10;

    public static void main(String[] args) {
        char [][] matA;
        char [][] matB;

        matA = new char [MAXFIL][MAXCOL];
        matB = new char [MAXFIL][MAXCOL];


        try{
            for(int fila = 0; fila < MAXFIL; fila++) {
                comparar_los_tres_caracteres_principales(matA,matB,fila, obtener_el_indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(matB,fila)); 
            }


        }

        catch (Exception exc) {

            System.out.println(exc);
        }
    }
    public static void comparar_los_tres_caracteres_principales(char[][]matA, char[][]matB, int fila, int indiceCaracterDelMedio) {

        int comparacion = indiceCaracterDelMedio+3;

        int    inicio = 0;
        int    fin = -1;

        while ((inicio < MAXCOL- 1)) {
            inicio = obtener_inicio_secuencia(matA,fin+1,fila);
            int posinicio = inicio;
            if (inicio < MAXCOL-1) {
            	fin = obtener_inicio_secuencia(matA,inicio,fila);
                while(matA[fila][inicio] != comparacion && matB[inicio][indiceCaracterDelMedio]!= comparacion) {
                    if(matA [fila][inicio] == matB[fila][indiceCaracterDelMedio] ) {
                        inicio++;
                        indiceCaracterDelMedio++;
                    }

                }
                if (matA [fila][inicio] == matB[fila][indiceCaracterDelMedio]) {

                    while(matA[fila][posinicio]!= comparacion){
                        matA[fila][posinicio]='a';
                        posinicio++;
                    }

                }


            }
        }

    }
    public static int obtener_inicio_secuencia(char[][] matA, int pos , int fila) {
        while ((matA[fila][pos] == 0) && (pos < MAXCOL - 1)) {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin_secuencia(char [][] matA, int pos, int fila) {
        while ((matA[fila][pos] != 0) && (pos < MAXCOL - 1)) {
            pos++;
        }
        return pos - 1;
    }


    public static int obtener_el_indice_inicial_de_la_secuencia_que_le_sigue_a_la_secuencia_central(char[][]matB, int fila) {
        char indiceCeltral = 0;
        //obtener el indice inicial de la secuencia que le sigue a la secuencia central
        return indiceCeltral;
    }

}