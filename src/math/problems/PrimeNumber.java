package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		// * Find list of Prime numbers from number 2 to 1 million.
		// * Try the best solution as possible.Which will take less CPU life cycle.
		// * Out put number of Prime numbers on the given range.
		// * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		int i;
		int num = 0;
		int maxNumber = 1000000;
		boolean numIsPrime = true;

		String primeNumbersFound = "";

		for (i = 2; i <= maxNumber; i++) {
			numIsPrime = CheckPrime(i);
			if (numIsPrime) {
				primeNumbersFound = primeNumbersFound + i + " ";

			}
		}
		System.out.println("Prime numbers from 1 to " + maxNumber + " are:");
		System.out.println(primeNumbersFound);
	}
	public static boolean CheckPrime (int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;

			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}

}
