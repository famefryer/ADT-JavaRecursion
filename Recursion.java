import java.util.ArrayList;

public class Recursion {
	public static ArrayList<String> permuteK(String word, int num) {
		ArrayList<String> temp = new ArrayList<>();

		return null;
	}

	public static String helper(ArrayList<String> box, String wordCut, char first, int position, int num) {
		ArrayList<String> temp = new ArrayList<>();
		char[] word = wordCut.toCharArray();
		if (position >= wordCut.length()) {
			return "";
		}
		String wordTemp = "" + first + word[position];
		if (num == 0) {
			box.add(wordTemp);
		}
		return null;
	}

	public static ArrayList<String> testPermute(String word, int num) {
		ArrayList<String> temp = new ArrayList<>();
		int numWord = num;
		int round = 0;
		while(round>=word.length()){
			int position = 0;
			String cutOff = word.replace(word.charAt(round)+"","");
			while() {
				
			}
			
		}
		return null;
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	public static void main(String[] args) {
       permutation("abcd");
       System.out.println("cat".substring(0,));
	}

}
