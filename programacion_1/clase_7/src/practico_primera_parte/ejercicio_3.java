package practico_primera_parte;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_3 {
    public static int MAX = 10;
    public static int MIN = 0;
    public static int MAXVALOR = 10;
    public static int MINVALOR = 1;

    public static void main(String[] args) {
        int [] arrint = new int [MAX];
        int valor, num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese numero entero");

        try {
            cargar_arreglo_aleatorio_int(arrint);
            imprimir_arreglo_int(arrint);
            valor = Integer.valueOf(entrada.readLine());
             corrimiento_izquierda(arrint, valor);
           //  corrimiento_derecha(arrint, valor);
            imprimir_arreglo_int(arrint);
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

        for (int pos = 0; pos < MAX; pos++){
            arr[pos] = pos;
        }
    }

    public static void corrimiento_izquierda(int [] arrint, int valor){
        int indice = valor;
        if (indice == 0) {
            indice++;
        }
        while (indice <= arrint.length-1){
            arrint[indice-1] = arrint[indice];
            indice++;
        }
    }

    public static void corrimiento_derecha(int [] arrint, int valor){
        int indice = arrint.length-1;
        if (indice == arrint.length-1) {
            indice--;
        }
        while (indice >= valor){
            arrint[indice+1] = arrint[indice];
            indice--;
        }
    }
}