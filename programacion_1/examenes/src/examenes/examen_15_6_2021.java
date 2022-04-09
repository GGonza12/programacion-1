package examenes;

public class examen_15_6_2021 {
	public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 220;
    public static final int SECUENCIAFINAL = 0;
    

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	int [][] matrizint;
    	int [] arrint;
    	matrizint = new int [MAXFILA][MAXCOLUMNA];
    	arrint = new int [MAXCOLUMNA];

    	try {
    		int    inicio = 0;
    		int    fin = -1;
    		for (int fila=0;fila<MAXFILA;fila++) {
    			while ((inicio < MAXCOLUMNA- 1)) {
    				inicio = obtener_inicio_secuencia(matrizint,fin+1,fila);
    				if (inicio < MAXCOLUMNA-1) {
    					fin = obtener_inicio_secuencia(matrizint,inicio,fila); 
    					if (buscar_secuencia_ordenada(matrizint,fila,inicio,fin)==buscar_si_tiene_los_valores_3_0_5_en_la_secuencia(matrizint,fila,inicio,fin)) {
    						agregado_al_arreglo(matrizint,fila,arrint,inicio,fin);

    					}			
    				}
    			}
    		}



    	}
    	catch (Exception exc) {

    		System.out.println(exc);
    	}
    }
    public static boolean buscar_secuencia_ordenada(int [][]matriz,int fila,int inicio, int fin) {
    	int temporal= inicio;
    	while (matriz[fila][inicio] != fin) {

    		if (matriz[fila][inicio]>=temporal) {
    			temporal=inicio;
    			inicio++;
    		}

    	}
    	if (matriz[fila][inicio]==fin) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }


    public static boolean buscar_si_tiene_los_valores_3_0_5_en_la_secuencia(int[][] matriz, int fila, int inicio, int fin) {
    	int existe=0;
    	for (int i=inicio;i<fin;i++) {
    		if (matriz[fila][i]==3 || matriz[fila][i]==5) {
    			existe++;
    		} 
    	}
    	if (existe>0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public static void agregado_al_arreglo (int [][]matriz,int fila, int [] arreglo, int inicio, int fin) {
    	int arrinicio=0;
    	while (matriz[fila][inicio] != fin) {
    		arreglo[arrinicio] = matriz[fila][inicio];
    		inicio++;
    		arrinicio++;

    	}
    }


    public static int obtener_inicio_secuencia(int[][] matriz,int pos, int fila) {
    	while ((matriz[fila][pos] == 0) && (pos < MAXCOLUMNA - 1)) {
    		pos++;
    	}
    	return pos;
    }

    public static int obtener_fin_secuencia(int [][] matriz,int pos, int fila) {
    	while ((matriz[fila][pos] != 0) && (pos < MAXCOLUMNA - 1)) {
    		pos++;
    	}
    	return pos - 1;
    }

}
