package practico_primera_parte;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_1 {

    public static int MAX = 10;
    public static int MIN = 0;
    public static int MAXVALOR = 10;
    public static int MINVALOR = 1;
    


    public static void main(String[] args) {
        int [] arrint = new int [MAX];
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese numero entero");

        try {
            
            cargar_arreglo_aleatorio_int(arrint);
            imprimir_arreglo_int(arrint);
            pos = Integer.valueOf(entrada.readLine());
            invertir(arrint);
            imprimir_arreglo_int(arrint);
    	 
        }

        
    }

    public static void imprimir_arreglo_int(int [] arr){
        for (int pos = 0; pos < MAX; pos++){
            System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
        }
    }

    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
            arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);

        }
    }
    public static void invertir(int [] arr) {
    	 for (int x = 0; x < arr.length/2; x++) {
    		 int temporal;
    	      // Guardar el actual
    	      temporal = arr[x];
    	   // El índice de la otra mitad
    	      int indiceContrario = (arr.length-1) - x;
    	   // El valor actual es el valor contrario, el de la otra mitad
    	      arr[x] = arr[indiceContrario];
    	      // Y el de la otra mitad, es el que había en el actual originalmente
    	      arr[indiceContrario] = temporal;
    	      
    	    }
    }
}

