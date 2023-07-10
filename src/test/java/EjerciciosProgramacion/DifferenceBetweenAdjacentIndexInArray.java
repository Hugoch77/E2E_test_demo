package EjerciciosProgramacion;

import java.util.ArrayList;

public class DifferenceBetweenAdjacentIndexInArray {

	static void difference(int array[]) {
		int difference=0;
		
		for (int i = 0 ; i < array.length ; i++) {
			if(i+1 == array.length) {
				break;
			} else {
				if (array[i] > array[i+1]) {
					difference = array[i] - array[i+1];
					System.out.println("Difference between " + array[i] + " - " + array[i+1] + " is: " + difference);
				}
				else {
					difference = array[i+1] - array[i];
					System.out.println("Difference between " + array[i + 1] + " - " + array[i] + " is: " + difference);
				}
			}
			
		}
	}
	
	// Execution
	public static void main(String[] args) {
		int arreglo[] = {2,6,23,41,22,10};
		difference(arreglo);
	}
	
}
