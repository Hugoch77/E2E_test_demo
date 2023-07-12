package EjerciciosProgramacion;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayIndexes {

	private static ArrayList<Integer> compareArrays(int array1[], int array2[]){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i = 0 ; i < array1.length ; i++) {
			if (array1[i] == array2[i]) {
				newList.add(array1[i]);
			} else {
				continue;
			}
		}
		
		return newList;
	}
	
	private static int[] compareArrays2(int array1[], int array2[]){
		
		if(array1.length > array2.length) {
			int newList [] = new int[array2.length];
			for(int i = 0 ; i < array1.length ; i++) {
				if (array1[i] == array2[i]) {
					
					newList[i] = array1[i];
				} else {
					continue;
				}
			}
			return newList;
		} else {
			int newList [] = new int[array1.length];
			for(int i = 0 ; i < array1.length ; i++) {
				if (array1[i] == array2[i]) {
					
					newList[i] = array1[i];
				} else {
					continue;
				}
			}
			return newList;
		}
	}
	
	public static void main(String[] args) {

		int array1[] = {1,4,23,55,12,32,12};
		int array2[] = {11,42,23,551,12,322,12};

		System.out.println(compareArrays(array1, array2));
		System.out.println(Arrays.toString(compareArrays2(array1, array2)));
	}

}
