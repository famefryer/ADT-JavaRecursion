import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author paruj
 */
import java.util.*;

/**
 * The class that contains the method that permute the String by choosing length
 * of string per each.
 * 
 * @author Triwith Mutitakul
 *
 */
public class PermuteK {
	/**
	 * The method that use for permute the String by choosing length of string
	 * per each.
	 * 
	 * @param s
	 *            is the input String
	 * @param k
	 *            length of choosing String
	 * @return
	 */
	public static ArrayList<String> permuteK(String s, int k) {
		ArrayList<String> as = new ArrayList<String>();
		String sss;
		if (s.length() == 1) {
			as.add(s);
			return as;
		}
		ArrayList<String> ass = permuteK(s.substring(1), k);
		for (String ss : ass) {
			for (int i = 0; i < ss.length() + 1; i++) {
				sss = new String();
				sss += ss.substring(0, i) + s.substring(0, 1) + ss.substring(i, ss.length());
				as.add(sss);
			}
		}
		if (as.get(0).length() > k) {
			for (int i = 0; i < as.size(); i++) {
				String temp = as.get(i).substring(0, k);
				if (!as.contains(temp)) {
					as.add(temp);
				}
			}
			int i = 0;
			while (as.get(0).length() != k) {
				if (as.get(0).length() != k) {
					as.remove(0);
				}
			}
		}
		return as;
	}

	public static void main(String[] args) {
		ArrayList<String> as = permuteK("abde", 4);
		Collections.sort(as);
		for (int i = 0; i < as.size(); i++)
			System.out.println(as.get(i));
		System.out.println("Permutation size is " + as.size());
	}

}
