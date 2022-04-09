/*
Se tiene una matriz de enteros de tamanio 200*200 de secuencias de numeros impares distintos de 0, que estan separadas por 0.
La matriz esta precargada (no implementar el metodo de carga), y ademas cada fila empieza y termina con uno o mas separadores 0. Se pide realizar un programa que:
para cada secuencia inserte al principio de la misma el valor correspondiente a la suma de los valores impares de la secuencia que son mayores a 100, si se cumple que dicha secuencia no esta ordenada de forma descendente.
Suponer que cada fila de la matriz tiene espacio para agregar esos valores.
*/
public class parcial2 {

        public static final int MAXFIL = 10;
        public static final int MAXCOL = 30;

        public static void main(String[] args) {
            int[][] matA;
            matA = new int[MAXFIL][MAXCOL];
            for (int fila = 0; fila < MAXFIL; fila++){
                ejecutar(matA,fila);
            }
        }

public  static  void  ejecutar (int[][]matA, int fila){

            int ini = 0;
            int fini = -1;

    while (ini  < MAXCOL-1){
        ini = obtener_inicio_secuencia(matA,fini,fila);
        if (ini < MAXCOL - 1) {
            fini = obtener_fin_secuencia(matA, ini, fila);
        }
        int valor = sumaValoresImpares(matA,fila,ini,fini);
        boolean desordenada = metodoVerificarOrdenadamientoNoDescendiente(matA,fila,fini);
        if ( desordenada == true) {
            
            corrimientoDerechaYinsertar(matA,fila,valor,ini);
        }
    }

}

public  static  boolean metodoVerificarOrdenadamientoNoDescendiente(int[][]matA, int fila, int fin){

            while ((matA[fila][fin] < matA[fila][fin-1]) && (matA[fila][fin] != 0)) {
                    fin--;
            }

    if (matA[fila][fin] == 0) {
        return false;
    } else {
        return true;
    }
}

public  static  int  sumaValoresImpares(int[][]matA, int fila,int inicio, int fin){

      int sumaValores = 0;

      while (matA[fila][inicio] != 0 && matA[fila][inicio] > 100){

          sumaValores += matA[fila][inicio];

          inicio++;
      }

return sumaValores;

}

public static  void corrimientoDerechaYinsertar (int[][]matA, int fila, int suma,int pos){

    int indice = MAXCOL-1;

    while (indice > pos){

        matA[fila][indice] = matA[fila][indice-1];

            indice--;

            
    }
    if (matA[fila][indice] == 0){

        matA[fila][indice] = suma;
    }


}

    public static int obtener_inicio_secuencia(int[][]matA,int pos, int fila) {

        while ((matA[fila][pos] == ' ') && (pos < MAXCOL - 1)) {
            pos++;
        }

        return pos;

    }

    public static int obtener_fin_secuencia(int[][]matA,int pos, int fila) {

        while ((matA[fila][pos] != ' ') && (pos < MAXCOL - 1)) {

            pos++;

        }

        return pos - 1;

    }

}