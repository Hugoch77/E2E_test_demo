package EjerciciosProgramacion;

public class CheckIfPrime {

	boolean isPrime(int numero) {
		boolean prime = true;

		// Numero primo solo es divisible etre si mismo y entre 1
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;
	}

	public static void main(String[] args) {

		CheckIfPrime ejercicio = new CheckIfPrime();
		int cantidadDeNumeros = 20;
		for(int i = 1; i <= cantidadDeNumeros; i++) {
			if(ejercicio.isPrime(i)) {
				System.out.println("El numero: " + i + " Es Primo");
			} else {
				System.out.println("El numero " + i + " No es Primo");
			}
		}
	}

}
