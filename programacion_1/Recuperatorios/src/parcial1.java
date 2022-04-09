/*
 Sea una matriz de enteros de tamanio 10*30 de secuencias de numeros pares entre 1 y 9 (por cada fila), separadas por ceros.
 La matriz esta precargada (no implementar el metodo de carga), y ademas cada fila empieza y termina con uno o mas separadores 0. Se pide realizar un programa que:
_dado un numero ingresado por el usuario, reemplace de cada secuencia el mayor valor par que posee por lo que suma el contenido de la secuencia, si dicha suma es menor al numero ingresado y el promedio entero del contenido de la secuencia es menor al mayor valor que posee la secuencia.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class parcial1 {

    public static final int MAXFIL = 10;
    public static final int MAXCOL = 30;

    public static void main(String[] args) {
        int[][] matA;
        matA = new int[MAXFIL][MAXCOL];
        int num;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
        	
            System.out.println("Enter Number");
            num = Integer.valueOf(entrada.readLine());
            for (int fila = 0; fila < MAXFIL; fila++) {
                ejecutar(matA, fila,num);
            }
        }catch (Exception exc) {
            System.out.println(exc);
        }

    }

    public static void  ejecutar (int[][]matA,int fila,int num) {
        int ini = 0;
        int fini = -1;
        while ((ini < MAXCOL - 1)) {
            ini = obtener_inicio_secuencia(matA,fini + 1,fila);
            if (ini < MAXCOL - 1) {
                fini = obtener_fin_secuencia(matA,ini,fila);
               int suma= sumarSecuencia(matA,fila,ini);
               int mayor=siEsMayor(matA,fila,ini);
               int promedio= promedioEntero(matA,fila,ini,fini,suma);
                if((suma < num) && (promedio<mayor)){
                    reemplazar(matA,ini,fila,mayor,suma);

                }
            }
            }

        }

    public  static  void  reemplazar (int[][]matA,int inicio, int fila, int mayorValor, int suma){

        while ( matA[fila][inicio] != 0){

            if (matA[fila][inicio] == mayorValor){
                matA[fila][inicio] = suma;
            }

        }

    }

    public static  int promedioEntero (int[][]matA,int fila, int inicio,int fin, int suma){

    int promedio = (suma / (fin - inicio +1));


    return promedio;
    }

    public static int siEsMayor(int[][] matA, int fila, int inicio) {

        int mayorNum = 0;

        while (matA[fila][inicio] != 0) {

            if (matA[fila][inicio] > mayorNum) {
                mayorNum = matA[fila][inicio];
            }
            inicio++;
        }
        return  mayorNum;
    }

    public  static  int  sumarSecuencia (int[][] matA,int fila,int inicio){

        int sumaSecuencia = 0;

        while (matA[fila][inicio] != 0){

            sumaSecuencia += matA[fila][inicio];

            inicio++;
        }
        return sumaSecuencia;
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