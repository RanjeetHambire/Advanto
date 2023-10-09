package ArrayList_practice;

import java.util.*;

public class sorting {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(45);
		num.add(92);
		num.add(55);
		num.add(88);
		num.add(22);
		
		Collections.sort(num);  
		System.out.println(num);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Ranjeet");
		str.add("Vaishu");
		str.add("Manu");
		str.add("Laxmi");
		
		Collections.sort(str);
		System.out.println(str);
	}
}
