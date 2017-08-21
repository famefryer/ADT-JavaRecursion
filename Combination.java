import java.util.ArrayList;

public class Combination {
	static ArrayList<Double> cach = new ArrayList<>();

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

	public static double Triple(int n, int k) {
		return factorial(n) / factorial(k) / factorial(n - k);
	}

	public static void main(String[] args) {
		System.out.println(Triple(15, 4));
		System.out.println(cach);
	}

}
