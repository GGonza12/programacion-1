
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class test1 {
    public static void main(String[] args) {
        final int MAXFILAS = 4;
        final int MAXCOLUMNAS = 10;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero entero :");


        

            int [][] matA;                                    //0 2 5 0 4 5 0 6 5 0     //0 2 5 0 4 5 0 6 5 0
            int [][] matB;                                    //0 2 5 0 8 5 8 6 5 0     //0 2 5 0 4 5 0 6 5 0
            matA = new int [MAXFILAS][MAXCOLUMNAS];           //0 2 0 6 4 5 7 0 5 0     //0 2 5 0 4 5 0 6 5 0
            matB = new int [MAXFILAS][MAXCOLUMNAS];           //0 2 5 6 5 5 0 6 5 0     //0 2 5 0 4 5 0 6 5 0

            for (int fila=0 ; fila < MAXFILAS; fila++){
                if(cantidadParDeImpares(matA,fila,inicioSecuencia(matA,fila)) && compararSecuencias(matA,matB,fila)){
                    eliminarSecuencia(matA,fila);
                }
            }



        }
        catch (Exception exc) {
            System.out.println(exc);
        }



    }

    public static int inicioSecuencia(int[][] matriz,int fila) {
        // retorna el indice inicial de la secuencia que tiene mas impares repetidos de un arreglo
        return 0;
    }
    public static int inicioSecuenciaPrevioCentral(int[][] matriz,int fila) {
        //obtener el obtener el indice inicial de la secuencia previa a la secuencia central
        return 0;
    }

    public static boolean compararSecuencias(int [][] matA , int [][] matB,int fila){
        int inicioPrimerSecuencia = inicioSecuencia(matA,fila); //inicio primer secuencia
        int inicioSegundaSecuencia = inicioSecuenciaPrevioCentral(matB,fila); //inicio segunda secuancia

        while(matA[fila][inicioPrimerSecuencia] == matB[fila][inicioSegundaSecuencia] && matA[fila][inicioPrimerSecuencia] != 0 && matB[fila][inicioSegundaSecuencia] != 0){
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


    public static boolean cantidadParDeImpares(int[][] matriz,int fila,int posInicioPrimerSecuencia){
        int impares=0;
        int posicion= posInicioPrimerSecuencia;
        while(matriz[fila][posicion] != 0) {
            if (matriz[fila][posicion] % 2 == 1) {
                impares++;
            }
            posicion++;
        }

        return impares % 2 == 0;
    }


    public static void eliminarSecuencia (int [][] matriz , int fila ) {
        int posicionInicial = inicioSecuencia(matriz,fila);
        while(matriz[fila][posicionInicial]!=0){
            matriz[fila][posicionInicial]=0;
            posicionInicial++;
        }
    }

}
