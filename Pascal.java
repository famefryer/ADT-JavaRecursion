import java.util.ArrayList;

/**
 * The class that contains the method that print the pascal's triangle.
 * 
 * @author Triwith mUtitakul
 *
 */
public class Pascal {
	static ArrayList<Double> cach = new ArrayList<>();

	/**
	 * The recursive method that use for calculate the factorial.
	 * 
	 * @param n
	 *            is the input number.
	 * @return result of factorial n.
	 */
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	/**
	 * The method that use for print each number of pascal's triangle.
	 * 
	 * @param n
	 */
	public static void pascal(int n) {
		int round = n;
		for (int i = 0; i <= n; i++) {
			for (int k = round; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print((factorial(i) / factorial(i - j) / factorial(j)));
				System.out.print(" ");
			}
			System.out.println();
			round--;
		}
	}

	public static void main(String[] args) {
		pascal(6);
	}

}
