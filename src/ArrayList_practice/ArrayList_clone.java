package ArrayList_practice;

import java.util.*;
public class ArrayList_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ranjeet");
		list.add("Vishwajit");
		list.add("Trupti");
		
		System.out.println("List =>" + list);
		
		ArrayList<String> Clonelist = (ArrayList<String>)list.clone();
		System.out.println("CloneList =>"+Clonelist);
	}

}
