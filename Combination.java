import java.util.ArrayList;

/**
 * The class that contains the method that use for combination.
 * 
 * @author Triwith Mutitakul
 *
 */
public class Combination {
	static ArrayList<Double> cach = new ArrayList<>();

	/**
	 * The recursive method that use for calculate the factorial.
	 * 
	 * @param n
	 *            is the input number.
	 * @return result of factorial n.
	 */
	public static double factorial(int n) {
		if (n < cach.size()) {
			return cach.get(n - 1);
		}
		if (n == 1) {
			cach.add(1.0);
			return 1;
		}
		double num = 0;
		num = n * factorial(n - 1);
		if (cach.size() == n - 1) {
			cach.add(num);
		}
		return num;
	}

	/**
	 * The method that use for compute the combination.
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public static double Triple(int n, int k) {
		return factorial(n) / factorial(k) / factorial(n - k);
	}

	public static void main(String[] args) {
		System.out.println(Triple(13, 6));
		System.out.println(cach);
	}
}
