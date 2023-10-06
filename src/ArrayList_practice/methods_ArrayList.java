package ArrayList_practice;

import java.util.*;
public class methods_ArrayList {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
	
		
		list.add("Ranjeet");
		list.add("Vishwajit");
		list.add("Trupti");
		
		list.remove(0);
		list.add(0, "Ranjeet");
//		System.out.println(list.get(0));
		System.out.println(list.indexOf("Trupti"));
		System.out.println(list.size());
		list.set(1, "Vaishu");
		list.get(2);
		
		list.set(1, "Aditya");

		System.out.println(list);
	}
}
