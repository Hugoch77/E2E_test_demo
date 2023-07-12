package EjerciciosProgramacion;

import java.util.Arrays;

public class SortArrayAscDesc {

	private static void sortArrayASC(int array[]) {
		int sortedArrayASC[] = new int[array.length];
		int minValue = 0;

		for (int i = 0; i < array.length; i++) {
			minValue = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (minValue < array[j]) {
					continue;
				} else {
					minValue = array[j];
					array[j] = array[i];
					array[i] = minValue;
				}
			}
			sortedArrayASC[i] = minValue;
		}
		System.out.println("Asc sorted: " + Arrays.toString(sortedArrayASC));
	}
	
	private static void sortArrayDESC(int array[]) {
		int sortedArrayDESC[] = new int[array.length];
		int maxValue = 0;

		for (int i = 0; i < array.length; i++) {
			maxValue = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (maxValue > array[j]) {
					continue;
				} else {
					maxValue = array[j];
					array[j] = array[i];
					array[i] = maxValue;
				}
			}
			sortedArrayDESC[i] = maxValue;
		}
		System.out.println("Desc sorted: " + Arrays.toString(sortedArrayDESC));
	}

	public static void main(String[] args) {

		int array[] = { 1, 5, 2, 4, 3, 6, 12, 55, 23, 21 };
		sortArrayASC(array);
		sortArrayDESC(array);
	}
}
