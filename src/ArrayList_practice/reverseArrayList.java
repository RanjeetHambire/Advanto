package ArrayList_practice;

import java.util.*;
public class reverseArrayList {
	public static void main(String[] args) {
		List<String> rev =new ArrayList<String>();
		rev.add("Ranjeet");
		rev.add("Vaishu");
		rev.add("Manu");
		rev.add("Laxmi");
		
		Collections.reverse(rev);
		System.out.println(rev);
		
	}
}
