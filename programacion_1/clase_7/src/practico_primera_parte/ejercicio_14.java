package practico_primera_parte;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_14 {
	public static final int MAX = 20;
	public static final int MIN = 0;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
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
		int [] arreglocopia = new int [MAX];
		arrint [0] = 0;
		arrint [1] = 7;
		arrint [2] = 4;
		arrint [3] = 5;
		arrint [4] = 2;
		arrint [5] = 0;
		arrint [6] = 1;
		arrint [7] = 2;
		arrint [8] = 0;
		arrint [9] = 8;
		arrint [10] = 4;
		arrint [11] = 5;
		arrint [12] = 0;
		arrint [13] = 6;
		arrint [14] = 8;
		arrint [15] = 7;
		arrint [16] = 5;
		arrint [17] = 0;
		arrint [18] = 8;
		arrint [19] = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Ingrese numero entero");
	
		try {
			imprimir_arreglo_int(arrint);
			imprimir_arreglo_int(arreglocopia);
			
            num = Integer.valueOf(entrada.readLine());
            
            
            
            
		}
		
		catch (Exception exc) {
            System.out.println(exc);
        }
	}
	public static void imprimir_arreglo_int(int [] arr){
        for (int pos = 0; pos < MAX; pos++){
        	
            System.out.println("["+arr[pos]+"] ");
            System.out.println("\t");
            
        }
        
    }

	}


