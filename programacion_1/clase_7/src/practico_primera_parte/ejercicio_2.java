package practico_primera_parte;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_2 {
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
            buscar_si_es_par(arrint);
            
            	 
        }

        catch (Exception exc) {
            System.out.println(exc);
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
    public static void buscar_si_es_par(int [] arr) {
    	for (int pos = 0; pos < MAX; pos++){
    		if ((arr[pos] % 2)==0) {
            System.out.println("En la posicion " + pos + " " + "El numero par del arregilo es: " + arr[pos]);
        }
    	}
    }
}
    
