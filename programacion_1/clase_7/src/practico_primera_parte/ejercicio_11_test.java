
package practico_primera_parte;
import java.util.Random;
public class ejercicio_11_test {

    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        System.out.println(obtener_inicio_secuencia(arr));
        imprimir_arreglo_secuencias_int(arr);
        imprimir_suma_mayor_secuencia(arr);
        
    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > probabilidad_numero) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static void imprimir_suma_mayor_secuencia(int[] arr) {
        int inicio, fin, suma;
        inicio = 0;
        fin = -1;
        int mayorSuma = 0;
        int inicioMayor = 0;
        int finMayor = 0;
        while ((inicio < MAX - 1)) {
            inicio = obtener_inicio_secuencia(arr, fin + 1);
            System.out.println("inicio " + inicio);
            if (inicio < MAX - 1) {
                fin = obtener_fin_secuencia(arr, inicio);
               System.out.println("fin " + fin);
                suma = obtener_suma(arr, inicio, fin);
                System.out.println("suma " + suma);
                if (suma > mayorSuma) {
                    mayorSuma = suma;
                    inicioMayor = inicio;
                    finMayor = fin;
                }
            }
        }
        System.out.println("La mayor suma de la secuencia de " + inicioMayor + " a " + finMayor + " es " + mayorSuma);
    }

    public static int obtener_inicio_secuencia(char[][] matA, int pos , int fila) {
        while ((matA[fila][pos] == 0) && (pos < MAX - 1)) {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin_secuencia(char [][] matA, int pos, int fila) {
        while ((matA[fila][pos] != 0) && (pos < MAX - 1)) {
            pos++;
        }
        return pos - 1;
    }

    public static int obtener_suma(int[] arr, int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }
}