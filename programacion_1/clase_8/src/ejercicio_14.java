import java.util.Random;
public class ejercicio_14 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_letra = 0.4;
	public static void main(String[] args) {
		char [][] matchar;
		matchar = new char[MAXFILA][MAXCOLUMNA];
		char [] arrpatron={' ',' ','b',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		cargar_matriz_aleatorio_secuencias_char(matchar);
		imprimir_matriz_char(matchar);
		System.out.println("ARREGLO PATRON");
		imprimir_arreglo_secuencias_char(arrpatron);
		System.out.println("MATRIZ CON SECUENCIAS ELIMINADAS");
		recorrer_filas_matriz(matchar,arrpatron);
		imprimir_matriz_char(matchar);
		
	}
	public static void recorrer_filas_matriz(char[][]matchar,char[]arrpatron) {
		for(int i=0;i<MAXFILA;i++)
			buscar_eliminar_secuencias(matchar[i],arrpatron);
	}
	public static void buscar_eliminar_secuencias(char[]arr,char[]arrpatron) {
		int posInic,posFin;
		int posInicPatron,posFinPatron;
		posInic=0;
		posFin=-1;
		posFinPatron=-1;
		posInicPatron=obtener_inicio_secuencia(arrpatron,posFin+1);
		posFinPatron=obtener_fin_secuencia(arrpatron,posInicPatron);
		while(posInic<MAXCOLUMNA){
			posInic=obtener_inicio_secuencia(arr,posFin+1);
			if(posInic<MAXCOLUMNA)
				posFin=obtener_fin_secuencia(arr,posInic);
			if(sonIguales(arr,arrpatron,posInic,posFin,posInicPatron,posFinPatron)){
				eliminar(arr,posInic,posFin);
				posFin=posInic;
			}
		}
	}
	public static void eliminar(char[] arrenteros,int posInic,int posFin){
		int indice=posInic;
		while(indice<=posFin){
			corrimientoIzq(arrenteros,posInic);
			indice++;
		}
	}
	public static void corrimientoIzq(char[] arrenteros,int posInic){
		for(int i=posInic;i<(MAXCOLUMNA-1);i++){
			arrenteros[i]=arrenteros[i+1];
		}
		
	}
	public static boolean sonIguales(char[] arrenteros,char[]arrpatron,int posInic,int posFin,int posInicPatron,int posFinPatron){
		while((posInic<posFin)&&(posInicPatron<posFinPatron)&&(arrenteros[posInic]==arrpatron[posInicPatron])){//guarda con los rangos va hasta una posicion anterior porque en el siguiente if ya se paso
			posInic++;
			posInicPatron++;
		}
		if((posInic==posFin)&&(posInicPatron==posFinPatron)&&(arrenteros[posInic]==arrpatron[posInicPatron]))
			return true;
		else
			return false;
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
