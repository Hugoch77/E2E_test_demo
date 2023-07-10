package EjerciciosProgramacion;

import java.util.ArrayList;

public class SumOfElementsInArray {

	static int sumArrayList(ArrayList<Integer> array) {
		int suma = 0;
		for (int i : array) {
			suma = suma + i;
		}
		return suma;
	}
	
	static int sumArray(int array[]) {
		int suma = 0;
		for (int i : array) {
			suma = suma + i;
		}
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println("La suma de los numero del arrayList es: " + sumArrayList(arrayList));
		
		// --------------------------
		
		int array[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("La suma de los numero del array es: " + sumArray(array));
	}
	
}
