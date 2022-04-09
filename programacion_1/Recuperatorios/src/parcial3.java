/*

Sea una matriz de caracteres de tamanio 12*30 de secuencias de caracteres digitos separadas por espacios.
La matriz esta precargada (no implementar el metodo de carga), y ademas cada fila empieza y termina con uno o mas separadores espacios. Se pide realizar un programa que:
por cada fila, copie (si tiene) la secuencia central (central porque justo al medio del arreglo esta parte de esa secuencia) en un arreglo de caracteres de tamanio igual a la cantidad de elementos de la matriz (inicializado con espacios).
A cada agregado en el arreglo se le debe agregar al final de la secuencia la vocal que mas se repite en la fila donde se encuentra la secuencia. El agregado en el arreglo se debe realizar de forma consecutiva de izquierda a derecha y sin separadores.

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class parcial3 {
    public static final int MAXFIL = 12;
    public static final int MAXCOL = 30;

    public static void main(String[] args) {
        char[][] matA;
        char [] arrchar;
        matA = new char[MAXFIL][MAXCOL];
        arrchar = new char[MAXFIL*MAXCOL];
        
        ejecutar(matA,arrchar);
        



    }
    
    public static void ejecutar(char[][] mat,char[] arr) {
    	
    	for (int fila=0;fila<MAXFIL;fila++) {    		
    		int inicio= obtenerInicio(mat[fila]);
        	int fin= obtenerfin(mat[fila]);
        	copiarSecuencias(mat[fila],arr,inicio,fin);
    	}
    	
    }




    public static void copiarSecuencias(char[]mat,char[]arr, int inicio, int fin) {
    	
       int arrinicio=0;
       char vocal=vocalMasRepetida(mat,inicio,fin);
       
    	while (mat[inicio]!=fin) {
    		arr[arrinicio] = mat[inicio];
    		inicio++;
    		arrinicio++;
    	}
    	if (mat[inicio]==fin) {
    		arr[arrinicio] = vocal;
    		arrinicio++;
    	}
    	
    	
    	

    }


    


    public static int obtenerInicio(char[]mat){
        int indice = MAXCOL/2;
        while ((indice >= 0) && (mat[indice])!=' '){
            indice--;

        }
        return indice + 1;

    }

    public static int obtenerfin(char[]mat){
        int  indice = MAXCOL/2;
        while ((indice <= MAXCOL) && (mat[indice]!= ' ')){
            indice++;

        }
        return indice - 1;
}


    public static char vocalMasRepetida(char[]mat,int inicio,int fin){

        int cantMayor=0;
        int cantActual=0;
        char letraMayor='x';

        cantActual = getCantidad(mat,inicio,fin,'a');
        if (cantMayor < cantActual){
            cantMayor =cantActual;
            letraMayor = 'a';
        }
        cantActual = getCantidad(mat,inicio,fin,'e');
        if (cantMayor < cantActual){
            cantMayor =cantActual;
            letraMayor = 'e';
        }
        cantActual = getCantidad(mat,inicio,fin,'i');
        if (cantMayor < cantActual){
            cantMayor =cantActual;
            letraMayor = 'i';
        }
        cantActual = getCantidad(mat,inicio,fin,'o');
        if (cantMayor < cantActual){
            cantMayor =cantActual;
            letraMayor = 'o';
        }
        cantActual = getCantidad(mat,inicio,fin,'u');
        if (cantMayor < cantActual){
            cantMayor =cantActual;
            letraMayor = 'u';
        }
        return letraMayor;

    }
    public static int getCantidad(char[]mat,int inicio, int fin, char letra){
        int cont =0;
        for (int i =inicio; i<= fin ;i++){
            if (mat[i] == letra) {
                cont ++;
            }
            

        }
        return cont;
    }
}