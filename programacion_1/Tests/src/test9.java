public class test9 {
    final public static int MAXCOL = 4;
    final public static int MAXFIL = 10;

    public static void main(String[] args) {

        int [][] matA;
        int [][] matB;

        matA = new int [MAXFIL][MAXCOL];
        matB = new int [MAXFIL][MAXCOL];
        
        try {
        	for (int fila=0;fila<MAXFIL;fila++) {
        		
        if (buscar_diez_impares(matA,obtener_el_indice_inicial_de_la_secuencia_cuyo_impares_es_mayor_de_todas(matA,fila),fila)==true);{
        	insertar(matA,matB,obtener_el_indice_inicial_de_la_secuencia_cuyo_impares_es_mayor_de_todas(matA,fila),fila,ultima(matA,obtener_el_indice_inicial_de_la_secuencia_cuyo_impares_es_mayor_de_todas(matA,fila),fila));
        }
        	}
        }
        catch (Exception exc) {

            System.out.println(exc);
        }

    }
    public static int ultima(int [][]mat,int inicio, int fila) {
    	
    	 while(mat[fila][inicio]!=0) {
    		 inicio++;
         }
    	 int ultima=inicio;
    	 return ultima;
    }

    public static void insertar (int[][]matA, int[][]matB,int inicio, int ultima, int fila) {
    	while (matB[fila][inicio]!=0) {
    		matA[fila][ultima]=matB[fila][inicio];
    		inicio++;
    		ultima++;
    	}
           
    }

    public static boolean buscar_diez_impares(int[][]matA, int inicio, int fila) {

        int impares = 0;

            while(matA[fila][inicio] != 0) {
                if(matA[fila][inicio] % 2 == 1) {
                    impares++;
                }
                inicio++;

            }
            if(impares >= 10 ) {
                return true;
            }
                return false;
    }

    public static int obtener_el_indice_inicial_de_la_secuencia_cuyo_impares_es_mayor_de_todas(int[][]matB, int fila) {
        char indiceCeltral = 0;
        //obtener_el_indice_inicial_de_la_secuencia_cuyo_impares_es_mayor_de_todas
        return indiceCeltral;
    }
}