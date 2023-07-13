package EjerciciosProgramacion;

public class PiramidPattern {

	static void pattern(int piramidRows) {
		int i = 0;
		while(i < piramidRows) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		pattern(5);

	}

}
