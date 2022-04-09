
		import java.io.BufferedReader;
		import java.io.InputStreamReader;
public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		double resultado1, resultado2, resultado3;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("ingrese un numero");
		    numero = Integer.valueOf(entrada.readLine());
		    resultado1 = numero % 2;
		    System.out.println("el cociente del numero por 2 es " + resultado1);
		    resultado2 = numero % 3;
		    System.out.println("el cociente del numero por 3 es " + resultado2);
		    resultado3 = numero % 4;
		    System.out.println("el cociente del numero por 4 es " + resultado3);
		    
		            
		}
		        catch (Exception exc) {
		            System.out.println(exc);
		}	

	}
}