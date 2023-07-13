package EjerciciosProgramacion;

public class MinAndMaxValMultiDimArray {
	
//	[	[1, 3, 21],
//	 	[41, 22, 12],
//	 	[5, 15, 19]		];
	
	void minAndMax(int array[][]) {
		int minVal = array[0][0];
		int maxVal = array[0][0];
		
		for(int i[] : array) {
			for(int j : i) {
				if(j < minVal) {
					minVal = j;
				}
				if(j > maxVal) {
					maxVal = j;
				}
			}
		}
		
		System.out.println("El valor Minimo en el arreglo es: " + minVal);
		System.out.println("El valor Maximo en el arreglo es: " + maxVal);
		
	}
	
	public static void main(String[] args) {

		MinAndMaxValMultiDimArray ejercicio = new MinAndMaxValMultiDimArray();
		int arreglo[][]= {	{110, 3, 21},
		            	 	{41, 22, 12},
		            	 	{5, 15, 19}		};
		
		ejercicio.minAndMax(arreglo);
		
	}
	
}
