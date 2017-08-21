import java.util.ArrayList;

public class Pascal {
	static ArrayList<Double> cach = new ArrayList<>();

	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void pascal(int n) {
		int round = n;
		for(int i = 0;i<=n;i++) {
			for(int k = round;k>0;k--) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				System.out.print((factorial(i)/factorial(i-j)/factorial(j)));
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
