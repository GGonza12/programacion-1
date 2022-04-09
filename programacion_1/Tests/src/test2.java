public class test2 {

    final public static int MAXCOL = 5;
    final public static int MAXFIL = 3;

    public static void main(String[] args) {

        char[][] matA = {{'a', 'b', 'c', 'd', 'e'},

                		{' ', 'h', 'm', 'a', ' '},

                		{'k', 'c', 'n', 'n', 'l'}};


        char[][] matB = {{'a', 'e', 'i', 'o', 'u'},

                {'z', 'a', 'f', 'j', 'l'},

                {'x', 'y', 'o', 'p', 'q'}};

        imprimir_matriz(matA);
        imprimir_matriz(matB);
        intercambio(matA,matB); 
        imprimir_matriz(matA);
        imprimir_matriz(matB);

    }

    public static void intercambio(char matA[][],char matB[][]) {
        for (int f = 0; f < MAXFIL; f++) 
            for (int i = 0; i < MAXCOL; i++) {
                char temporalA;
                char temporalB;
                // Guardar el actual
                temporalA = matA[f][i];
                temporalB = matB[f][i];
                // El índice de la otra mitad
                // El valor actual es el valor contrario, el de la otra mitad
                matA[f][i] = temporalB;
                matB[f][i] = temporalA;
                // Y el de la otra mitad, es el que había en el actual originalmente

            }
        }
    
    public static void imprimir_matriz(char matA[][]) {
        System.out.println("-------------------");
        for (int i = 0 ; i < MAXFIL; i++){
            for (int j = 0 ; j < MAXCOL; j++)
                System.out.print(" "+matA[i][j]);
            System.out.println("");
        }

    }
}