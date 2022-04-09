package practico_primera_parte;

public class ejercicio_12 {
	public static final int MAX = 20;
	public static final int MIN = 0;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {
		
		int [] arrint = new int [MAX];
		arrint [0] = 0;
		arrint [1] = 1;
		arrint [2] = 2;
		arrint [3] = 3;
		arrint [4] = 0;
		arrint [5] = 5;
		arrint [6] = 6;
		arrint [7] = 7;
		arrint [8] = 8;
		arrint [9] = 9;
		arrint [10] = 0;
		arrint [11] = 1;
		arrint [12] = 2;
		arrint [13] = 0;
		arrint [14] = 4;
		arrint [15] = 5;
		arrint [16] = 6;
		arrint [17] = 0;
		arrint [18] = 8;
		arrint [19] = 0;
		
		imprimir_arreglo_int(arrint);
		buscar_anteultimasecuencua(arrint);
	}
		
	public static void imprimir_arreglo_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	
	public static void buscar_anteultimasecuencua (int [] arrint) {
		
		int anteult = 0;
		int ejem=0;
		int anteultimo = 0;	
		
		for (int fin = MAX-1; fin > MIN; fin--) {
		
            if (arrint[fin] == 0){
                anteult = fin-1;
                fin = MIN;
                for (int sec = anteult; sec > MIN; sec--) {
                    if (arrint[sec]== 0) {
                        ejem = sec-1;
                        anteult = sec;
                        sec = MIN;
                        for (int o = ejem; o > MIN; o--) {
                            if (arrint[o]== 0) {
                                anteultimo = o;
                                o = MIN;
                                System.out.println("la anteultima secuencia es " + anteult + " " + anteultimo );
                            }
                        
                                        
                    }
                }

           }

       }
		}
		
		 }
	public static int obtener_inicio_secuencia(int[] arr, int pos) {
        while ((arr[pos] == 0) && (pos < MAX - 1)) {
            pos++;
        }
        return pos;
	}
	 public static int obtener_fin_secuencia(int[] arr, int pos) {
	        while ((arr[pos] != 0) && (pos < MAX - 1)) {
	            pos++;
	        }
	        return pos - 1;
	    }
		
	}