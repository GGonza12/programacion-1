import java.util.Random;
public class testing_15 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_letra = 0.4;
	public static void main(String[] args) {
		char [][] matchar;
		matchar = new char[MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_char(matchar);
		imprimir_matriz_char(matchar);
		recorrer_filas_matriz(matchar);
	}
	public static void recorrer_filas_matriz(char[][]matchar) {
		for(int i=0;i<MAXFILA;i++) {
			buscar_eliminar_secuencias(matchar[i]);
		}
		System.out.println("Descentes eliminadas");
		imprimir_matriz_char(matchar);
	}
	public static void buscar_eliminar_secuencias(char[]arr) {
		int inicio=0;
		int fin=-1;
		while(inicio<MAXCOLUMNA){
			inicio=obtener_inicio_secuencia(arr,fin+1);
			if(inicio<MAXCOLUMNA)
				fin=obtener_fin_secuencia(arr,inicio);
			if(sonDescendentes(arr,inicio,fin)&&(inicio<fin)) {
				eliminar(arr,inicio,fin);
				fin=inicio;
			}
		}
	}
	public static boolean sonDescendentes(char[]arr,int inicio,int fin) {
		int indice=inicio;
		while((indice<fin)&&(arr[indice]>arr[indice+1])) {
			indice++;
		}
			if(indice==fin) 
				return true;
			else
				return false;
			}
	public static void eliminar(char[] arr,int inicio, int fin){
		int indice = inicio;
		while(indice<=fin) {
			corrimientoIzq(arr,inicio);
			indice++;
		}
		
	}
	public static void corrimientoIzq(char[]arr,int inicio) {
		for(int i=inicio;i<(MAXCOLUMNA-1);i++) {
			arr[i]=arr[i+1];
		}
	}
	public static int obtener_inicio_secuencia(char[]arr,int pos){
		while((pos<MAXCOLUMNA)&&(arr[pos]==' ')){
			pos++;
		}
		return pos;
	}
	
	public static int obtener_fin_secuencia(char[]arr ,int pos){
		while((pos<MAXCOLUMNA)&&(arr[pos]!=' ')){
			pos++;
		}
		return pos-1;
	}
	public static void cargar_matriz_aleatorio_secuencias_char(char[][] mat) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			cargar_arreglo_aleatorio_secuencias_char(mat[fila]);
		}
		System.out.println("");
	}

	public static void cargar_arreglo_aleatorio_secuencias_char(char[] arr) {
		Random r = new Random();
		arr[0] = ' ';
		arr[MAXCOLUMNA - 1] = ' ';
		for (int pos = 1; pos < MAXCOLUMNA - 1; pos++) {
			if (r.nextDouble() > probabilidad_letra) {
				arr[pos] = (char) (r.nextInt(26) + 'a');
			} else {
				arr[pos] = ' ';
			}
		}
	}

	public static void imprimir_matriz_char(char[][] mat) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			imprimir_arreglo_secuencias_char(mat[fila]);
			System.out.println("");
		}
	}

	public static void imprimir_arreglo_secuencias_char(char[] arr) {

		for (int pos = 0; pos < MAXCOLUMNA; pos++) {
			System.out.print(arr[pos] + "|");
		}
		System.out.print("\n");
	}
}
