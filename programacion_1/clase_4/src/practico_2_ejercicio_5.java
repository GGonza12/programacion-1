import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_2_ejercicio_5 {

	public static void main(String[] args) {
		int dia, mes,numeroaureo, anio, resultado, resto, epacta, divida, calculo1, calculo2, calculo3, epacta1, edadlunar;

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese dia");
			dia = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese mes");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese año");
			anio = Integer.valueOf(entrada.readLine());

			calculo1 = (anio + 1);
			numeroaureo = (calculo1 % 19);

			calculo2 = ((numeroaureo - 1) * 11);
			epacta = (calculo2 % 30);

			switch (mes) {

			case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: {
				edadlunar= ((epacta + (mes - 2)) + dia);
				if (edadlunar > 29) {
					edadlunar = (edadlunar % 30);
				}
				if ((edadlunar >= 1) && (edadlunar <= 7)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna nueva");
				}
				if ((edadlunar >= 8) && (edadlunar <= 14)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna creciente");
				}
				if ((edadlunar >= 15) && (edadlunar <= 21)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna llena");
				}
				if ((edadlunar >= 22) && (edadlunar <= 29)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna megnuante");
				}

				break;
			}

			case 1: case 2:  {	
				edadlunar = ((epacta + (mes + 10) + dia));
				if (edadlunar > 29) {
					edadlunar = (edadlunar % 30);
				}
				if ((edadlunar >= 1) && (edadlunar <= 7)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna nueva");
				}
				if ((edadlunar >= 8) && (edadlunar <= 14)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna creciente");
				}
				if ((edadlunar >= 15) && (edadlunar <= 21)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna llena");
				}
				if ((edadlunar >= 22) && (edadlunar <= 29)) {
					System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + edadlunar  +  " desde la ultima luna nueva, por lo que la luna será luna megnuante");
				}

				break;


			}


			}
		}
			catch (Exception exc) {
				System.out.println(exc);
			}
		}
}