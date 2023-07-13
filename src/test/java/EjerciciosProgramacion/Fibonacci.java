package EjerciciosProgramacion;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

	ArrayList<Integer> fibonacciSerie(int numberOfDigits) {
		ArrayList<Integer> serie = new ArrayList<Integer>();
		serie.add(0);
		serie.add(1);
		int i = 0;

		while (i < numberOfDigits - 2) {

			serie.add(serie.get(i) + serie.get(i + 1));

			i++;
		}

		return serie;
	}
	
	int[] fibonacciSerieArray(int numberOfDigits) {
		int serie[] = new int[numberOfDigits];
		serie[0] = 0;
		serie[1] = 1;
		int i = 2;

		while (i < numberOfDigits) {
			serie[i] = serie[i-2] + serie[i-1];
			i++;
		}

		return serie;
	}

	public static void main(String[] args) {
		Fibonacci ejercicio = new Fibonacci();
		System.out.println(ejercicio.fibonacciSerie(15));
		System.out.println(Arrays.toString(ejercicio.fibonacciSerieArray(10)));

	}

}
