package practico_primera_parte;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class ejercicio_5 {
	public static int MAX = 10;
	public static int MIN = 0;
	public static int MAXVALOR = 10;
	public static int MINVALOR = 1;

	public static void main(String[] args) {
	        int [] arrint = new int [MAX];
	        int  num, valor = 0;

	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Ingrese numero entero");

	        try {
	            cargar_arreglo_aleatorio_int(arrint);
	            imprimir_arreglo_int(arrint);
	            num = Integer.valueOf(entrada.readLine());
	            if(buscar_numero(arrint,valor,num) != -1){
	                corrimiento_izquierda(arrint, buscar_numero (arrint, valor, num)+1);
	            }
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

	        Random r = new Random();
	        for (int pos = 0; pos < MAX; pos++){
	            arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
	        }
	    }

	    public static void corrimiento_izquierda(int [] arrint, int num){
	        int indice = num;
	        while (indice <= arrint.length-1){
	            if (indice == 0) {
	                indice++;}
	            arrint[indice-1] = arrint[indice];
	            indice++;
	        }
	    }

	    public static int buscar_numero(int[] arrint, int valor, int num) {

	        for (int indice = 0; indice < arrint.length - 1; indice++) {
	            if (num == arrint[indice]) {
	                return indice;
	            }
	        }
	        return -1;
	    }
}
