package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		// n-1 for first 10 (100 to 90)
		// n-2 for next 20 (90 to 70)
		// n-3 for next 30 (70 to 40)
		// n-4 for next 40 (40 to 0)

	for (int x = 100; x >= 1; x--) {
		if (x < 90) {
			x--;
		}
		if (x < 70) {
			x--;
		}
		if (x < 40) {
			x--;
		}

		System.out.print(x + ", ");

		}
	}


	}

