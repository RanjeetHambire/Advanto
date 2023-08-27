package recursion;

public class backtracking {
	public static void printPermutation(String str, String perm, int idx) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i < str.length(); i++) {
			char currentchar = str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i+1);
			printPermutation(newstr , perm + currentchar , idx + 1);
		}
	}
	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str, "", 0);

	}

}
