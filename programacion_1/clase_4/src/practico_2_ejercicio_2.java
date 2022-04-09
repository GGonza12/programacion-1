import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_2_ejercicio_2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	 try {
		 
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Ingrese numero entero: ");
         num = Integer.valueOf(entrada.readLine());

         if ((num >= 0) && (num >= 100)){
             System.out.println("Grande y es positivo");

         } else if((num >= 0) && (num < 100)) {
             System.out.println("Es chico y positivo");
         }else if (((num % 2) == 0) || (num % 3) == 0){
             System.out.println("Es par o multiplo de 3.");
         }else {
             System.out.println("Ninguna de las opciones anteriores.");
         }
 }catch (Exception exc) {
     System.out.println(exc);
 }
	}

}
