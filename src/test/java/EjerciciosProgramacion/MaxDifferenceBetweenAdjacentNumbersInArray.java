package EjerciciosProgramacion;

public class MaxDifferenceBetweenAdjacentNumbersInArray {
	
	// Comments
	
	static void maxDifference(int array[]) {
		int maxDifference = 0;
		int difference = 0;

		for (int i = 0; i < array.length; i++) {
			if (i + 1 == array.length) {
				break;
			} else {
				if ((array[i] > array[i + 1]) && (array[i] - array[i + 1] > maxDifference)) {
					difference = array[i] - array[i + 1];
					System.out.println("Difference between " + array[i] + " - " + array[i + 1] + " is: " + difference);
					maxDifference = difference;
				} else if ((array[i] < array[i + 1]) && (array[i+1] - array[i] > maxDifference)) {
					difference = array[i + 1] - array[i];
					System.out.println("Difference between " + array[i + 1] + " - " + array[i] + " is: " + difference);
					maxDifference = difference;
				}
			}
		}
		System.out.println("Max Difference between adjacent array values is: " + maxDifference);
	}

	public static void main(String[] args) {
		int arreglo[] = { 2, 6, 23, 41, 22, 10 };
		maxDifference(arreglo);
	}

}
